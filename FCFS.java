/*
*@author Hyein Lee, Minji Jung
*@since 2019.12.20
*/
import java.util.Scanner;

//======================Process Setting======================
abstract class ProcessSetting{
  public int processname; //p1, p2, p3
  public int as; //도착 순서, 1 or 2 or 3
  public int at; //도착 시간, 반드시 도착 순서를 맞춰야함
  public int pt; //작업 시간
  public int wt; //대기 시간
  public int it; //프로세스가 작동한 시간
  public int rt; //남은 시간, pt-it
  public int responsetime;//반환 시간

  ProcessSetting(){};
  ProcessSetting(int pn,int as,int at,int pt){
    this.processname=pn;
    this.as=as;
    this.at=at;
    this.pt=pt;
  }
}

//======================MakeProcess=========================
class Mp1 extends ProcessSetting{             //프로세스 1
  public Mp1(int pn, int as, int at, int pt){
    super(pn,as,at,pt);
  }
}
class Mp2 extends ProcessSetting{             //프로세스 2
  public Mp2(int pn,int as, int at, int pt){
    super(pn,as,at,pt);
  }
}
class Mp3 extends ProcessSetting{             //프로세스 3
  public Mp3(int pn, int as, int at, int pt){
    super(pn,as,at,pt);
  }
}

//=====================Queue==============================//
class Circular_Queue {

    int rear = 0;           //시작 번호: 0
    int front = 0;          //시적 번호: 0
    int maxsize = 0;        //배열 크기
    ProcessSetting[] circular_Queue;  //프로세스가 들어있는 배열

    public Circular_Queue(int maxsize){ //새로운 큐 생성시 사용
        this.maxsize = maxsize;         //입력한 크기의 큐 생성
        circular_Queue = new ProcessSetting[this.maxsize];
    }

    public boolean EmptyCheck(){    //큐가 비었는지 확인
        if(rear == front){
            return true;
        }
        return false;
    }

    public boolean FullCheck(){      //큐가 꽉찼는지 확인
        if((rear+1)%maxsize == front){  //꽉참
            return true;
        }
        return false;   //안꽉참
    }

    public void EnQueue(ProcessSetting p){  //큐에 새로운 프로세스 삽입
        if(FullCheck()){      //큐가 꽉찼으면
            System.out.println("Queue is Full!!");
        }
        else{                 //큐가 꽉차지 않은 경우
            rear = (rear+1) % maxsize;
            circular_Queue[rear]=p;
        }
    }

    public void nextPoint(){  //Dequeue와 같은 개념이지만 반환하지는 않고 포인터만 옮기는 함수

        if(EmptyCheck()){          //배열이 비어있는 경우
            System.out.println("empty!");
        }
        else  {                   //배열이 비어있지 않은 경우, 포인터만 옮김(원소 삭제)
            front = (front+1)%maxsize;
        }
    }

    public ProcessSetting DeQueue(){  //Dequeue함수, 프로세스를 반환함
      front = (front+1)%maxsize;      //원소 삭제
      return circular_Queue[front];   //삭제한 프로세스 반환
    }
}
//======================Scheduling=========================
class Scheduling{

  Circular_Queue queue=new Circular_Queue(4);         //프로세스 실행 큐
  Circular_Queue finishQueue=new Circular_Queue(4);   //프로세스가 종료되면 들어가는 큐
  public static Mp1 p1;         //프로세스 1
  public static Mp2 p2;         //프로세스 2
  public static Mp3 p3;         //프로세스 3
  public static int Time;       //전체 프로세스 시간

  //---------------------------------------------------------------------------
  public void inputProcess(){ //프로세스 정보 입력
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){     //3개의 프로세스 생성
      System.out.print("\n");
      System.out.printf("Enter Arrival Sequence of Process(1 or 2 or 3) %d: ",i+1);
      int as = sc.nextInt();
      System.out.printf("Enter Arrival Time of Process (one process must be 0) %d: ",i+1);
      int at = sc.nextInt();
      System.out.printf("Enter Processing Time of Process %d: ",i+1);
      int pt = sc.nextInt();
      System.out.print("\n");

      if(i==0){                 //프로세스 1
        p1=new Mp1(1,as,at,pt); //프로세스 순서, 도착 시간, 작업 시간 입력
        p1.rt=p1.pt;            //처음 시작 시 프로세스 남은 시간=프로세스 작업 시간
        p1.wt=0;                //처음 시작 시 대기시간은 0
        p1.it=0;                //처음 시작 시 실행한 시간은 0
      }
      else if(i==1){            //프로세스 2
        p2=new Mp2(2,as,at,pt); //프로세스 순서, 도착 시간, 작업 시간 입력
        p2.rt=p2.pt;            //처음 시작 시 프로세스 남은 시간=프로세스 작업 시간
        p2.wt=0;                //처음 시작 시 대기시간은 0
        p2.it=0;                //처음 시작 시 실행한 시간은 0
      }
      else{                     //프로세스 3
        p3=new Mp3(3,as,at,pt); //프로세스 순서, 도착 시간, 작업 시간 입력
        p3.rt=p3.pt;            //처음 시작 시 프로세스 남은 시간=프로세스 작업 시간
        p3.wt=0;                //처음 시작 시 대기시간은 0
        p3.it=0;                //처음 시작 시 실행한 시간은 0
      }
    }
  }

