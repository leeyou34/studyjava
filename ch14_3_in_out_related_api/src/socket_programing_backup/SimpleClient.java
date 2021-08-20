package socket_programing_backup;

import java.io.DataInputStream;


public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("192.168.0.134", 8111);
		System.out.println("Server connection is completed.");
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		String message = dis.readUTF();
		System.out.println("received message: " + message);
		
		
		in.close();
		socket.close();
		
		System.out.println("Client close.");

	}

}
