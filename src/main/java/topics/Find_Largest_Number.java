package topics;

public class Find_Largest_Number {

	static int number[] = {21,98,13,9,34};
	
    public static void main(String[] args){
    	
        int maxNumber = findLargestNumber();
        System.out.println("Maximum number in the array: "+ maxNumber);
    }
    
    private static int findLargestNumber(){
    	
        int max = number[0];
        
        for(int i =0;i<number.length;i++){//5
        	
            if(number[i]>max)
            {
            	 max = number[i]; 
            }
            	
               
       }
        return max;
    }
}


