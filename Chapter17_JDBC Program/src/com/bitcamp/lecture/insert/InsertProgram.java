package com.bitcamp.lecture.insert;
// this is for idol_group...
// this class would be used to get the source from server.
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertProgram {
		
	static final String URL ="jdbc:mysql://221.148.138.87:3306/lecture"; 
	static final String ID ="bitcamp";
	static final String PW ="1234";
	
	public static void main(String[] args){
		Connection  con = null;
		Statement  stmt = null;
		

		try {
			/*
			 * 드라이버 로딩
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			/* DB 연결
			 * 
			 */
			con = DriverManager.getConnection(URL, ID, PW);
			//url은 IP 주소이다.
			System.out.println("Successfully connected!");
			/*
			 * 쿼리 실행
			 */
			stmt = con.createStatement();
			
			String sql = "INSERT INTO member(ID,PWD,NAME,GENDER)VALUES('tomthecat','foshizzlemynizzle','Thom Lee','M')"; //쌍타옴표 앞에 세미콜론 붙으면 지워야 한다...
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println("QUery Ok, " + cnt + "row affected.");
			
			// 이영호가 직접 씀
//			int i = 1;
//			while(i<=30) {
//				rs.next();
//				rs.getString("ID");
//				System.out.println("아이디: " + rs.getString("ID"));
//				i++;
//			}
			//
//			System.out.println("------------------------------------------------------------------");
//			System.out.println("Company                  Group Name ");
//			System.out.println("------------------------------------------------------------------");
//			while(rs.next()) {
//				System.out.print(rs.getString("COMPANY")+ "\t\t" + rs.getString("GROUP_NAME") + "\n");
//			}
			
//			강사님과 처음 할때
//			if(rs.next()) {
//				rs.getString("ID");
//				System.out.println("아이디: " + rs.getString("ID"));
//			}
			
			
//			2차 with if			
//			if(rs.next()) {
//				rs.getString(
//						"ID"
//						);
//				System.out.println("아이디: " + rs.getString("ID"));
//			}
			
			
			
		} catch(SQLException  | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con !=null && !con.isClosed()) {
					//rs.close();
					stmt.close();
					con.close();
					System.out.println("리소스 해제 완료");
				}
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
	
	}

}
