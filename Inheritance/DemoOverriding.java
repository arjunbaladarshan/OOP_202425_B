class AA{
    public void printMe(){
        System.out.println("Hello printMe() from Class AA");
    }
}
class BB extends AA{
    protected void printMe(){
        System.out.println("Hello printMe() from Class BB");
    }
}
public class DemoOverriding{
    public static void main(String[] args){
        BB obj = new BB();
        obj.printMe();
    }
}