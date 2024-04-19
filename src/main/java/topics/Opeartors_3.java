package topics;

public class Opeartors_3 {

	public static void main(String[] args) {

		System.out.println("Arithmetic operators...");

		//Arithmetic operators (+,-,*,/,%,++,--)
		
		int a=10;
		int b=5;
		
		int c=2;
		int d=4;
		
		int e=4;
		int f=5;
		
		System.out.println(a+b);
		
		System.out.println(a-b);
		
		System.out.println(a*b);
		
		System.out.println(a/b);
		
		System.out.println(a%b);
		
		//++ increment operator
		
		System.out.println(++c);//3 (pre increment firstly increment then expression)
		
		System.out.println(c);//3
		
		System.out.println(d++);//4 (post increment firstly expression then increment)
		
		System.out.println(d);//5
		
		//-- decrement operator	
		
		
        System.out.println(--c);//2
		
		System.out.println(c);//2
		
		System.out.println(d--);//5
		
		System.out.println(d);//4
		
		System.out.println("Relation operators...");
		
		//Relation operators (=,<,>,<=,>=)
		
		System.out.println(a==b);//false
		
		System.out.println(a<b);//false
		
		System.out.println(a>b);//true
		
		System.out.println(a<=b);//false
		
		System.out.println(a>=b);//true
		
		System.out.println(a!=b);//true
		
		
		System.out.println("Assignment operators");
		
		//Assignment operators (a=b)
		
		int z=9;
		int y=10;
		
		System.out.println(z=y);// here we are assigning value of y in z
		
		System.out.println(z);
		
		System.out.println(y=z);// here we are assigning value of z in y
		
		System.out.println("Logical operators"); 
		
		
		//Logical operators(&&,||,!)
		
		boolean h=true;
		boolean n=false;
		boolean m=true;
		boolean o=false;
		
		
		System.out.println(h&&n);//false
		
		System.out.println(h&&m);//true
		
		System.out.println(n&&m);//false
		
		System.out.println(n&&o);//false
		
		
		System.out.println(h||n);//true
		
		System.out.println(h||m);//true
		
		System.out.println(n||o);//false
		
		
		System.out.println(!h);
		
		System.out.println(!n);
		
		String Messasge="Hello";
		
		String Lang="Java";
		
		System.out.println(Messasge +" "+Lang);//string concatenation
		
		
	}

}


