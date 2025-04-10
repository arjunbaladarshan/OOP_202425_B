import java.util.*;
class Stu{
    String name;
    double spi;
    public Stu(String name, double spi){
        this.name = name;
        this.spi = spi;
    }
}
public class DemoList{
    public static void main(String[] args){
        Scanner scString = new Scanner(System.in);
        Scanner scOther = new Scanner(System.in);
        LinkedList<String> al = new LinkedList<String>();

        while(true){
            System.out.println("Enter quit to quit or Enter Name to add");
            String temp = scString.nextLine();
            if(temp.equals("quit")){
                break;
            }
            al.add(temp);
        }
        while(true){
            System.out.println("===== Current Names Starts =====");

            // for(int i=0;i<al.size();i++){
            //     System.out.println(al.get(i));
            // }

            Iterator i = al.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }

            System.out.println("===== Current Names End =====");
            
            System.out.println("Enter 1 for ok\nEnter 2 for edit");
            int choice = scOther.nextInt();
            if(choice==1){
                System.out.println("Thank you");
                break;
            }
            else if(choice==2){
                System.out.println("Enter 1 to add\nEnter 2 for delete\nEnter 3 to sort");
                int choiceInner = scOther.nextInt();
                

                if(choiceInner==1){
                    System.out.println("Enter Name");
                    String newName = scString.nextLine();
                    al.add(newName);
                }
                else if(choiceInner==2){
                    System.out.println("Enter Name");
                    String newName = scString.nextLine();
                    al.remove(newName);
                }
                else if(choiceInner==3){
                    Collections.sort(al);
                }
            
            }
        }
    }
}