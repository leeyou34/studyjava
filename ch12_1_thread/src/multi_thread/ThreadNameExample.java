package multi_thread;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Thread name for Program operation: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("process thread name: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("process thread name: " + threadB.getName());
		threadB.start();
		
	}

}
