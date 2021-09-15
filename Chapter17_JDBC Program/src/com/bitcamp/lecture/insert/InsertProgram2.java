package com.bitcamp.lecture.insert;
// this is for idol_group...
// this class would be used to get the source from server.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;

public class InsertProgram2 {
		
	static final String URL ="jdbc:mysql://221.148.138.87:3306/lecture"; 
	static final String ID ="bitcamp";
	static final String PW ="1234";
	
	public static void main(String[] args){
		Connection  con = null;
		PreparedStatement  preStmt = null;
		
		Member member = new Member();
		member.setId("tomthecat");
		member.setPwd("pussgetstheboots");
		member.setName("tester_tom");
		member.setGender("M");
		member.setBirthDay("1940-02-10");
		member.setPhone("010-1940-2021");
		
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
			String sql = "INSERT INTO member(ID,PWD,NAME,GENDER,BIRTHDAY,PHONE)VALUES(?,?,?,?,?,?)";
			
			preStmt = con.prepareStatement(sql);
			preStmt.setString(1, member.getId());
			preStmt.setString(2, member.getPwd());
			preStmt.setString(3, member.getName());
			preStmt.setString(4, member.getGender());
			preStmt.setString(5, member.getBirthDay());
			preStmt.setString(6, member.getPhone());
			
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
