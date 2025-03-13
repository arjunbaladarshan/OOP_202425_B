import java.util.Scanner;

interface Vehicle{
    int a = 10;
    public void turnLeft();
    public void turnRight();
    public void breakVehicle();
}

interface FourWheeler extends Vehicle{
    public void noOfAirBag();
}

abstract class Car implements FourWheeler{
    public void turnLeft(){
        System.out.println("Turning left");
    }
}

class Swift extends Car{
    
    public void turnRight(){
        System.out.println("Turning Right");
    }
    public void breakVehicle(){
        System.out.println("Stopping the Vehicle");
    }
    
    public void noOfAirBag(){
        System.out.println("two airbags");
    }

}

class Pulsar implements Vehicle{
    public void turnLeft(){
        System.out.println("Leaning to Left");
    }
    public void turnRight(){
        System.out.println("Leaning to Right");
    }
     public void breakVehicle(){
        System.out.println("Stopping the Pulsar");
    }
}

public class VehicleDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 1 for Swift or 2 for Pulsar");
        int temp = sc.nextInt();

        Vehicle vobj = null;

        if(temp==1){
            vobj = new Swift();
        }
        else if(temp==2){
            vobj = new Pulsar();
        }
        vobj.turnLeft();
        vobj.turnLeft();
        vobj.turnRight();
        vobj.turnLeft();
        vobj.breakVehicle();
        vobj.turnRight();
        System.out.println("Vehicle.a = "+Vehicle.a);
    }
}