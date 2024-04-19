package topics;

public class IfElse_4 {

	public static void main(String[] args) {


		int a=10;
		int b=5;
		
		if(a>b)//single condition
			
		{   //if condition is true
			System.out.println("A is greater ");
		}
		
		else
		{    //if condition false
			System.out.println("B is greater");
		}
		
		int c=10;
		int d=5;
		
		if(c<d)//multiple condition
		{
			System.out.println("D is greater");
		}
		
		else if(c==d)
			
		{
			System.out.println("C is not equal d");
		}
			
		else if(c>d)
		{
			System.out.println("C is greater");
		}
		
		else
		{
			System.out.println("Neither A & B greater or nor a equal to b");
		}
		
		
		
		int e=10;
		int f=10;
		
		
		if(e<f)//multiple condition
		{
			System.out.println("F is greater");
		}
		
			
		else if(e>f)
		{
			System.out.println("E is greater");
		}
		
        else if(e==f)
			
		{
			System.out.println("E is not equal F");
		}
		
		else
		{
			System.out.println("Neither E & F greater");
		}
		
		
		int day=9;
		
		if(day==1)
		{
			System.out.println("Sunday");
		}
		
		else if(day==2)
			
		{
			System.out.println("Monday");
		}
		
		else if(day==3)
			
		{
			System.out.println("Tuesday");
		}
		
		else if(day==4)
			
		{
			System.out.println("Wenesday");
		}
		
		else if(day==5)
			
		{
			System.out.println("Thursday");
		}
		
		else if(day==6)
			
		{
			System.out.println("Friday");
		}
		
		else if(day==7)
			
		{
			System.out.println("Saturday");
		}
		
		else
		{
			System.out.println("No day Matched ...");
		}
		
	}

}
