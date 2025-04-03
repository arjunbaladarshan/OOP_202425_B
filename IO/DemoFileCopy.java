import java.io.*;
public class DemoFileCopy{
    public static void main(String[] agrs){
        try{
            FileInputStream fis = new FileInputStream("NMG.jpg");
            FileOutputStream fos = new FileOutputStream("NMG_Updated.jpg");
            int temp;
            String msg = "secret";
            int counter = 0;
            while((temp = fis.read())!=-1){
                counter++;
                if(counter==1000){
                    fos.write(msg.getBytes());
                }
                fos.write(temp);
            }
            fis.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}