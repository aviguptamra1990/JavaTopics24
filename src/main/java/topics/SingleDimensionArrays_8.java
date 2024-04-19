package topics;

public class SingleDimensionArrays_8 {

	public static void main(String[] args) {
		
		
		int [] rollNo= {10,20,30,40,50}; //declaration,initilization and insert value in array
		
		System.out.println(rollNo.length);// to count length of array
		
		System.out.println(rollNo[2]);// to read 3rd element value of array
		
		
		for(int ele : rollNo)
		{
			System.out.println("Total element value of Arrays through for each loop : " + ele);
		}
		
		
		for(int i=0;i<=rollNo.length-1;i++)
			
		{
			System.out.println("Total element value of Arrays through for loop : " + rollNo[i]);
		}
		
		
		
		
	}

}
