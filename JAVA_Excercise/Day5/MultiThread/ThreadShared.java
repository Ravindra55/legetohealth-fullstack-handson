package MultiThreadEx;

public class ThreadShared implements Runnable {
	public synchronized void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+":entered the run()");
		for(int i=1;i<10;i++) {
			try {
				System.out.println("name:"+i+":itereted");
				Thread.sleep(1000);
				if(name.equals("B") && i==5) {
					wait();
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
	}
		 notifyAll(); {
			 System.out.println(name+":exit run()");
		}

  }
}
