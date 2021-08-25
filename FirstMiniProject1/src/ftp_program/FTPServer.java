package ftp_program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

/** [파일 서비스 프로그램]
 * 1. 클라이언트는 특정한 파일명을 서버에 요청한다.
 * 2. 서버는 클라이언트가 요청한 파일을 찾는다.
 * 3. 요청한 파일을 찾으면 파일(리소스 폴더내에서) 데이터를 읽어 들인다.
 * 4. 읽어온 파일의 데이터를 클라이언트에게 전송한다.
 * 5. 클라이언트는 받은 파일의 내용을 화면에 출력하고 저장한다.
 * 
 * [미니프로젝트 관련]
 *  1. 리스트 받기 성공 (
 * 
 * 
 */
public class FTPServer extends TcpApplication {
	
	@Override
	public void start() {
		
		System.out.println();
		
		//입출력 스트림
		 InputStream in = null;
		 OutputStream out = null;
		 DataInputStream din = null;
		 DataOutputStream dout = null;
		 FileInputStream fin = null;
		 PrintWriter pw = null;
		 
		//소켓
		 ServerSocket serverSoc = null;
		 Socket		 clientSoc = null;
		
		//호스트 주소
		String			 clientAddr = null;
		
		/* 클라이언트 접속 대기 및 소켓 생성
		 * 수신/송신
		 */
		//
		try {
			serverSoc = new ServerSocket(PORT);
			System.out.println(timeStamp()+"클라이언트 접속을 대기중입니다...");
			System.out.println();
			
			clientSoc = serverSoc.accept(); //서버-클라이언트 연결
			
			clientAddr = clientSoc.getInetAddress().getHostName(); //주소를 스트링으로 반환
			System.out.println(timeStamp()+clientAddr + "<- connected.");
			
			/*
			 * 수신(IN) : 클라이언트가 보낸 파일명
			 */
			in = clientSoc.getInputStream();
			din = new DataInputStream(in);
			
			/*
			 * 송신 (OUT) : 서버소스 폴더 내 파일을 클라이언트에게 보냄 
			 */
			out = clientSoc.getOutputStream();
			dout = new DataOutputStream(out);
			
			// <파일 리스트 전송 기능>
			File rcs = new File("sources\\");
			pw = new PrintWriter(new OutputStreamWriter(out));
			int i=0;
			for(String file : rcs.list()) {
				//파일명 전송
				pw.println((++i)+"번 트랙 : "+file);
				pw.flush();
				//파일 크기 전송
				pw.println(file.length());
				pw.flush();
			}

			pw.println("quit");
			pw.flush();
			pw.println("quit");
			pw.flush();
			System.out.println("리스트 전송완료!");
			
			// 단계1 : 사용자가 무슨 파일을 필요로 하는지 파악
			String fileName = din.readUTF();
			
			// 단계2 : 파일 데이터를 찾아내고 데이터를 읽는다.
			// 절대경로를 쓰면, 다른 컴퓨터에서 실행시 파일 주소를 못찾아올 가능성이 큼
			 fin = new FileInputStream("resources\\"+fileName); //상대경로로 작성해주기
			 
			// 단계3 : 파일 데이터를 읽고 데이터를 보낸다.
			System.out.println("파일을 보내는 중...");
			System.out.println();
			while(true) {
				//읽기
				int data = fin.read();
				if(data == -1) break;
				
				//쓰기
				dout.write(data); 
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(din != null) {din.close();}
				if(dout != null) {dout.close();}
				if(fin != null) {fin.close();}
				if(clientSoc != null) {clientSoc.close();}
				if(serverSoc != null) {serverSoc.close();}
				
			}catch(IOException e ) {e.printStackTrace();}
		}
		System.out.println(timeStamp()+"파일 전송 서비스를 종료합니다.");
	}
}


