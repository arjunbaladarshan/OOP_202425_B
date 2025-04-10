import java.io.*;
public class DemoCharacter{
    public static void main(String[] args){
        try{
            
            FileReader fr = new FileReader("abcd.txt");
            int a ;
            while((a=fr.read())!=-1){
                System.out.print((char)a);
            }


            FileWriter fw = new FileWriter("xyz.txt");
            fw.write("this is a message");
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}