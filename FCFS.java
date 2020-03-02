/*
*@author Hyein Lee, Minji Jung
*@since 2019.12.20
*/
import java.util.Scanner;

//======================Process Setting======================
abstract class ProcessSetting{
  public int processname; //p1, p2, p3
  public int as; //���� ����, 1 or 2 or 3
  public int at; //���� �ð�, �ݵ�� ���� ������ �������
  public int pt; //�۾� �ð�
  public int wt; //��� �ð�
  public int it; //���μ����� �۵��� �ð�
  public int rt; //���� �ð�, pt-it
  public int responsetime;//��ȯ �ð�

  ProcessSetting(){};
  ProcessSetting(int pn,int as,int at,int pt){
    this.processname=pn;
    this.as=as;
    this.at=at;
    this.pt=pt;
  }
}

//======================MakeProcess=========================
class Mp1 extends ProcessSetting{             //���μ��� 1
  public Mp1(int pn, int as, int at, int pt){
    super(pn,as,at,pt);
  }
}
class Mp2 extends ProcessSetting{             //���μ��� 2
  public Mp2(int pn,int as, int at, int pt){
    super(pn,as,at,pt);
  }
}
class Mp3 extends ProcessSetting{             //���μ��� 3
  public Mp3(int pn, int as, int at, int pt){
    super(pn,as,at,pt);
  }
}

//=====================Queue==============================//
class Circular_Queue {

    int rear = 0;           //���� ��ȣ: 0
    int front = 0;          //���� ��ȣ: 0
    int maxsize = 0;        //�迭 ũ��
    ProcessSetting[] circular_Queue;  //���μ����� ����ִ� �迭

    public Circular_Queue(int maxsize){ //���ο� ť ������ ���
        this.maxsize = maxsize;         //�Է��� ũ���� ť ����
        circular_Queue = new ProcessSetting[this.maxsize];
    }

    public boolean EmptyCheck(){    //ť�� ������� Ȯ��
        if(rear == front){
            return true;
        }
        return false;
    }

    public boolean FullCheck(){      //ť�� ��á���� Ȯ��
        if((rear+1)%maxsize == front){  //����
            return true;
        }
        return false;   //�Ȳ���
    }

    public void EnQueue(ProcessSetting p){  //ť�� ���ο� ���μ��� ����
        if(FullCheck()){      //ť�� ��á����
            System.out.println("Queue is Full!!");
        }
        else{                 //ť�� ������ ���� ���
            rear = (rear+1) % maxsize;
            circular_Queue[rear]=p;
        }
    }

    public void nextPoint(){  //Dequeue�� ���� ���������� ��ȯ������ �ʰ� �����͸� �ű�� �Լ�

        if(EmptyCheck()){          //�迭�� ����ִ� ���
            System.out.println("empty!");
        }
        else  {                   //�迭�� ������� ���� ���, �����͸� �ű�(���� ����)
            front = (front+1)%maxsize;
        }
    }

    public ProcessSetting DeQueue(){  //Dequeue�Լ�, ���μ����� ��ȯ��
      front = (front+1)%maxsize;      //���� ����
      return circular_Queue[front];   //������ ���μ��� ��ȯ
    }
}
//======================Scheduling=========================
class Scheduling{

  Circular_Queue queue=new Circular_Queue(4);         //���μ��� ���� ť
  Circular_Queue finishQueue=new Circular_Queue(4);   //���μ����� ����Ǹ� ���� ť
  public static Mp1 p1;         //���μ��� 1
  public static Mp2 p2;         //���μ��� 2
  public static Mp3 p3;         //���μ��� 3
  public static int Time;       //��ü ���μ��� �ð�

  //---------------------------------------------------------------------------
  public void inputProcess(){ //���μ��� ���� �Է�
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){     //3���� ���μ��� ����
      System.out.print("\n");
      System.out.printf("Enter Arrival Sequence of Process(1 or 2 or 3) %d: ",i+1);
      int as = sc.nextInt();
      System.out.printf("Enter Arrival Time of Process (one process must be 0) %d: ",i+1);
      int at = sc.nextInt();
      System.out.printf("Enter Processing Time of Process %d: ",i+1);
      int pt = sc.nextInt();
      System.out.print("\n");

      if(i==0){                 //���μ��� 1
        p1=new Mp1(1,as,at,pt); //���μ��� ����, ���� �ð�, �۾� �ð� �Է�
        p1.rt=p1.pt;            //ó�� ���� �� ���μ��� ���� �ð�=���μ��� �۾� �ð�
        p1.wt=0;                //ó�� ���� �� ���ð��� 0
        p1.it=0;                //ó�� ���� �� ������ �ð��� 0
      }
      else if(i==1){            //���μ��� 2
        p2=new Mp2(2,as,at,pt); //���μ��� ����, ���� �ð�, �۾� �ð� �Է�
        p2.rt=p2.pt;            //ó�� ���� �� ���μ��� ���� �ð�=���μ��� �۾� �ð�
        p2.wt=0;                //ó�� ���� �� ���ð��� 0
        p2.it=0;                //ó�� ���� �� ������ �ð��� 0
      }
      else{                     //���μ��� 3
        p3=new Mp3(3,as,at,pt); //���μ��� ����, ���� �ð�, �۾� �ð� �Է�
        p3.rt=p3.pt;            //ó�� ���� �� ���μ��� ���� �ð�=���μ��� �۾� �ð�
        p3.wt=0;                //ó�� ���� �� ���ð��� 0
        p3.it=0;                //ó�� ���� �� ������ �ð��� 0
      }
    }
  }

