import java.io.File;
import java.util.*;
public class DemoFile{
    public static void main(String[] args){
        // System.out.println("Enter Name = ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        String name = "arjun";
        File f = new File(name);
        String[] files = f.list();
        for(int i=0;i<files.length;i++){
            File tempFile = new File(name,files[i]);
            if(tempFile.isDirectory()){
                System.out.println(files[i]);
            }
        }
    }
}