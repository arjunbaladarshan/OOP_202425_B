import java.util.Scanner;
public class BreakDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.println("Enter Marks = ");
            int temp = sc.nextInt();
            if(temp==-1){
                continue;
            }
            if(temp<-1){
                break;
            }
            total+= temp;
        }
        System.out.println("Total marks = "+total);
        

    }
}