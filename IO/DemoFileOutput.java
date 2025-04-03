import java.io.FileOutputStream;
public class DemoFileOutput{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("xyz.txt");
            String name = "this is new data";
            fos.write(name.getBytes());
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}