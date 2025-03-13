class AA{
    int rollNo = 101;
}
class BB extends AA{
    int rollNo = 301;
    public void printRollNo(int rollNo){
        System.out.println("super.rollNo = " + super.rollNo);
        System.out.println("this.rollNo =  " + this.rollNo);
        System.out.println("rollNo =       " + rollNo);
    }
}
public class SuperDemo{
    public static void main(String[] args){
        BB obj = new BB();
        obj.printRollNo(501);
    }
}