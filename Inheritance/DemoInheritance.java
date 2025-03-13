class Vehicle{
    Vehicle(){
        System.out.println("Vehicle Created");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Car Created");
    }
    Car(String name){
        this();
        System.out.println("Parameterized Car Created");
    }
}
class SUV extends Car{
    SUV(){
        System.out.println("SUV Created");
    }
    SUV(String name){
        super(name);
        System.out.println("Parameterized SUV Created");
    }
}
public class DemoInheritance{
    public static void main(String[] args){
        SUV c1 = new SUV("something");
    }
}