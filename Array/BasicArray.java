import java.util.Scanner;
public class BasicArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter Marks = ");
            a[i] = sc.nextInt();
        }
        int total=0;
        for(int i=0;i<a.length;i++){
            total+= a[i];
        }
        System.out.println("Total = "+total);


    }
}