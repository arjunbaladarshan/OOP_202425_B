import java.util.*;
public class DemoStack{
    public static void main(String[] args){
        Stack<String> obj = new Stack<String>();

        obj.push("arjun");
        obj.push("darshan");
        obj.push("rajkot");
        obj.push("Gujarat");

        System.out.println("PEEK = "+obj.peek());
        while(!obj.isEmpty()){
            System.out.println("POP  = "+obj.pop());
            System.out.println(obj);
        }
        
    }
}