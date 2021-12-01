package multipleThreads;

class MainThreading {

	public static void main(String[] args) {
		MultiThreading nt1 = new MultiThreading("one");
		MultiThreading nt2 = new MultiThreading("Two");
		MultiThreading nt3 = new MultiThreading("Three");
		//Start the threads
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		try {// wait for other threads to end
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
            System.out.println("Main thread exiting");
	}

}
