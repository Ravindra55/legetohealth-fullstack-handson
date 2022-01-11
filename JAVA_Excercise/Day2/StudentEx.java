package OOPSEx;

public class StudentEx extends PersonEx
{
	private int sid;
	private char grade;
	StudentEx(String name,String gender,int sno,char grade )
	{
		super(name,gender);
		
		this.sid=sid;
		this.grade=grade;
		
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid) 
	{
		this.sid = sid;
	}
	public char getGrade()
	{
		return grade;
	}
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	public void display()
	{
		super.display();
		String sname = null;
		String gender = null;
		System.out.println("sname:"+sname+",sid:"+sid+",gender:"+gender+",grade:"+grade);
	}
	
	

}
