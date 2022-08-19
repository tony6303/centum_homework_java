package com.uni.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.uni.member.model.dto.Member;

/* 1.Connection 객체연결하기 
 * 2.Statement 객체 생성하기 
 * 3.ResultSet 객체 생성하기 
 * 4.Sql작성하기 
 * 5.ResultSet  결과담기 
 * 6.list 에 객체 하나씩 담기 
 * 7.close 하기 (자원반납 - 생성의 역순)
 */

/* DAO(Database Access Object) : 데이터베이스 접근용 객체
 *  => CRUD 연산을 담당하는 메소드들의 집합으로 이루어진 클래스이다.
 *  Create: 삽입 (Insert)
 *  Read : 조회 (Select)
 *  Update: 수정 (Update)
 *  Delete: 삭제(Delete)
 *  */

public class MemberDao {

	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = null;

		Connection conn = null; // DB 연결할 객체
		Statement stmt = null; // 실행 할 쿼리
		ResultSet rset = null; // SELECT 후 결과값 받아올 객체

		String sql = "SELECT * FROM MEMBER";

		try {
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.등록된 클래스를 이용해서 db연결
			// 드라이버타입@ip주소:포트번호:db이름(SID)
			// orcl:사용자정의설치 , thin : 자동으로 설치
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "STUDENT");

			System.out.println("conn = " + conn); // 성공하면 con 값, 실패하면 null

			// 3. 쿼리문을 실행 할 statement 객체 생성
			stmt = conn.createStatement();

			// 4. 쿼리문을 전송, 실행한 결과를 resultset(자료형 이름임) 으로 받기
			rset = stmt.executeQuery(sql); // sql << 28행 근처에 정의 (sql문 문자열)

			// 5. 받은 결과값을 객체에 옮겨서 저장하기
			list = new ArrayList<Member>();

			/**
			 * 밑에 멤버 객체에 set get 변수볼려고 붙여넣었음
			 *
			 * private String userId; private String password; private String userName;
			 * private String gender; private int age; private String email; private String
			 * phone; private String address; private String hobby; private Date enrollDate;
			 * 
			 */

			while (rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString("userId")); // 컬럼의 명을 입력
				m.setPassword(rset.getString("password"));
				m.setUserName(rset.getString("userName"));
				m.setGender(rset.getString("gender"));
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrollDate(rset.getDate("enrollDate"));

				list.add(m); // ArrayList<Member> 에 set,get 작업을 열심히 끝낸 객체 m 을 하나씩 차곡차곡 추가한다
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
				rset.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally 끝

		return list;
	} // selectAll 끝

	public Member selectOne(String inputMemberId) {
		Member m = null;

		Connection conn = null; // DB 연결할 객체
//		Statement stmt = null; // 실행 할 쿼리
		PreparedStatement pstmt = null;            //    pstmt 작성   pstmt 작성   pstmt 작성   pstmt 작성     
		
		ResultSet rset = null; // SELECT 후 결과값 받아올 객체

//		String sql = "SELECT * FROM MEMBER WHERE userId = '" + inputMemberId + "'";   // 변경
		String sql = "SELECT * FROM MEMBER WHERE userId = ?";

		try {
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.등록된 클래스를 이용해서 db연결
			// 드라이버타입@ip주소:포트번호:db이름(SID)
			// orcl:사용자정의설치 , thin : 자동으로 설치
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "STUDENT");

			System.out.println("conn = " + conn); // 성공하면 con 값, 실패하면 null

			// 3. 쿼리문을 실행 할 statement 객체 생성
			
//			stmt = conn.createStatement();            // 변경
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputMemberId);   // n번째 ?에 매개변수를 넣는다.

			// 4. 쿼리문을 전송, 실행한 결과를 resultset(자료형 이름임) 으로 받기
			
