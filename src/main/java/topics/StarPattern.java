package topics;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  /*
		     *
		     **
		     ***
		     ****
		    
		     
		   */
		
		
		for(int i=1; i<=4;i++)
			
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
		System.out.println("------------");
		
		/*
		 
		   ****
		   ***
		   **
		   *
		 
		 */
		
		
		for(int i=4; i>=1;i--)//row
		{
			
			
			for(int j=1;j<=i;j++)//column
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		
		System.out.println("----------------");
	      
	      /*
	            *       
	           **
	          ***
	         ****
	      
	       */
		
	
		
		
		
        /*
         1
         12
         123
         1234
         */
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print(j);
			}
			
			System.out.println(" ");
		}
		
		
      System.out.println("----------------");
		
		
		
        /*
        1234
        123
        12
        1
         */
      
      for(int i=4;i>=1;i--)//row
    	  
      {
    	  
    	  for(int j=1;j<=i;j++)//column
    	  {
    		  System.out.print(j);
    	  }
    	  
    	  System.out.println(" ");
    	  
      }
      
      System.out.println("----------------");
      
      /*
         1
         22
         333
         4444
       */
      
      for(int i=1; i<=5;i++)//1,2,3//row
			
		{
			
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(i);
			}
			
			System.out.println();
			
			
		}
      
      
      
  System.out.println("----------------");
      
      /*
         4444
         333
         22
         1
       */
      
      for(int i=4; i>0;i--)//row
			
		{
			
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(i);
			}
			
			System.out.println();
			
			
		}
		
      
        
	}

}
