import java.io.*;
public class DemoBuffer{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("StudentData.csv");
            BufferedReader br = new BufferedReader(fr);
            String temp ;
            
            while((temp = br.readLine())!=null){
                String[] data = temp.split(",");
                if(Double.parseDouble(data[3]) > 5){
                    System.out.println(data[0]);
                }
                
            }
            
            
        }catch(Exception e){}
    }
}