package topics;

public class Swap_two_Numbers_Without_Using_Third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5; int y=10;
		
		System.out.println("Before swapping \n x=" + x + "\n y=" + y);
	
		x=x+y;//15
		y=x-y;//5
		x=x-y;//10
		
		System.out.println("After swapping \n x=" + x + "\n y=" + y);

	}

}
