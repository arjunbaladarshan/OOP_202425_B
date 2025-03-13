class OuterClass{
    private int a = 12;
    class InnerClass{
        public void printA(){
            System.out.println(a);
        }
    }
}

public class DemoNestedClass{
    public static void main(String[] args){
        OuterClass objOuter = new OuterClass();
        OuterClass.InnerClass objInner = objOuter.new InnerClass();
        objInner.printA();
    }
}