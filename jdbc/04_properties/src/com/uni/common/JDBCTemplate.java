package com.uni.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


public class JDBCTemplate {
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
//				// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//
//				// 2.등록된 클래스를 이용해서 db연결
//				// 드라이버타입@ip주소:포트번호:db이름(SID)
//				// orcl:사용자정의설치 , thin : 자동으로 설치
//				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "STUDENT");
//
//				System.out.println("conn = " + conn); // 성공하면 con 값, 실패하면 null
				
				
				
				/* 이전 프로 젝트에서는 
		          * JDBC 드라이버 로드 , db 연결을 위한 정보 (url, id, password )를 직접 코드에 작성 (정적코딩)
		          * --> 추후 DB 자체 변경또는 연결정보가 변경되는 경우 코드를 직접 수정하고 다시 컴파일 해야함
		          * --> 유지 보수에 불편 
		          * 
		          * 별도의 Properies 파일을 만들어 프로그램실행시 동적으로 DB 연결 정보를 불러올수있도록 진행
		          * 
		          */
				Properties prop = new Properties();
				
				prop.load(new FileReader("resources/driver.properties"));        // load(Reader reader) : void
				Class.forName(prop.getProperty("driver"));
				
				conn = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user") ,prop.getProperty("password") );
				

				
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}// if 끝
		
		return conn;
	}
	
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // conn close 끝
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // commit 끝
	
	public static void rollback() {
		
		try {
			if(conn != null && !conn.isClosed())   // 덜썼음
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}  // rollback 끝
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed())
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // stmt close 끝
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed())
			rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // rset close 끝
	
}
