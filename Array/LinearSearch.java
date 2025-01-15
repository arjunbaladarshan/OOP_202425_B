import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        int[] data = new int[9];
        data[0] = 5;
        data[1] = 2;
        data[2] = 9;
        data[3] = 3;
        data[4] = 4;
        data[5] = 1;
        data[6] = 8;
        data[7] = 6;
        data[8] = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to search");
        int n = sc.nextInt();

        boolean isFound = false;

        for(int i=0;i<data.length;i++){
            if(data[i]==n){
                System.out.println("Found at index "+i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Not Found");
        }
    }
}