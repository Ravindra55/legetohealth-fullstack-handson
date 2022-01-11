package OOPSEx;

public class MainClassOfCMSP
{
	public static void main(String[] args) 
	{
		
		System.out.println("---------------------------------------");
		StudentEx s=new StudentEx("Ravi", "M", 100,'B');
		print(s);
		System.out.println("----------------------------------------");
	
		CustomerEx c=new CustomerEx("Ravindra","M", 5, 55555, 2000.00);
		print(c);
		System.out.println("----------------------------------------");
		
		EmployeeEx e=new EmployeeEx("anil", "M", 10, 30000.00);
		print(e);
		System.out.println("-----------------------------------------");
		
		PersonEx p=new PersonEx("jaga","M");
		print(p);
		System.out.println("------------------------------------------");
		
	}
	
	public static void print(PersonEx p)
	{
		p.display();
	}

}
