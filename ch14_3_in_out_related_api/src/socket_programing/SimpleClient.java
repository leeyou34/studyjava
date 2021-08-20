package socket_programing;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, {

		Socket socket = new Socket("192.168.0.134", 8111);
		System.out.println("Server connection is completed.");
		
		InputStream in = socket.getInputStream();
		byte[] buff = new byte[10];
		in.read(buff);
		
		System.out.println(Arrays.toString(buff));
		
		in.close();
		socket.close();
		
		System.out.println("Client close.");

	}

}
