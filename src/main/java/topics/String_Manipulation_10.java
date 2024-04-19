package topics;

public class String_Manipulation_10 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		char[] str={'h','e','l','l','o'};
		String chars=new String(str);// 1st method to create string
	    System.out.println(chars);
	    
	    System.out.println("GIT");
	    
	    String Name="Avi Gupta";//2nd method to create string
	    System.out.println(Name);
	    
	    
	    
	    System.out.println(Name.charAt(2));//to fetch particular string index value
	    
	    System.out.println(Name.length());//To calculate length of string
	    
	    System.out.println(Name.toLowerCase());// to convert in lowercase
	    
	    System.out.println(Name.toUpperCase());// to convert in uppercase
	    
	//    System.out.println(Name.replace("G", "Gupta"));//to remove old string char replace with new string char
	    
	 //   System.out.println(Name.indexOf('G'));//to fetch particular char index
	    
	//    System.out.println(Name.substring(2));//to fetch string char from particular index
	    
	    System.out.println(Name.substring(4, 9));//to fetch string char from particular index to till given index -1
	
	    System.out.println(Name.contains("Gupta"));//to check substring in string
	    
	    String trim=" Java   ";
	    
	    System.out.println(trim.trim());//to remove spaces from right and left hand side
	    
	    System.out.println(trim.startsWith("J"));//to check string is start with given char
	    
	    System.out.println(trim.endsWith("a   "));//to check string is end with given char
	    
	    String Message_1="Hello";
	    
	    String Message_2="Hello";
	    
	    System.out.println(Message_1.equals(Message_2));//to compare two string values 
	    
	    String Lang_1="selenium";
	    
	    String Lang_2="Selenium";
	    
	    System.out.println(Lang_1.equalsIgnoreCase(Lang_2));
	    
	    System.out.println(Lang_1 + " " +Lang_2);//Concatenation using + operator
	    
	    System.out.println(Message_1.concat(Lang_2)); //Concatenation using concat method
	 
	    
	    String EmpName1="Avi";
	    String EmpName2="Avi";
	    
	    System.out.println(EmpName1==EmpName2);//true
	    //==operators always check refference of variable(it means check the content of two string, if string content same then returns true else false)
	    
	    String EmpName3="Avi";
	    String EmpName4="AviG";
	    
	    System.out.println(EmpName3==EmpName4);//false
	    //==operators always check refference of variable(it means check the content of two string, if string content same then returns true else false)

	    System.out.println(EmpName1.equals(EmpName2));//true
	    //string equals method always check content of two string
	    
	    System.out.println(EmpName3.equals(EmpName4));//false
	  //string equals method always check content of two string
	    
	    String str1=new String("Avi");
	    
	    String str2=new String("Avi");
	    
	    System.out.println(str1==str2);//false, If you are created string using new keyword then JVM always allocated new memory for each string refference variable 	   
	    
	    
	    
		
		
	}

}
