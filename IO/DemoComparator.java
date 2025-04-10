import java.util.*;
class Stu{
    String name;
    double spi;
    public Stu(String name, double spi){
        this.name = name;
        this.spi = spi;
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

public class DemoComparator{
    public static void main(String[] args){
        ArrayList<Stu> students = new ArrayList<Stu>();
        students.add(new Stu("arjun",2.5));
        students.add(new Stu("darshan",8.2));
        students.add(new Stu("rajkot",3.9));
        students.add(new Stu("bala",1.8));

        System.out.println("Before = ");
        Iterator<Stu> iBefore = students.iterator();
        while(iBefore.hasNext()){
            Stu temp = iBefore.next();
            System.out.println("Name = "+temp.name+", SPI = "+temp.spi);
        }
        Collections.sort(students, new SpiComparator());
        System.out.println("After = ");
        Iterator<Stu> iAfter = students.iterator();
        while(iAfter.hasNext()){
            Stu temp = iAfter.next();
            System.out.println("Name = "+temp.name+", SPI = "+temp.spi);
        }
        
    }
}