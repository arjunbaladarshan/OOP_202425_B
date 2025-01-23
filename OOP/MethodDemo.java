class Faculty{
    String name;
    void getName(){
        System.out.println("Faculty Name "+name);
    }
}

public class MethodDemo{
    public static void main(String[] args){
        Faculty fac1 = new Faculty();
        fac1.name = "arjun";

        Faculty fac2 = new Faculty();
        fac2.name = "dharmiksir";

        Faculty fac3 = new Faculty();
        fac3.name = "gopi mam";

        fac1.getName();
        fac2.getName();
        fac3.getName();
    }
}