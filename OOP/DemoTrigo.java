/*
    WAP in java to calculate the height 
    of the building using the distance and the
    angle, which was taken as input from user.
*/
import java.util.Scanner;
public class DemoTrigo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Distance =");
        double distance = sc.nextDouble();
        System.out.println("Please enter Angle =");
        double theta = sc.nextDouble();
        theta = Math.toRadians(theta);
        double standHeight = 2;
        double ans = distance * Math.tan(theta) + standHeight;
        System.out.println("Height of the building = "+ans);
    }

}