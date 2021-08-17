package sec02.exam03;

public class PrintThread2 extends Thread{
	public void run() {
		try {
			while(true ) {
				System.out.println("Operation");
				Thread.sleep(1);
				}
			} 
		catch(InterruptedException e) {	
			}
	}
}
