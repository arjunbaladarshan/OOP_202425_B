import java.util.Scanner;
public class DemoCollection{
    public static void main(String[] args){
        String[] names = new String[???????????];
        
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while(true){
            System.out.println("Enter quit or Enter Name");
            names[index] = new String();
            names[index] = sc.nextLine();

            if(names[index].equals("quit")){
                break;
            }

            index++;
        }

        for(int i=0;i<index;i++){
            System.out.println(names[i]);
        }
    }
}