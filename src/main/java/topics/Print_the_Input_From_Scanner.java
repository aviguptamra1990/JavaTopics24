package topics;

import java.util.Scanner;

public class Print_the_Input_From_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter employee name");
		
		String Name= scan.nextLine(); 
			
		System.out.println("Name of the employee is : " + Name);

		
	}

}
