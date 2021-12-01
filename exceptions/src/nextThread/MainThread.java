package nextThread;

public class MainThread {

	public static void main(String[] args) {
		SecondThread nt = new SecondThread();
		//Start the thread
        nt.t.start();
        try {
        	for( int i =5; i>0; i--) {
        		System.out.println("Main Thread: "+ i);
        		Thread.sleep(1000);
        	}
        }catch (InterruptedException e) {
        	System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
	}

}
