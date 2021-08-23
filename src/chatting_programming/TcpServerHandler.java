package chatting_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

import com.framework.TcpApplication;

public class TcpServerHandler implements Runnable {
	
	/* Client Socket is the Key
	 * 
	 */
	
	public static HashMap<String, PrintWriter> sendMap = new HashMap<>();
	
	private Socket sock;
	
	private String cAddr;
	
	private String id;
	
		
	public TcpServerHandler(Socket cSocket) {
		this.sock = cSocket;
		this.cAddr = sock.getInetAddress().getHostAddress();
	}
	/*
	 *  participants in and out management
	 *  broad casting
	 */
	@Override
	public void run() {
		try {
			// 1. 송신 스트림 얻기
			PrintWriter pw = new PrintWriter(
							 new OutputStreamWriter(
							 sock.getOutputStream()));
			// 2. 수신 스트림 얻기
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								sock.getInputStream()));
			
			
			// 3. 클라이언트 접속정보 저장 및 브로드캐스팅
			id = br.readLine();
			TcpServerHandler.sendMap.put(id, pw);
			
			// 4. Client 입장 정보를 브로드 캐스팅
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
					"[" + id + "] signed in ");
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + cAddr + "<- connected");
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
					"participant: " + sendMap.size() + "ppl");
			
			// 5. Send/ receiver
			String line = null;
			while((line = br.readLine()) != null) {
				
				if(line.equalsIgnoreCase("/quit")) {
					TcpServerHandler.broadCast(TcpApplication.timeStamp() +
							"[" + id + "] has left" );
				break;
				}
				else if(line.indexOf("/to") > -1) {
					whisper(id, line);
				}
				else { 
					String msg = "[" + id + "]" + "" + line;
					TcpServerHandler.broadCast(msg);
				}
			}
			System.out.println(TcpApplication.timeStamp() + cAddr + "-> disconnected");
			
			TcpServerHandler.sendMap.remove(id);
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
					"participant: " + sendMap.size() + "ppl");
			pw.close();
			br.close();
			sock.close();
			
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			
		}
		
	}
	
	/* whisper sending method
	 * 
	 */
	
	private void whisper(String name, String msg) {
		
	}
	
	/*
	 * Message sending whole method
	 *
	 */
	public static void broadCast(String message) {
		synchronized (sendMap) {
			

		
		for(PrintWriter cpw: TcpServerHandler.sendMap.values()) {
			cpw.println(message);
			cpw.flush();
			}
		}
	}
}
