import java.util.Date;
class AddNumberThread extends Thread{
    long startNo;
    long endNo;
    public AddNumberThread(long startNo, long endNo){
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
public class DemoThread{
    public static void main(String[] args){
       AddNumberThread ant1 = new AddNumberThread(0,10000000000l);
       ant1.start();
       AddNumberThread ant2 = new AddNumberThread(10000000001l,20000000000l);
       ant2.start();
    }
}