//---------------------------------------------------------------------------
  public void inputQueue(){ //시작할 때 프로세스를 넣음
    Scheduling sd=new Scheduling();
    sd.inputProcess();    //프로세스 정보 입력받음

    for (int i=1;i<=3;i++){
      if(p1.as==i){
        queue.EnQueue(p1);  //프로세스 1 넣음
      }
      else if(p2.as==i){
        queue.EnQueue(p2);  //프로세스 2 넣음
      }
      else{ //p3.as=i
        queue.EnQueue(p3);  //프로세스 3 넣음
      }
    }
  }

  //---------------------------------------------------------------------------
  public void startScheduling(){  //스케줄링 시작
    System.out.println("==========Start==========");
    System.out.println("-----------------"+Time); //시간 출력

    while(queue.rear!=queue.front){     //큐가 비어있지 않으면
      if(queue.circular_Queue[(queue.front+1)%4].at<=Time){ //프로세스의 도착 시간이 현재 시간보다 큰 경우, 프로세스가 도착하지 않았다고 가정하고 실행하지 않는다.
        queue.circular_Queue[(queue.front+1)%4].it += queue.circular_Queue[(queue.front+1)%4].rt; //프로세스가 진행된 시간에 이번 프로세스가 진행될 시간(이번에 진행될 프로세스의 남은 시간)을 더한다.
        if((queue.front+1)%4!=queue.rear){
          for(int k=2;k<=3;k++){  //다른 프로세스가 남아봤자 1개 혹은 2개일거임
            if((queue.rear+1)%4 != (queue.front+k)%4){  //남은 프로세스의 개수 체크
              queue.circular_Queue[(queue.front+k)%4].wt+=queue.circular_Queue[(queue.front+1)%4].rt; //남은 프로세스의 대기 시간에 이번에 실행된 프로세스의 실행 시간(이번에 실행된 프로세스의 남은 시간)만큼 추가
            }
          }
        }

        Time+=queue.circular_Queue[(queue.front+1)%4].rt; //전체 시간에 이번에 실행된 프로세스의 실행 시간(이번에 실행된 프로세스의 남은 시간)만큼 추가

        queue.circular_Queue[(queue.front+1)%4].rt = queue.circular_Queue[(queue.front+1)%4].pt - queue.circular_Queue[(queue.front+1)%4].it; //이번에 실행된 프로세스의 남은 시간=전체 작업 시간 - 현재까지 진행된 시간
        finishQueue.EnQueue(queue.circular_Queue[(queue.front+1)%4]); //프로세스가 끝났으므르 끝난 큐에 이번에 실행된 프로세스를 추가
        queue.circular_Queue[(queue.front+1)%4].responsetime=Time;    //프로세스의 반환 시간은 프로세스가 끝난 시간과 같음
        //
        System.out.printf("1: %d %d %d\n",p1.wt,p1.it,p1.rt); //프로세스 1의 대기시간, 수행한 시간, 남은 시간 출력
        System.out.printf("2: %d %d %d\n",p2.wt,p2.it,p2.rt); //프로세스 2의 대기시간, 수행한 시간, 남은 시간 출력
        System.out.printf("3: %d %d %d\n",p3.wt,p3.it,p3.rt); //프로세스 3의 대기시간, 수행한 시간, 남은 시간 출력
        System.out.printf("process%d & finished!\n",queue.circular_Queue[(queue.front+1)%4].processname); //프로세스 (이름)이 이번에 실행되어 끝났음을 출력
        System.out.println("-----------------"+Time); //시간 출력
        //

        queue.nextPoint();//이번 프로세스 끝남, 다음 프로세스로 큐의 시작지점 이동
        finishQueue.nextPoint();//큐가 끝났으므로 끝난 순서대로 finish큐에 들어갈 예정
      }
      else{
        queue.EnQueue(queue.DeQueue());//프로세스가 아직 도착하지 않았으므로 다시 맨 뒤로 옮김
      }
    }
    //finish while
    p1.wt-=p1.at; //프로세스 1이 끝났으므로, 도착 시간을 고려하여 대기시간 다시 계산
    p2.wt-=p2.at; //프로세스 2가 끝났으므로, 도착 시간을 고려하여 대기시간 다시 계산
    p3.wt-=p3.at; //프로세스 3이 끝났으므로, 도착 시간을 고려하여 대기시간 다시 계산
    System.out.println("==========Finish==========\n\n");

    //프로세스가 도착한 순서대로 출력, 그 프로세스의 정보 출력
    System.out.println("=================================================================================================================");
    System.out.printf("%-25s%-25s%-25s%-25s%-25s\n","Process name", "Arrival Sequence","Arrival Time","Processing Time","Wait Time");
    for(int j=1;j<=3;j++){
      System.out.printf("     %-20d       %-20d   %-20d     %-20d    %-20d\n",finishQueue.circular_Queue[j].processname,finishQueue.circular_Queue[j].as,finishQueue.circular_Queue[j].at,finishQueue.circular_Queue[j].pt,finishQueue.circular_Queue[j].wt);
    }
    System.out.println("=================================================================================================================");

    //결과 출력
    System.out.println("\n\n\n=============Result=============");
    System.out.println("Whole Time: "+Time);  //3개의 프로세스가 모두 끝나는데에 걸린 시간
    System.out.printf("Average Waiting Time: %.4f\n", ((double)p1.wt+(double)p2.wt+(double)p3.wt)/3); //평균 대기 시간
    System.out.printf("Average Response Time: %.4f\n",((double)p1.responsetime+(double)p2.responsetime+(double)p3.responsetime)/3); //평균 반환 시간
    System.out.println("================================");
  }
}

//======================Main================================
public class FCFS{

  public static void main(String[] args){

    Scheduling s=new Scheduling();
    s.inputQueue();
    s.startScheduling();

  }
}
