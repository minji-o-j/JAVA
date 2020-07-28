/*
*@author Hyein Lee, Minji Jung
*@since 2019.12.20
*/
import java.util.Scanner;

//======================Process Setting======================
abstract class ProcessSetting{
  public int processname; //p1, p2, p3
  public int as; //Arrival Sequence, only 1,2,3
  public int at; //Arrival Time
  public int pt; //Processing Time, Working time
  public int wt; //Wait Time
  public int it; //Ing Time, the time which process used
  public int rt; //Rest Time ==pt-it
  public int responsetime;

  ProcessSetting(){};
  ProcessSetting(int pn,int as,int at,int pt){
    this.processname=pn;
    this.as=as;
    this.at=at;
    this.pt=pt;
  }
}

//======================MakeProcess=========================
class Mp1 extends ProcessSetting{
  public Mp1(int pn, int as, int at, int pt){
    super(pn,as,at,pt);
  }
}
class Mp2 extends ProcessSetting{
  public Mp2(int pn,int as, int at, int pt){
    super(pn,as,at,pt);
  }
}
class Mp3 extends ProcessSetting{
  public Mp3(int pn, int as, int at, int pt){
    super(pn,as,at,pt);
  }
}

//=====================Queue==============================//
class Circular_Queue {

    int rear = 0;            //start number is 0
    int front = 0;           //start number is 0
    int maxsize = 0;        //size of array
    ProcessSetting[] circular_Queue;          //array

    public Circular_Queue(int maxsize){
        this.maxsize = maxsize;
        circular_Queue = new ProcessSetting[this.maxsize];
    }

    public boolean EmptyCheck(){    //check array-->empty
        if(rear == front){
            return true;
        }
        return false;
    }

    public boolean FullCheck(){      //check array-->full
        if((rear+1)%maxsize == front){
            return true;
        }
        return false;
    }

    public void EnQueue(ProcessSetting p){
        if(FullCheck()){            //if array-->full
            System.out.println("Queue is Full!!");
        }
        else{                 //if array-->!full
            rear = (rear+1) % maxsize;
            circular_Queue[rear]=p;
        }
    }

    public void nextPoint(){

        if(EmptyCheck()){          //if array-->empty  return -1
            System.out.println("empty!");
            //return circular_Queue[front];//??
        }
        else  {              //if array-->!empty
            front = (front+1)%maxsize;
            //return circular_Queue[front];
        }
    }

    public ProcessSetting DeQueue(){
      front = (front+1)%maxsize;
      return circular_Queue[front];
    }
}
//======================Scheduling=========================
class Scheduling{

  Circular_Queue queue=new Circular_Queue(4);
  Circular_Queue finishQueue=new Circular_Queue(4);
  public static Mp1 p1;
  public static Mp2 p2;
  public static Mp3 p3;
  public static int Time;       //Whole Processing Time
  public static int Timeslice;

  //---------------------------------------------------------------------------
  public void inputProcess(){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      System.out.print("\n");
      System.out.printf("Enter Arrival Sequence of Process(1 or 2 or 3) %d: ",i+1);
      int as = sc.nextInt();
      System.out.printf("Enter Arrival Time of Process (one process must be 0) %d: ",i+1);
      int at = sc.nextInt();
      System.out.printf("Enter Processing Time of Process %d: ",i+1);
      int pt = sc.nextInt();
      System.out.print("\n");

      if(i==0){
        p1=new Mp1(1,as,at,pt);
        p1.rt=p1.pt;
        p1.wt=0;
        p1.it=0;
      }
      else if(i==1){
        p2=new Mp2(2,as,at,pt);
        p2.rt=p2.pt;
        p2.wt=0;
        p2.it=0;
      }
      else{
        p3=new Mp3(3,as,at,pt);
        p3.rt=p3.pt;
        p3.wt=0;
        p3.it=0;
      }
    }
  }

//---------------------------------------------------------------------------
  public void inputTimeslice(){
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter Timeslice: ");
    Timeslice = sc.nextInt();
  }

