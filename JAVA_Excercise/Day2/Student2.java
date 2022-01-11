package OOPSEx;

public class Student2 {
	
	private int sid;
	private String sname;
	private String city;
	private int marks1;
	private int marks2;
	private int marks3;
	private float feePerMonth;
	private boolean isEligibleForScholarship;
	public Student2(int sid, String sname, String city, int marks1, int marks2, int marks3, float feePerMonth,
			boolean isEligibleForScholarship) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.feePerMonth = feePerMonth;
		this.isEligibleForScholarship = isEligibleForScholarship;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public float getFeePerMonth() {
		return feePerMonth;
	}
	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}
	public boolean isEligibleForScholarship() {
		return isEligibleForScholarship;
	}
	public void setEligibleForScholarship(boolean isEligibleForScholarship) {
		this.isEligibleForScholarship = isEligibleForScholarship;
	}
	
	public float getAnnualFee() {
		return feePerMonth * 12;
	}
	public int getTotalMarks() {
		return marks1+marks2+marks3;
		
	}

	public float getAverage() {
		
		return (marks1+marks2+marks3)/3;
		
	}
	public void  getResult() {
		if((marks1<60) || (marks2 <60) || (marks3 <60)) {
			isEligibleForScholarship = false ;
			System.out.println(" Student is not eligible for Scholarship");
			
		}
		else {
			isEligibleForScholarship = true ;
			System.out.println(" Student is  eligible for Scholarship");
		}
		
	}

	public void display() {
		System.out.println(" Student Name " + sname);
		System.out.println(" Student Total Marks : " + getTotalMarks());
		System.out.println(" Student Average Marks : "+ getAverage());
		getResult();
		
	}
	
	
}