//			rset = stmt.executeQuery(sql); // 변경
			rset = pstmt.executeQuery();

			/**
			 * 밑에 멤버 객체에 set get 변수볼려고 붙여넣었음
			 *
			 * private String userId; private String password; private String userName;
			 * private String gender; private int age; private String email; private String
			 * phone; private String address; private String hobby; private Date enrollDate;
			 * 
			 */
			if (rset.next()) {
				// 5. 받은 결과값을 객체에 옮겨서 저장하기
				m = new Member();
				m.setUserId(rset.getString("userId")); // 컬럼의 명을 입력
				m.setPassword(rset.getString("password"));
				m.setUserName(rset.getString("userName"));
				m.setGender(rset.getString("gender"));
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrollDate(rset.getDate("enrollDate"));
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
					rset.close();
//					stmt.close();   // 변경
					pstmt.close();   
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // finally 끝

		return m;
	} // selectOne 끝
	

	   public int insertMember(Member m) {

	      int result = 0;
	      Connection conn = null;// DB에 연결할 객체
	      Statement stmt = null;// 실행할 쿼리
	      
	      String sql = "INSERT INTO MEMBER VALUES("
	            + "'"+ m.getUserId()+"' , "
	            + "'"+ m.getPassword()+"' , "   
	            + "'"+ m.getUserName()+"' , "
	            + "'"+ m.getGender()+"' , "
	            + m.getAge()+","
	            + "'"+ m.getEmail()+"' , "
	            + "'"+ m.getPhone()+"' , "
	            + "'"+ m.getAddress()+"' , "
	            + "'"+ m.getHobby()+"' , "
	            + " sysdate )";
	      
	      System.out.println(sql);
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      
	         System.out.println("드라이버 등록성공");
	   
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "student", "student");
	         System.out.println("conn=" + conn);// 성공하면 connection 값, 실패하면 null값
	         stmt = conn.createStatement();
	         conn.setAutoCommit(false);
	         result = stmt.executeUpdate(sql);//처리한 행의 갯수를 리턴(int형)
	         
	         if(result > 0) conn.commit();//적용
	         else conn.rollback();//되돌리기

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         try {
	            stmt.close();
	            conn.close();
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      return result;
	   }

	   public List<Member> selectByName(String memberName) {
	      ArrayList<Member> list = null;
	      Connection conn = null;// DB에 연결할 객체
//	      Statement stmt = null;// 실행할 쿼리
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;// Select 한후 결과값 받아올 객체

	      String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE '%" + memberName + "%'";// 자동으로 세미콜론을 붙여 실행되므로 붙히지않는다

	      try {

	         // 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         System.out.println("드라이버 등록성공");

	         // 2.등록된 클래스를 이용해서 db연결
	         // 드라이버타입@ip주소:포트번호:db이름(SID)
	         // orcl:사용자정의설치 , thin : 자동으로 설치 //ip주소 -> localhost 로 변경해도됨
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "student", "student");

	         System.out.println("conn=" + conn);// 성공하면 connection 값, 실패하면 null값

	         // 3. 쿼리문을 실행할 statement 객체 생성
//	         stmt = conn.createStatement();
	         pstmt = conn.prepareStatement(sql);

	         // 4.쿼리문 전송, 실행결과를 ResultSet 으로 받기
//	         rset = stmt.executeQuery(sql);
	         rset = pstmt.executeQuery();

	         // 5. 받은결과값을 객체에 옮겨서 저장하기

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

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {

	         try {// 자원반납의 순서는 생성의 역순이다
	            rset.close();
	            pstmt.close();
	            conn.close();
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }

	      return list;
	   }

	   public int updateMember(Member m) {
	      int result = 0;
	      Connection conn = null;// DB에 연결할 객체
	      Statement stmt = null;// 실행할 쿼리
	      
	      String sql = "UPDATE MEMBER SET "
	            + " PASSWORD = '"+ m.getPassword()+"' , "
	            + " EMAIL = '"+ m.getEmail()+"' , "   
	            + " PHONE ='"+ m.getPhone()+"' , "
	            + " ADDRESS = '"+ m.getAddress()+"' "
	            + " WHERE USERID = '"+ m.getUserId()+"'";
	            
	      
	      System.out.println(sql);
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      
	         System.out.println("드라이버 등록성공");
	   
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "student", "student");
	         System.out.println("conn=" + conn);// 성공하면 connection 값, 실패하면 null값
	         stmt = conn.createStatement();
	         conn.setAutoCommit(false);
	         result = stmt.executeUpdate(sql);//처리한 행의 갯수를 리턴(int형)
	         
	         if(result > 0) conn.commit();//적용
	         else conn.rollback();//되돌리기

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         try {
	            stmt.close();
	            conn.close();
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      return result;
	   }

	   public int deleteMember(String userId) {
	      int result = 0;
	      Connection conn = null;// DB에 연결할 객체
	      Statement stmt = null;// 실행할 쿼리
	      
	      String sql = "DELETE FROM MEMBER WHERE USERID = '"+ userId +"'";
	            
	      
	      System.out.println(sql);
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      
	         System.out.println("드라이버 등록성공");
	   
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "student", "student");
	         System.out.println("conn=" + conn);// 성공하면 connection 값, 실패하면 null값
	         stmt = conn.createStatement();
	         conn.setAutoCommit(false);
	         result = stmt.executeUpdate(sql);//처리한 행의 갯수를 리턴(int형)
	         
	         if(result > 0) conn.commit();//적용
	         else conn.rollback();//되돌리기

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         try {
	            stmt.close();
	            conn.close();
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      return result;
	   }

}
