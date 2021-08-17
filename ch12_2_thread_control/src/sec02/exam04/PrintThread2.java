package sec02.exam04;

public class PrintThread2 extends Thread{
	public void run() {
			while(true ) {
				System.out.println("Operation");
				if(Thread.interrupted()); {
					break;
					}
				}
			 
			System.out.println("Resource cleaning");	
			System.out.println("Opertion ends");	
	}
}
