package chatting_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

public class AppClient extends TcpApplication {

	public static PrintWriter pw = null;
	public static BufferedReader keyboard = null;
	public static BufferedReader br = null;
	public static Socket sSock = null;
	
	//server ip address
	private static String sAddr = null;
	
	//client id
	private String id = null;
	
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
			System.out.println(TcpApplication.timeStamp() + "server is connecting...");
			//ServerSocket server = new ServerSocket(TcpApplication.PORT);
			// 2. client related socket management
			sSock = new Socket(TcpApplication.IP, TcpApplication.PORT);
			sAddr = sSock.getInetAddress().getHostAddress();
			System.out.println(TcpApplication.timeStamp() + sAddr + "->");
			
			// 2.1  get Sender stream...
			pw = new PrintWriter(
				 new OutputStreamWriter(
				sSock.getOutputStream()));
			// 2.2 get receiver stream...
			br = new BufferedReader(
				 new InputStreamReader(
				sSock.getInputStream()));
			
			// 2.3 get keyboard receiver stream.
			keyboard = new BufferedReader(
					   new InputStreamReader(System.in));
			
			//3. Client's id would be sent...
			System.out.println("input ID : ");
			id = keyboard.readLine();
			
			pw.println(id);
			pw.flush();
			
			// 4. create the thread that connected server's data receiver and pass the socket..
			Thread thread = new Thread(new TcpClientHandler());
			thread.start();
			
			// 5. sending keyboard message to connected server..
			String line = null;
			while( line = keyboard.readLine()) != null) {
				pw.println(line);
				pw.flush();
				if(line.equalsIgnoreCase("/quit")) {
					break;
				}
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}

