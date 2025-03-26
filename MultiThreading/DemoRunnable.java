import java.util.Date;
class MyThread implements Runnable{
    long startNo;
    long endNo;
    public MyThread(long startNo, long endNo){
        this.startNo = startNo;
        this.endNo = endNo;
    }
    
    public void run(){
        long total = 0;
        Date dStart = new Date();
        for(long i=startNo;i<endNo;i++){
            total+=i;
        }
        Date dEnd = new Date();
        long ans = dEnd.getTime() - dStart.getTime();
        System.out.println("Total = "+total+ " in "+ans+" ms");
    }
}
public class DemoRunnable{
    public static void main(String[] args){
        MyThread mt1 = new MyThread(0,10);
        Thread t1 = new Thread(mt1);
        t1.start();
    }
}