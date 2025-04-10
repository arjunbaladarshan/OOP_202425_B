import java.util.Scanner;
import java.io.*;
public class DemoScanner{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("StudentData.csv");
            Scanner sc = new Scanner(fr);
            String name = sc.nextLine();

            PrintStream ps = new PrintStream(new File("StudentNew.csv"));
            ps.println("Output = "+name);
            ps.close();
        }catch(Exception e){}
    }
}