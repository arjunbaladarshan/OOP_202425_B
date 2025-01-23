class Student{
    int rollNo;
    String name;

    public void printName(){
        System.out.println("My Name is = "+name);
    }

    public void walk(int n){
        System.out.println(name + " is walking");
        for(int i=0;i<n;i++){
            System.out.print("# ");
        }
        System.out.println("");
    }
}

public class StudentDemo{
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.name = "Heet Zalavadiya";
        stu1.rollNo = 330;

        Student stu2 = new Student();
        stu2.name = "Kavya Vyas";
        stu2.rollNo = 335;

        Student stu3 = new Student();
        stu3.name = "Padia Kartik";
        stu3.rollNo = 340;

        Student stu4 = new Student();
        stu4.name = "Yashvi Ghadiya";
        stu4.rollNo = 345;



        stu1.walk(2);
        stu2.walk(5);
        stu3.walk(3);
        stu4.walk(1);
        

    }
}