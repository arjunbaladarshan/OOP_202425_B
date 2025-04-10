import java.util.*;
class Stu{
    String name;
    double spi;
    int rollNo;
    public Stu(String name, double spi, int rollNo){
        this.name = name;
        this.spi = spi;
        this.rollNo = rollNo;
    }
    public String toString(){
        return("Roll = "+rollNo+", Name = "+name+" and SPI = "+spi);
    }
}

public class DemoMap{
    public static void main(String[] args){
        // HashMap<Integer, Stu> students = new HashMap<Integer, Stu>();
        // students.put(101,new Stu("arjun",2.5,101));
        // students.put(102,new Stu("darshan",8.2,102));
        // students.put(103,new Stu("rajkot",3.9,103));
        // students.put(104,new Stu("bala",1.8,104));

        HashMap<Integer,Stu> students = new HashMap<Integer,Stu>();
        for(int i=101;i<15000000;i++){
            String name = ((char)((int)(Math.random()*26)+97))+""+((char)((int)(Math.random()*26)+97))+""+((char)((int)(Math.random()*26)+97))+""+((char)((int)(Math.random()*26)+97))+""+((char)((int)(Math.random()*26)+97));
            students.put(i,new Stu(name,Math.random()*10,i));
        }
        
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no ");
        int r = sc.nextInt();

        // Iterator<Stu> i = students.iterator();
        // while(i.hasNext()){
        //     Stu temp = i.next();
        //     if(temp.rollNo==r){
        //         System.out.println(temp);
        //         break;
        //     }
        // }

        System.out.println(students.get(r));
        
    }
}