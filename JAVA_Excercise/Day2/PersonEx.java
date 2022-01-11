package OOPSEx;

public class PersonEx {
	private String name;
	private String gender;
	public PersonEx(String name, String gender)
	{
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public void display()
	{
		
		System.out.println("name:"+name+", gender="+gender);
	}
	
	
	
	
}
