package com.uni.member.model.dao;

import static com.uni.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.uni.common.exception.MemberException;
import com.uni.member.model.dto.Member;
/* 1.Connection 객체연결하기 
 * 2.Statement 객체 생성하기 
 * 3.ResultSet 객체 생성하기 
 * 4.Sql작성하기 
 * 5.ResultSet  결과담기 
 * 6.list 에 객체 하나씩 담기 
 * 7.close 하기 (자원반납 - 생성의 역순)
 */

public class MemberDao {
	private Properties prop = null;

	public ArrayList<Member> selectAll(Connection conn) throws MemberException {
		ArrayList<Member> list = null;
		
		Statement stmt = null;// 쿼리문을 실행할 객체
		ResultSet rset = null;// SELECT 후 결과값 받아올객체
		
		
		
		try {
			
			prop = new Properties();
			prop.loadFromXML(new FileInputStream("mapper/query.xml"));
			String sql = prop.getProperty("selectAll");// 자동으로 세미콜론 붙여서 실행됨
			
			//3.쿼리문을 실행할 statement 객체 생성 
			stmt = conn.createStatement();
			
			//4.쿼리문을 전송, 실행한 결과를 resultset으로 받기
			rset = stmt.executeQuery(sql);
			
			//5. 받은 결과값을 객체에 옮겨서 저장하기 
			list = new ArrayList<Member>();

			while(rset.next()) {
				//https://www.tutorialspoint.com/jdbc/jdbc-data-types.htm
				Member m = new Member();
				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));
				
				list.add(m);
			}
			
		} catch (Exception e) {
			throw new MemberException("selectAll" + e.getMessage());
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public Member selectOne(Connection conn, String memberId) throws MemberException {
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;// SELECT 후 결과값 받아올객체
		
		
		String sql = "SELECT * FROM MEMBER WHERE USERID = ?";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			
			
			//4.쿼리문을 전송, 실행한 결과를 resultset으로 받기
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				m = new Member();
				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));
				
				
			}
			
			
		} catch (Exception e) {
			throw new MemberException("selectOne" + e.getMessage());
		} finally {
			
			
				close(rset);
				close(pstmt);
			
			
		}

		
		
		return m;
	}

	public List<Member> selectByName(Connection conn, String memberName) throws MemberException {
		ArrayList<Member> list = null;
		PreparedStatement pstmt = null;// 실행할 쿼리
		ResultSet rset = null;// Select 한후 결과값 받아올 객체

		String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE ?";// 자동으로 세미콜론을 붙여 실행되므로 붙히지않는다

		try {

			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+memberName+"%");
			rset = pstmt.executeQuery();

			list = new ArrayList<Member>();

			while (rset.next()) {

				Member m = new Member();
				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));

				list.add(m);
			}

		} catch (Exception e) {
			throw new MemberException("selectByName" + e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public int insertMember(Connection conn, Member m) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		
		
		try {
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, m.getHobby());
			
			result = pstmt.executeUpdate();// 처리한 행의 갯수 리턴 (int) , 에러 -1

				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateMember(Connection conn, Member m) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEMBER SET PASSWORD = ? , EMAIL = ?, PHONE = ?, ADDRESS = ? WHERE USERID=?";
		
		
		try {
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getPhone());
			pstmt.setString(4, m.getAddress());
			pstmt.setString(5, m.getUserId());

			
			result = pstmt.executeUpdate();// 처리한 행의 갯수 리턴 (int) , 에러 -1

				
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteMember(Connection conn, String memberId) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBER WHERE USERID=?";
		
		
		try {
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			

			
			result = pstmt.executeUpdate();// 처리한 행의 갯수 리턴 (int) , 에러 -1

		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	
	

}
