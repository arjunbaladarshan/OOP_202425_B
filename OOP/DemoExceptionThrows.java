class MyOwnException extends Exception{
    public MyOwnException(String errMsg){
        super(errMsg);
    }
}
public class DemoExceptionThrows{
    public static void main(String[] args){
        method2();
    }
    public static void method2() throws Exception{
        method1();
    }
    public static void method1() throws Exception{
        //some code which may throw Exception
        throw new MyOwnException("Demo Exception");
    }
}