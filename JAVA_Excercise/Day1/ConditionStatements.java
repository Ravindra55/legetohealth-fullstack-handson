package Corejava_Excersice;

public class ConditionStatements
{
	public static void main(String[] args)
	{
		int marks=70;
		if(marks>=70)
		{
			System.out.println("first class: A grade");
		}
		else if(marks<70 && marks>60)
		{
			System.out.println("first class");
		}
		else if(marks>50 && marks<60)
		{
			System.out.println("second class");
		}
		else if(marks>40 && marks<50)
		{
			System.out.println("third class");
		}
		else
		{
			System.out.println("failed");
	
		}
		System.out.println("-------------------");
		String s="B";
		switch(s)
		{
		case "A+":System.out.println("first class with A grade");
		break;
		case "A":System.out.println("first class");
		break;
		case "B":System.out.println("second class");
		break;
		case "C":System.out.println("third class");
		break;
		default:
			System.out.println("fail");
		}
	}

}
