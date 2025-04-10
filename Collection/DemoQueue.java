import java.util.*;
public class DemoQueue{
    public static void main(String[] args){
        Queue<String> obj = new LinkedList<String>();

        obj.add("arjun");
        obj.add("darshan");
        obj.add("rajkot");
        obj.add("Gujarat");

        // System.out.println("PEEK = "+obj.peek());

        while(!obj.isEmpty()){
            System.out.println("POLL = "+obj.poll());
            System.out.println(obj);
        }
        
    }
}