package Corejava_Excersice;

public class LoopStatements 
{
	public static void main(String[] args) {
		int count=10;
		while(count<=6)
		{
			System.out.println("while loop:"+count);
			count++;
		}
		int anothercount=20;
		do {
			System.out.println("do while:"+anothercount);
			anothercount++;
		}while(anothercount<=10);
	}

}
