package MultiThreadEx;

public class TestTicketBooking implements Runnable {
	private static int tickets=1;
	
	public void run() {
		Booking();	
	}
	public synchronized void Booking() {
		
		String name=Thread.currentThread().getName();
		
		System.out.println("name+"+name+":entered");
		if(tickets !=0) {
			System.out.println("name:"+name+":ticket got it");
			tickets--;
		}
		else {
			System.out.println("name:"+name+":ticket is not got ");
		}
	}

}
