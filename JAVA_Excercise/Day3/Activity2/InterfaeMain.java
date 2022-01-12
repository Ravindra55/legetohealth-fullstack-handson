package Day3;

interface I1{
	
	int t=10;
	void m1();
	void m2();
}
interface I2 {
	
	void m3();
}

 abstract class ClassA implements I1{

	public void m1()
	{
		System.out.println("m1 method will executed");
	}

}
class ClassB extends ClassA implements I1,I2{
	
	
	public void m2()
	{
		System.out.println("m2 methd will executed");
	}
	public void m3()
	{
		System.out.println("m3 metod will be executed");
		
	}
	
}

public class InterfaeMain{
	
	public static void main(String ags[]) {
		
		
		I1 i=new ClassB();
		System.out.println(i.t);
		i.m1();
		i.m2();
		((I2) i).m3();
		
		
		
		
	}
	
}







