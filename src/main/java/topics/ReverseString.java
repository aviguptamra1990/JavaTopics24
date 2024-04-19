package topics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lang="Java";
		
		for(int i=0;i<=lang.length()-1;i++)//forward string
			
		{
			System.out.println(lang.charAt(i));
		}
	
		System.out.println("----------------");
		
	
		for(int j=lang.length()-1;j>=0;j--)
		{
			System.out.println(lang.charAt(j));
		}

	}

}