//---------------------------------------------------------------------------
  public void inputQueue(){
    Scheduling sd=new Scheduling();
    sd.inputTimeslice();
    sd.inputProcess();

    for (int i=1;i<=3;i++){
      if(p1.as==i){
        queue.EnQueue(p1);
      }
      else if(p2.as==i){
        queue.EnQueue(p2);
      }
      else{ //p3.as=i
        queue.EnQueue(p3);
      }
    }
  }

  //---------------------------------------------------------------------------
  public void startScheduling(){
    System.out.println("==========Start==========");
    System.out.println("-----------------"+Time);

    while(queue.rear!=queue.front){
      if(queue.circular_Queue[(queue.front+1)%4].rt<=Timeslice){  //finish'
        if(queue.circular_Queue[(queue.front+1)%4].at<=Time){
          queue.circular_Queue[(queue.front+1)%4].it += queue.circular_Queue[(queue.front+1)%4].rt;  //ing time+rt
          if((queue.front+1)%4!=queue.rear){
            for(int k=2;k<=3;k++){
              if((queue.rear+1)%4 != (queue.front+k)%4){
                queue.circular_Queue[(queue.front+k)%4].wt+=queue.circular_Queue[(queue.front+1)%4].rt;
              }
            }
          }

          Time+=queue.circular_Queue[(queue.front+1)%4].rt; //whole time=last whole time+rest time

          queue.circular_Queue[(queue.front+1)%4].rt = queue.circular_Queue[(queue.front+1)%4].pt - queue.circular_Queue[(queue.front+1)%4].it;//rt=pt-it
          finishQueue.EnQueue(queue.circular_Queue[(queue.front+1)%4]);
          queue.circular_Queue[(queue.front+1)%4].responsetime=Time;
          //
          System.out.printf("1: %d %d %d\n",p1.wt,p1.it,p1.rt);
          System.out.printf("2: %d %d %d\n",p2.wt,p2.it,p2.rt);
          System.out.printf("3: %d %d %d\n",p3.wt,p3.it,p3.rt);
          System.out.printf("process%d & finished!\n",queue.circular_Queue[(queue.front+1)%4].processname);
          System.out.println("-----------------"+Time);
          //

          queue.nextPoint();//move to next queue
          finishQueue.nextPoint();
        }
        else{
          queue.EnQueue(queue.DeQueue());//dequeue-->Enqueue
        }
      }
      /////////////////////////////////////////////////////////////////////////////////////////////////////////
      else{//rt>Timeslice
          if(queue.circular_Queue[(queue.front+1)%4].at<=Time){
            queue.circular_Queue[(queue.front+1)%4].it += Timeslice;
            System.out.printf("process%d!\n",queue.circular_Queue[(queue.front+1)%4].processname);

            if((queue.front+1)%4!=queue.rear){  //rest someting in queue
              for(int k=2;k<=3;k++){
                if((queue.rear+1)%4 != (queue.front+k)%4){
                  queue.circular_Queue[(queue.front+k)%4].wt+=Timeslice;
                }
              }
            }
            Time+=Timeslice;
            queue.circular_Queue[(queue.front+1)%4].rt = queue.circular_Queue[(queue.front+1)%4].pt - queue.circular_Queue[(queue.front+1)%4].it;

            //
            System.out.printf("1: %d %d %d\n",p1.wt,p1.it,p1.rt);
            System.out.printf("2: %d %d %d\n",p2.wt,p2.it,p2.rt);
            System.out.printf("3: %d %d %d\n",p3.wt,p3.it,p3.rt);
            System.out.println("-----------------"+Time);
            //

            queue.EnQueue(queue.DeQueue());//dequeue-->Enqueue
          }
          else{
            queue.EnQueue(queue.DeQueue());//dequeue-->Enqueue
          }
        }

    }
    //finish while
    p1.wt-=p1.at;
    p2.wt-=p2.at;
    p3.wt-=p3.at;
    System.out.println("==========Finish==========\n\n");

    System.out.println("=================================================================================================================");
    System.out.printf("%-25s%-25s%-25s%-25s%-25s\n","Process name", "Arrival Sequence","Arrival Time","Processing Time","Wait Time");
    for(int j=1;j<=3;j++){
      System.out.printf("     %-20d       %-20d   %-20d     %-20d    %-20d\n",finishQueue.circular_Queue[j].processname,finishQueue.circular_Queue[j].as,finishQueue.circular_Queue[j].at,finishQueue.circular_Queue[j].pt,finishQueue.circular_Queue[j].wt);
    }
    System.out.println("=================================================================================================================");

    System.out.println("\n\n\n=============Result=============");
    System.out.println("Whole Time: "+Time);
    System.out.printf("Average Waiting Time: %.4f\n", ((double)p1.wt+(double)p2.wt+(double)p3.wt)/3);
    System.out.printf("Average Response Time: %.4f\n",((double)p1.responsetime+(double)p2.responsetime+(double)p3.responsetime)/3);
    System.out.println("================================");
  }
}

//======================Main================================
public class RoundRobin2{

  public static void main(String[] args){

    Scheduling s=new Scheduling();
    s.inputQueue();
    s.startScheduling();

  }
}
