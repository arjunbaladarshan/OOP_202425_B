class MyThread extends Thread{
    String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        int i=0;
        while(true){
            i++;
            System.out.println("Thread "+name +", I = "+i);
            // try{
            //     sleep(10);
            // }catch(Exception e){
            //     e.printStackTrace();
            // }
        }
    }
}
public class DemoPriority{
    public static void main(String[] args){
        MyThread mt1 = new MyThread("T1");
        MyThread mt2 = new MyThread("T2");

        mt1.setPriority(1);
        mt2.setPriority(10);

        mt1.start();
        mt2.start();
    }
}