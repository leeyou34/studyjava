package sec01.exam01;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // the contents for the thread process. from line 7 to 13
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} 
			catch (Exception e) {
			}
		}
	}
}
