package topics;

public class MultiDimensionArrays_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] rollNo= {{2,4},{6,8},{10,12}};
		
		System.out.println("total no of rows : " + rollNo.length);// no of rows
		
		System.out.println("total no of columns : " + rollNo[0].length);
		
		System.out.println(rollNo[0][1]);//  to read 0th row and 1st column element or value of array
		
		System.out.println(rollNo[2][1]);//  to read 2nd row and 1st column element or value of array
		
		for(int i=0;i<rollNo.length;i++)//1,2
			
		{
			for(int j=0;j<rollNo[0].length;j++)
			{
				System.out.println(rollNo[i][j]);
			}
		}

	}

}
