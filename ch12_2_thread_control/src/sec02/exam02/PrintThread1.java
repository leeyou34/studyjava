package sec02.exam02;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("Operating");
		}
		System.out.println("Resource organizing");
		System.out.println("Operation ends");
	}
}
