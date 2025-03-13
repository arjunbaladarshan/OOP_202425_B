import java.util.Scanner;
class Vehicle{
    void breaking(){
        System.out.println("Breaking with any technique");
    }
}
class Cycle extends Vehicle{
    void breaking(){
        System.out.println("Press break with hand");
    }
}
class Car extends Vehicle{
    void breaking(){
        System.out.println("Press break with leg");
    }
}
public class OverridingDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 1 for Cycle or 2 for Car");
        int temp = sc.nextInt();
        Vehicle vObj;
        if(temp==1){
            vObj = new Cycle();
        }
        else if(temp==2){
            vObj = new Car();
        }
        else{
            vObj = new Vehicle();
        }

        boolean ans = vObj instanceof Car;

        System.out.println("Ans = "+ans);
        
        vObj.breaking();

    }
}