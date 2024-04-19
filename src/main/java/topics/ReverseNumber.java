package topics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number="Java";
		
		//int convert=String.valueOf(number).length();
		
		for(int i=0;i<=number.length();i++)//forward string
			
		{
			System.out.println(i);
		}
		
		
		System.out.println("-------------");
		
		
       for(int j=number.length();j>=0;j--)//Reverse string
			
		{
			System.out.println(j);
		}

	}

}
