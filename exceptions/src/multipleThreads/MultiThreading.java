package multipleThreads;

class MultiThreading implements Runnable {
	String name;//name of the thread
	Thread t;
	
	MultiThreading(String threadname){
		name= threadname;
		t=new Thread (this,name);
		System.out.println("New thread: " + t);
	}
 //Usually what I noticed that try is the entry point for the thread
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println( name + ": " + i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println( name + "Interrupted");
		}
	System.out.println(name + "exiting");
}
}