//---------------------------------------------------------------------------
  public void inputQueue(){ //������ �� ���μ����� ����
    Scheduling sd=new Scheduling();
    sd.inputProcess();    //���μ��� ���� �Է¹���

    for (int i=1;i<=3;i++){
      if(p1.as==i){
        queue.EnQueue(p1);  //���μ��� 1 ����
      }
      else if(p2.as==i){
        queue.EnQueue(p2);  //���μ��� 2 ����
      }
      else{ //p3.as=i
        queue.EnQueue(p3);  //���μ��� 3 ����
      }
    }
  }

  //---------------------------------------------------------------------------
  public void startScheduling(){  //�����ٸ� ����
    System.out.println("==========Start==========");
    System.out.println("-----------------"+Time); //�ð� ���

    while(queue.rear!=queue.front){     //ť�� ������� ������
      if(queue.circular_Queue[(queue.front+1)%4].at<=Time){ //���μ����� ���� �ð��� ���� �ð����� ū ���, ���μ����� �������� �ʾҴٰ� �����ϰ� �������� �ʴ´�.
        queue.circular_Queue[(queue.front+1)%4].it += queue.circular_Queue[(queue.front+1)%4].rt; //���μ����� ����� �ð��� �̹� ���μ����� ����� �ð�(�̹��� ����� ���μ����� ���� �ð�)�� ���Ѵ�.
        if((queue.front+1)%4!=queue.rear){
          for(int k=2;k<=3;k++){  //�ٸ� ���μ����� ���ƺ��� 1�� Ȥ�� 2���ϰ���
            if((queue.rear+1)%4 != (queue.front+k)%4){  //���� ���μ����� ���� üũ
              queue.circular_Queue[(queue.front+k)%4].wt+=queue.circular_Queue[(queue.front+1)%4].rt; //���� ���μ����� ��� �ð��� �̹��� ����� ���μ����� ���� �ð�(�̹��� ����� ���μ����� ���� �ð�)��ŭ �߰�
            }
          }
        }

        Time+=queue.circular_Queue[(queue.front+1)%4].rt; //��ü �ð��� �̹��� ����� ���μ����� ���� �ð�(�̹��� ����� ���μ����� ���� �ð�)��ŭ �߰�

        queue.circular_Queue[(queue.front+1)%4].rt = queue.circular_Queue[(queue.front+1)%4].pt - queue.circular_Queue[(queue.front+1)%4].it; //�̹��� ����� ���μ����� ���� �ð�=��ü �۾� �ð� - ������� ����� �ð�
        finishQueue.EnQueue(queue.circular_Queue[(queue.front+1)%4]); //���μ����� �������Ǹ� ���� ť�� �̹��� ����� ���μ����� �߰�
        queue.circular_Queue[(queue.front+1)%4].responsetime=Time;    //���μ����� ��ȯ �ð��� ���μ����� ���� �ð��� ����
        //
        System.out.printf("1: %d %d %d\n",p1.wt,p1.it,p1.rt); //���μ��� 1�� ���ð�, ������ �ð�, ���� �ð� ���
        System.out.printf("2: %d %d %d\n",p2.wt,p2.it,p2.rt); //���μ��� 2�� ���ð�, ������ �ð�, ���� �ð� ���
        System.out.printf("3: %d %d %d\n",p3.wt,p3.it,p3.rt); //���μ��� 3�� ���ð�, ������ �ð�, ���� �ð� ���
        System.out.printf("process%d & finished!\n",queue.circular_Queue[(queue.front+1)%4].processname); //���μ��� (�̸�)�� �̹��� ����Ǿ� �������� ���
        System.out.println("-----------------"+Time); //�ð� ���
        //

        queue.nextPoint();//�̹� ���μ��� ����, ���� ���μ����� ť�� �������� �̵�
        finishQueue.nextPoint();//ť�� �������Ƿ� ���� ������� finishť�� �� ����
      }
      else{
        queue.EnQueue(queue.DeQueue());//���μ����� ���� �������� �ʾ����Ƿ� �ٽ� �� �ڷ� �ű�
      }
    }
    //finish while
    p1.wt-=p1.at; //���μ��� 1�� �������Ƿ�, ���� �ð��� ����Ͽ� ���ð� �ٽ� ���
    p2.wt-=p2.at; //���μ��� 2�� �������Ƿ�, ���� �ð��� ����Ͽ� ���ð� �ٽ� ���
    p3.wt-=p3.at; //���μ��� 3�� �������Ƿ�, ���� �ð��� ����Ͽ� ���ð� �ٽ� ���
    System.out.println("==========Finish==========\n\n");

    //���μ����� ������ ������� ���, �� ���μ����� ���� ���
    System.out.println("=================================================================================================================");
    System.out.printf("%-25s%-25s%-25s%-25s%-25s\n","Process name", "Arrival Sequence","Arrival Time","Processing Time","Wait Time");
    for(int j=1;j<=3;j++){
      System.out.printf("     %-20d       %-20d   %-20d     %-20d    %-20d\n",finishQueue.circular_Queue[j].processname,finishQueue.circular_Queue[j].as,finishQueue.circular_Queue[j].at,finishQueue.circular_Queue[j].pt,finishQueue.circular_Queue[j].wt);
    }
    System.out.println("=================================================================================================================");

    //��� ���
    System.out.println("\n\n\n=============Result=============");
    System.out.println("Whole Time: "+Time);  //3���� ���μ����� ��� �����µ��� �ɸ� �ð�
    System.out.printf("Average Waiting Time: %.4f\n", ((double)p1.wt+(double)p2.wt+(double)p3.wt)/3); //��� ��� �ð�
    System.out.printf("Average Response Time: %.4f\n",((double)p1.responsetime+(double)p2.responsetime+(double)p3.responsetime)/3); //��� ��ȯ �ð�
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
