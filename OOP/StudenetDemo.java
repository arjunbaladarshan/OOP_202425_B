class Student{
    String name;
    int rollNo;
    double spi;

    public Student(){
        name = "No Name Specified";
        rollNo = -1;
        spi = -1.0;
    }

    public Student(String name){
        this();
        this.name = name; 
    }

    public Student(String name, int rollNo){
        this(name); 
        this.rollNo = rollNo;
    }
    public Student(String name, double spi){
        this(name);
        this.spi = spi;
    }
    public Student(String name, int rollNo, double spi){
        this(name); 
        this.rollNo = rollNo;
        this.spi = spi;
    }


    public void printStudent(){
        System.out.println("Name = "+name + " and rollNo = "+rollNo);
    }

}
public class StudenetDemo{
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.printStudent();

        Student stu2 = new Student("arjun");
        stu2.printStudent();

        Student stu3 = new Student("arjun", 101);
        stu3.printStudent();
    }
}