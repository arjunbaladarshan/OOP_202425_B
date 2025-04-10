import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class DemoThis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> absents = new ArrayList<Integer>();

		double spi = 12.3;

		for(int i=301;i<428;i++) { //428
			System.out.print("Is "+i+" Present =");
			try{
				int present = sc.nextInt();
				if(present<0 || present>1){
					throw new Exception();
				}
				System.out.println("");
				if(present==0) {
					absents.add(i);
				}
			}
			catch(Exception e){
				i--;
				sc = new Scanner(System.in);
				// e.printStackTrace();
			}
			
			
		}
		while(true){
			System.out.println("Current = "+absents);
			System.out.println("Enter 1 if ok\nEnter 2 to change");
			int choice = sc.nextInt();
			if(choice==1){
				try{
					PrintWriter pw = new PrintWriter(new File("AbsentStudent.txt"));
					pw.println(absents.toString());
					pw.close();
				}catch(Exception e){}
				break;
			}
			else if(choice==2){
				System.out.println("Enter 1 to mark present\nEnter 2 to mark Absent");
				int choiceInner = sc.nextInt();
				System.out.println("Enter Rollno");
				Integer temp = sc.nextInt();
				if(choiceInner==1){
					absents.remove(temp);
				}
				else if(choiceInner==2){
					absents.add(temp);
				}
			}
		}
	}
}
