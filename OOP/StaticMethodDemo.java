class MyClass{
    static{
        System.out.println("From MyClass Static Block");
    }
    public static void justPrint(){
        System.out.println("justPrint method called");
    }
}
public class StaticMethodDemo{
    static MyClass m;
    static{
        m = new MyClass();
    }
    public static void main(String[] args){
        System.out.println("#");
        MyClass.justPrint();
        MyClass.justPrint();
        MyClass.justPrint();
        MyClass.justPrint();
    }
}