class SumThread extends Thread{
    int startNo, endNo, total=0;
    public SumThread(int startNo, int endNo){
        this.startNo = startNo;
        this.endNo = endNo;
    }
    public void run(){
        for(int i=startNo;i<endNo+1;i++){
            total += i;
            try{
                sleep(100);
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
}
public class DemoJoin{
    public static void main(String[] args){
        SumThread st1 = new SumThread(0,10);
        st1.start();

        SumThread st2 = new SumThread(11,30);
        st2.start();

        try{
            st1.join();
            st2.join();
        }catch(Exception e){}

        System.out.println("Total of st1 = "+st1.total);
        System.out.println("Total of st2 = "+st2.total);
        System.out.println("Final Total = "+(st1.total+st2.total));
    }
}