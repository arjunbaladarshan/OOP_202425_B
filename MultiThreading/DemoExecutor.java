class Abc extends Thread implements Runnable{
    String name;
    int counter=0;
    public Abc(String name){
        this.name = name;
    }
    public void run(){
        while(true){
            counter++;
            System.out.println("Thread "+name+" is running ="+counter);
            try{
                sleep(500);
            }catch(Exception e){}
        }
    }
}
public class DemoExecutor{
    public static void main(String[] args){
        Abc a1 = new Abc("T1");
        Abc a2 = new Abc("T2");
        Abc a3 = new Abc("T3");
        Abc a4 = new Abc("T4");
        Abc a5 = new Abc("T5");
        Abc a6 = new Abc("T6");

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();
           
    }
}