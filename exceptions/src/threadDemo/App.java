package threadDemo;
//https://www.youtube.com/watch?v=TCd8QIS-2KI&t=791s

/*class MyTask{
	void executeTask() {
		for(int doc=1;doc<=10; doc++) {//This is job 2
			System.out.println("This time Print documents : " + doc + "Printer 2");
	}
}*/
//My task is a thread
class MyTask extends Thread{
	@Override
public void run() {
		for(int doc=1;doc<=10; doc++) {//This is job 2
			System.out.println("This time Print documents : " + doc + "Printer 2");
	}
	}
}
public class App {
//main method represents main thread
	//whatever we write here will be executed by the main thread	
	//Thread always execute the job in a sequence
	
	//This is job1
	public static void main(String[] args) {
		System.out.println("--Application started--");
		//This is job2
		//Till job 2 will not finish later stage will not compile
		//In case job2 is a long running operation i.e.several documents needs to be printed
		//In such a use case OS/JVM shall give a message that app is not responding
		//some sluggish behavior in app can be observed --> App seems to be hang
		//Now main and my task are executing both pararerrly and concurrently
		MyTask task = new MyTask();
		//task.executeTask();
		task.start();//start shall internally execute run method
		//some code to print the documents
		
		//This is job 3
		for(int doc=1;doc<=10; doc++) {
			System.out.println("Print documents : " + doc + "Printer 1");
}
		System.out.println("--Application finished");// This is job 3

	}

}
