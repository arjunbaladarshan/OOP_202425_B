import java.util.Scanner;

public class DemoThis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String absents = "";

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
					absents += i +", ";
				}
			}
			catch(Exception e){
				i--;
				sc = new Scanner(System.in);
				// e.printStackTrace();
			}
			
			
		}
		System.out.println(absents);
	}
}
