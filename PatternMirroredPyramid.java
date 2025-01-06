import java.util.Scanner;

public class PatternMirroredPyramid{
    public static void main(String[] args){
        System.out.println("Please Enter Number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int k=0;k<n-1-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=n-2;i>=0;i--){
            for(int k=0;k<n-1-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}