package com.bitcamp.lecture.insert;
// this is for idol_group...
// this class would be used to get the source from server.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Notice;

public class UpdateProgram3 {
		
	static final String URL ="jdbc:mysql://221.148.138.87:3306/lecture"; 
	static final String ID ="bitcamp";
	static final String PW ="1234";
	
	public static void main(String[] args){
		Connection  con = null;
		PreparedStatement  preStmt = null;

		Notice notice = new Notice();
		
		notice.setId(40);
		notice.setTitle("i updated the title via eclipse!");
		notice.setWriterId("tester_tom");

		
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
	    
			String sql = "UPDATE notice SET TITLE=?, WRITER_ID=? WHERE ID=?";
			
			preStmt = con.prepareStatement(sql);
			preStmt.setString(1, notice.getTitle());
			preStmt.setString(2, notice.getWriterId());
			preStmt.setInt(3, notice.getId());
			
			//String sql = "INSERT INTO member(ID,PWD,NAME,GENDER)VALUES('tomthecat','foshizzlemynizzle','Thom Lee','M')"; //쌍타옴표 앞에 세미콜론 붙으면 지워야 한다...
			/*
			 * PreparedStatement 객체 사용시,
			 * stmt.executeQuery(sql) -> (); <-- 주의!!!
			 */
			
			
			int cnt = preStmt.executeUpdate();
			System.out.println("QUery Ok, " + cnt + "row affected.");

			
		} catch(SQLException  | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con !=null && !con.isClosed()) {
					//rs.close();
					preStmt.close();
					con.close();
					System.out.println("리소스 해제 완료");
				}
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
	
	}

}
