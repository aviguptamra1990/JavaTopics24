package topics;

public class Varibles_2 {
	
	  int i=50;//instance / global variable
	  
	  static int l=25; //static variable
	
	public static void main(String[] args)
	
	{
		 int j = 10;//local variable (declaration & initialization)
		 
		System.out.println(j);
		
		Varibles_2 var=new Varibles_2();
		var.localVariable1();
		
		
		
		
	}
	
	
	public void localVariable1()
	
	{
		int k=90;//local variable (declaration & initialization)
		System.out.println("Variable 'K' " + k);
		
		
	}
	
    public void localVariable2()
	
	{
		int g=910;//local variable (declaration & initialization)
		System.out.println("Variable 'G' " + g);
	}

}
