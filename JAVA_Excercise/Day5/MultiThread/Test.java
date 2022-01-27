package MultiThreadEx;

public class Test  implements Runnable{
	
	void demo() {
		for(int i=1;i<10;i++) {
			System.out.println("i="+i+",thread name="+Thread.currentThread().getName());
		}
	}
	public void run() {
		demo();
		
		
	}
	

}
