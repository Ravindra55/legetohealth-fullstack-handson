package Corejava_Excersice;

public class ReturnLargestNumber 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int z=5;
		 int largest= test(x,y,z);
		 System.out.println("largest number:"+largest);
		
		
	}
	public static int test(int x, int y, int z)
	{
		System.out.println("test method executed");
		if(x>=y && x>=z)
		{
			return x;
			
		}
		else if(y>=x && y>=z)
		{
			return y;
		}
		else
		{
			return z;
		}
		
		
	}

}

