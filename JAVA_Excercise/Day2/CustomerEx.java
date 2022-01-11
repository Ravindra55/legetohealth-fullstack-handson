package OOPSEx;

public class CustomerEx extends PersonEx {
	
	
	private int custid;
	private long acnumber;
	private double balance;
	
	CustomerEx(String name,String gender,int custid,long acnumber,double balance )
	{
		super(name, gender);
		this.custid=custid;
		this.acnumber=acnumber;
		this.balance=balance;
	}

	public int getCustid()
	{
		return custid;
	}

	public void setCustid(int custid) 
	{
		this.custid = custid;
	}

	public long getAcnumber() 
	{
		return acnumber;
	}

	public void setAcnumber(long acnumber)
	{
		this.acnumber = acnumber;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("custid:"+custid+",balance:"+balance+",acnumber:"+acnumber);
		
	}
	
	

}
