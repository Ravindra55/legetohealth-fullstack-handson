package OOPSEx;

public class EmployeeEx extends PersonEx
{
	private int empid;
	private double salary;
	public EmployeeEx(String name,String gender,int empid, double salary) {
		super(name,gender);
		this.empid = empid;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public  void display()
	{
		super.display();
		System.out.println("emipd:"+empid+",salary:"+salary);
	}
	

}
