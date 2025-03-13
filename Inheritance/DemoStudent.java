class Student{
    String name;
    int rollNo;
    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString(){
        return this.name + " - " + this.rollNo;
    }
}

public class DemoStudent{
    public static void main(String[] args){
        Student stu1 = new Student("arjun",101);
        Student stu2 = new Student("darshan",102);

        System.out.println(stu1);
        System.out.println(stu2);
    }
}