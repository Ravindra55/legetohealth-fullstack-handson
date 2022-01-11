package Corejava_Excersice;

public class Arrays 
{
	public static void main(String[] args)
	{
		String[] s={"fruits","apple","orange"};
		int array[]=new int[3];
		System.out.println("enter array elements");
		array[0]=10;
		array[1]=20;
		array[2]=30;
		for(int i=0;i<array.length;i++)
		{
			System.out.println("array[i]");
		}
		System.out.println("-----------------");
		for(String str:s)
		{
			System.out.println("str");
		}
		
		for(int a:array)
		{
			System.out.println(a);
		}
	}

}
