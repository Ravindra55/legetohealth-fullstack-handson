package Corejava_Excersice;

public class Methods
{
	public static void main(String[] args)
	{
		test();
		user(10);
		int r=add(10,20);
		System.out.println("value of:"+r);
		System.out.println("--------------------------");
		int x=r*10;
		System.out.println("value of:"+x);
		
	}
	public static void test()
	{
		System.out.println("test method executed");
	}
	public static void user(int i)
	{
		System.out.println("user method executed:"+10);
		
	}
	public static int add(int a, int b)
	{
		System.out.println("add method executed");
		return (a+b);
	}

}
