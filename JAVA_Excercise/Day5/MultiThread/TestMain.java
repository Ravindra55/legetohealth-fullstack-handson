package MultiThreadEx;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		/*Test target=new Test();
		Thread t1=new Thread(target,"A");
		Thread t2=new Thread(target,"B");
		Thread t3=new Thread(target,"C");
		t1.start();
		t2.start();
		t3.start();*/
		/*TestTicketBooking target=new TestTicketBooking();
		Thread t1=new Thread(target,"A");
		Thread t3=new Thread(target,"B");
		Thread t2=new Thread(target,"C");
		t1.start();
		t2.start();
		t2.start();*/
		ThreadShared target=new ThreadShared();
		Thread t1=new Thread(target,"A");
		Thread t2=new Thread(target,"B");
		Thread t3=new Thread(target,"C");
		//t1.setDaemon(true);
		t1.start();
		t1.join();
		//t2.setDaemon(true);
		t2.start();
		t2.join();
		//t3.setDaemon(true);
		t3.start();
		t3.join();
		
	}

}
