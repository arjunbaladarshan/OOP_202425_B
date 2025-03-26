/*
    WAP in java to print Hello world every 5 seconds
    and print current time after every 5 minutes

*/
import java.util.Date;
class PrintHelloThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello world");
            try{
                sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class PrintTimeThread extends Thread{
    public void run(){
        while(true){
            System.out.println(new Date());
            try{
                sleep(1000 * 60 * 5);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ExamProgram{
    public static void main(String[] args){
        PrintHelloThread pht = new PrintHelloThread();
        PrintTimeThread ptt = new PrintTimeThread();

        pht.start();
        ptt.start();
    }
}