class Laptop{
    String modelName;
    double price;
    int ramSize;
    boolean isTouchScreen;

    public Laptop(  String modelName, 
                    double price, 
                    int ramSize, 
                    boolean isTouchScreen){
        this.modelName = modelName;
        this.price = price;
        this.ramSize = ramSize;
        this.isTouchScreen = isTouchScreen;
        System.out.println("Parameterized Contructor Called");
    }


}

public class LaptopDemo{
    public static void main(String[] args){
        Laptop lapy1 = new Laptop("HP OMEN",12.21,16,false);
       
        Laptop lapy2 = new Laptop("ASUS Vivobook",8.6,6,true);
        
        Laptop lapy3 = new Laptop("ASUS Vivobook 3",8.6,6,false);


        System.out.println("modelName of lapy1 = "+lapy1.modelName);
        System.out.println("ramSize of lapy2 = "+lapy2.ramSize);
        System.out.println("isTouchScreen of lapy3 = "+lapy3.isTouchScreen);

    }
}