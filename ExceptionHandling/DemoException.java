import java.util.Scanner;
import java.util.*;
import java.io.*;
public class DemoException{
    public static void main(String[] args){
        int a, b;
        double c;
        int[] arr = new int[1];
        Scanner sc = new Scanner(System.in);
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("asdf"));
        }catch(Exception e){
            //sadfasdfasdf asdf asdf 
        }
        
        
        System.out.println("Enter A = ");
        a = sc.nextInt();

        System.out.println("Enter B = ");
        b = sc.nextInt();

        c = a / b;

        System.out.println("Answer = "+c);
       
        
        System.out.println("Thank you");

    }
}