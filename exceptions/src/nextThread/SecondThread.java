package nextThread;

class SecondThread implements Runnable {
	Thread t; // looks like "Thread" act as Data Type and "t"is variable

	SecondThread(){
		//Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("child thread" + t);
	
	}
//This is the entry point of the second thread
public void run() {
	try {
		for(int i = 5; i>0; i--) {
			System.out.println("Child Thread:" + i);
			Thread.sleep(500);
		}
	
	}catch(InterruptedException e) {
		System.out.println("child interrupted");
	}
	System.out.println("Exiting child thread");
}
}
