import java.util.*;
class Stu{
    String name;
    double spi;
    public Stu(String name, double spi){
        this.name = name;
        this.spi = spi;
    }
    public String toString(){
        return("Name = "+name+" and SPI = "+spi);
    }
}

class SpiComparator implements Comparator<Stu>{
    public int compare(Stu s1, Stu s2){
        if(s1.spi>s2.spi){
            return 1;
        }
        else{
            return -1;
        }
    }
}

class NameComparator implements Comparator<Stu>{
    public int compare(Stu s1, Stu s2){
        return s1.name.compareTo(s2.name);
    }
}

public class DemoPriority{
    public static void main(String[] args){
        PriorityQueue<Stu> students = new PriorityQueue<Stu>(new SpiComparator());
        students.add(new Stu("arjun",2.5));
        students.add(new Stu("darshan",8.2));
        students.add(new Stu("rajkot",3.9));
        students.add(new Stu("bala",1.8));

        while(!students.isEmpty()){
            System.out.println(students.poll());
        }
        
    }
}