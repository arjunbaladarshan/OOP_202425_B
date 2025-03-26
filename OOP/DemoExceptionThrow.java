import java.util.Scanner;
import java.util.InputMismatchException;
public class DemoExceptionThrow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Marks Obtained");
            int obtainedMarks = sc.nextInt();
            System.out.println("Enter Marks Total");
            int totalMarks = sc.nextInt(); 

            int percentage = (obtainedMarks / totalMarks) * 100;
            System.out.println("Percentage = "+percentage);            
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        finally{
            sc.close();
            System.out.println("Scanner Closed");
        }
        
        
        System.out.println("Byyyeeee.....");
    }
}