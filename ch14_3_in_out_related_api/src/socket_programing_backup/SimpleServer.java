package socket_programing_backup;

import java.io.DataInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {
		
		String str = "Hello? Thank you for visiting.";
		
		ServerSocket server = new ServerSocket(8111);
		System.out.println("Server is ready.");
		
		Socket socket =server.accept();
		System.out.println("Client connection is completed.");
		// client ip address
		System.out.println(socket.getInetAddress());
	
		OutputStream out = socket.getOutputStream();
	
		
		
		byte[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		out.write(arr);
		out.flush();
		out.close();
		
		socket.close();
		server.close();
		
		System.out.println("Server was terminated.");
	}

}
