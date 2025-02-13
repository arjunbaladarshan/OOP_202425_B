import java.util.Scanner;
public class StringDemo{
    public static void main(String[] args){
        String data = "Darshan University (DU), is a prominent organization offering a broad slate of academic programs and professional courses for undergraduate, graduate and postgraduate programs in Engineering, Science & Technology. The University is located in peaceful and sylvan surroundings with distinctive collegiate structure, about 19 km from Rajkot, Gujarat, India. It was established as an Engineering Institute in the year 2009, by Shree G. N. Patel Education & Charitable Trust with the objective to impart quality education and training in various fields of Engineering and Technology. It has now been transformed to the DARSHAN UNIVERSITY through an Act by the Government of Gujarat under Gujarat State Private Universities (Amendment) Act, 2021 (Act no. 15).";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter search text");
        String searchText = sc.nextLine();
        int lastIndex = -1;
        while(true){
            lastIndex = data.indexOf(searchText,lastIndex+1);
            if(lastIndex==-1){
                break;
            }
            System.out.println(lastIndex);
        }
        
    }

}