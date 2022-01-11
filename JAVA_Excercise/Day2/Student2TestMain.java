package OOPSEx;

public class Student2TestMain
{
	public static void main(String[] args) 
	{
		Student2 s=new Student2(1, "Ravi", "Banglore", 70, 60, 50, 5000, false);
		Student2 s1=new Student2(1, "Anil", "Hyderabad", 80, 70, 60, 6000, false);
		Student2 s2=new Student2(3, "yunus", "Banglore", 90, 80, 700, 7000, false);
			
			System.out.println("------------------------------------------");
			int i1 = s.getTotalMarks();
			int i2 = s1.getTotalMarks();
			int i3=  s2.getTotalMarks();
			
			
			
				if((i1>i2) && (i1>i3)) {
					System.out.println("  highest marks are " + i1);
					
				}
				
				else if((i2>i1) && (i2>i3)) {
					System.out.println(" highest marks are" + i2);
					
				}
				else {
					System.out.println(" highest marks are " + i3);
					
				}
			
				
			
			System.out.println(" Student1 details---------");
			s.display();
			s1.display();
			s2.display();
			
			
		}
		

		
	}



