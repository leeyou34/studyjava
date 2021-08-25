package ftp_program;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import com.framework.TcpApplication;

public class FTPClient extends TcpApplication{
	
		
		@Override
		public void start() {
			
		
		//입출력 스트림
		 InputStream in = null;
		 OutputStream out = null;
		 DataInputStream din = null;
		 DataOutputStream dout = null;
		 FileOutputStream fos =null;
		 Scanner sc = new Scanner(System.in);
		 BufferedReader br = null;
		 
		 // 소켓
		 Socket socket = null;
		 
		 
		 try {
			 socket = new Socket(IP, PORT); //소켓생성으로 서버 소켓과 연결

			 // 수신
			 in = socket.getInputStream();
			 din = new DataInputStream(in);
			
			 // 송신
			 out = socket.getOutputStream();
			 dout = new DataOutputStream(out);
			 
			 // <파일 리스트 수신>
			br = new BufferedReader(new InputStreamReader(in));
			System.out.println("\n[보유하고 있는 음원 목록입니다.]");
			System.out.println();
			
			String strline = null;
			String strlen = null;
			 while(true) {
				//파일 이름 수신
				 strline = br.readLine();
				 strlen = br.readLine(); //1바이트씩 받을것
				
				if(strline.equals("quit"))break;
				System.out.println(strline);
				System.out.println("(파일크기: "+strlen+" byte)");
				
			 }

			 System.out.println("다음");
			 menuDisplay();
			 String fileName = sc.nextLine();
			 
			 // 서버로 전송
			 dout.writeUTF(fileName);
			 System.out.println(timeStamp()+"파일 서버에 요청하였습니다.");
			 System.out.println();
			 
			 // 파일데이터 수신
			 System.out.println("파일 수신 중...");
			 System.out.println();
			 
			  fos = new FileOutputStream("C:/Temp/"+fileName);
			  
			  int cnt = 0;
			 while(true) {
				 // 읽기
				  int data = din.read();
				  if(data == -1) break;
				  
				 // 쓰기
				  fos.write(data);
				  if(cnt%5000 ==0) {
					  System.out.print("■");
				  }
				  cnt++;
			 }
			 System.out.println();
			 System.out.println(timeStamp()+"파일 수신을 완료하였습니다."+"("+cnt+"바이트"+")");
			 
			 System.out.println();
			 System.out.println(timeStamp()+"파일 다운로드 완료");
			 System.out.println();
			 
		 }catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(din != null) {din.close();}
					if(dout != null) {dout.close();}
					if(fos != null) {fos.close();}
					if(socket != null) {socket.close();}
				}catch(IOException e ) {e.printStackTrace();}
			}
		 System.out.println(timeStamp()+"클라이언트 파일 요청 프로그램을 종료합니다.");
	
		}	
	
	public static void menuDisplay() {
		
		
		System.out.println();
		System.out.println("─────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("   받고 싶은 파일의 이름(파일명.확장자)을 입력해 주세요.");
		System.out.println();
		System.out.println(" [1]aaa.txt [2]bbb.txt [3]ccc.txt [4]image.JPG");
		System.out.println();
		System.out.println("─────────────────────────────────────────────────────");
		System.out.println();
		System.out.print(" 선택>");
	}

	
}
