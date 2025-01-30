class Car{
    String model;
    int price;
    static String parkingAt = "CBlock";

    public Car(String model, int price){
        this.model = model;
        this.price = price;
    }
}

public class StaticDemo{
    public static void main(String[] args){
        Car c1 = new Car("Swift",101);
        Car c2 = new Car("BMW",78);
        Car c3 = new Car("AUDI",87);

        Car.parkingAt = "DBlock";
        c1.parkingAt = "DBlock";
        c2.parkingAt = "DBlock";
        c3.parkingAt = "DBlock";
        
        System.out.println("Car C1 will be parked at = "+c1.parkingAt);
        System.out.println("Car C2 will be parked at = "+c2.parkingAt);

    }
}