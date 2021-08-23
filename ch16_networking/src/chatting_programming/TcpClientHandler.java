package chatting_programming;

import java.io.IOException;

public class TcpClientHandler implements Runnable{

	@Override
	public void run() {
		try {
			// receiving 
			String line = null;
			while(true) {
				line = AppClient.br.readLine();
				if(line != null) {
					System.out.println(line);
				}
			}
		} catch(IOException ex) {
			ex.printStackTrace();
			} finally {
				try {
					if(AppClient.keyboard != null) {
						AppClient.keyboard.close();
					}
					if(AppClient.pw != null) {
						AppClient.pw.close();
					}
					if(AppClient.br != null) {
						AppClient.br.close();
					}
					if(AppClient.sSock != null) {
						AppClient.sSock.close();
					}
				}catch(IOException ex) {
					ex.printStackTrace();
				}
				}
			}
		
	}

