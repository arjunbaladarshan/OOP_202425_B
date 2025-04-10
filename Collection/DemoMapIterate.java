import java.util.*;
public class DemoMapIterate{
    public static void main(String[] args){
        HashMap<Integer, String> obj = new HashMap<Integer, String>();

        obj.put(101,"arjun");
        obj.put(102,"darshan");
        obj.put(103,"rajkot");

        for(Integer temp:obj.keySet()){
            System.out.println(obj.get(temp));
        }
    }
}