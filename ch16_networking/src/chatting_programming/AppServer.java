package chatting_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

public class AppServer extends TcpApplication{

	/*
	 * application initalization.
	 */
	@Override
	public void init() {
		super.init();
	}

	
	/*
	 * application operation
	 */
	@Override
	public void start() {
		
		System.out.println(TcpApplication.timeStamp());
		System.out.println("TCP/IP server programming is running");
		System.out.println("SERVER STARTS ->");

		try {
			// 1. server socket creation
			ServerSocket server = new ServerSocket(TcpApplication.PORT);
			// 2. client related socket management
			
			while(true) {
				Socket cSocket = server.accept();
				
				System.out.println(TcpApplication.timeStamp());
				System.out.println("Client access waiting...");
				
				/*
				 * 접속한 클라이언트 송수신을 담당할 스레드를 생성하여 소켓(cSocket)을 전달한다.
				 * 접속사 수 만큼 스레드가 생성된다.
				 */
				Thread th = new Thread(new TcpServerHandler(cSocket)); 				
			}
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
