import java.util.concurrent.*;
class Thread1 implements Runnable{
    String name;
    public Thread1(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread "+name+" is running = "+i);
            try{
                Thread.sleep(300);
            }catch(Exception e){

            }
        }
        System.out.println("Thread "+name+" completed");
    }
}
public class DemoExecutorNew{
    public static void main(String[] args){
        Runnable r1 = new Thread1("T1");
        Runnable r2 = new Thread1("T2");
        Runnable r3 = new Thread1("T3");
        Runnable r4 = new Thread1("T4");
        Runnable r5 = new Thread1("T5");

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();
    }
}