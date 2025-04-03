class Table{
    public void printTable(int n){
        for(int i=1;i<11;i++){
            System.out.print(n);
            try{
                Thread.sleep(20);
            }catch(Exception e){}
            System.out.print(" x ");
            try{
                Thread.sleep(20);
            }catch(Exception e){}
            System.out.print(i);
            try{
                Thread.sleep(20);
            }catch(Exception e){}
            System.out.print(" = ");
            try{
                Thread.sleep(20);
            }catch(Exception e){}
            System.out.println(n*i);
            try{
                Thread.sleep(20);
            }catch(Exception e){}
        }
    }
}
class PrintTableThread extends Thread{
    Table t;
    int n;
    public PrintTableThread(Table t, int n){
        this.t = t;
        this.n = n;
    }
    public void run(){
        synchronized(t){
            t.printTable(n);
        }
        
    }
}
public class DemoSync{
    public static void main(String[] args){
        Table t = new Table();
        PrintTableThread ptt1 = new PrintTableThread(t,5);
        ptt1.start();

        PrintTableThread ptt2 = new PrintTableThread(t,7);
        ptt2.start();

        PrintTableThread ptt3 = new PrintTableThread(t,9);
        ptt3.start();
        
    }
}