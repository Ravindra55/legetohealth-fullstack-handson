package Corejava_Excersice;

public class ReturnWelcomeMsg
{
	public static void main(String[] args) 
	{
		String s1=user("Raj");
		//System.out.println(s1);
		System.out.println("---------------------");
		String s2=s1 +", welcome to java";
		System.out.println(s2);
	
		
		
	}
	public static String user(String s)
	{
		System.out.println("user mathod executed");
		return s;
		
	}

}
