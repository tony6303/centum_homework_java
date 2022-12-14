package com.uni.member.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static com.uni.common.JDBCTemplate.*;

import com.uni.member.model.dao.MemberDao;
import com.uni.member.model.dto.Member;
/* Service 
 * 
 * 1) Controller 로 부터 인자 전달 받음
 * 2) connection 객체 생성
 * 3) Dao 객체 생성 
 * 4) Dao 로  생성한 Connection 객체와 인자를 전달 
 * 5) Dao를 수행한 결과를 가지고 비지니스 로직 및 트랜잭션 관리 
 * 
 * */
public class MemberService {

	private MemberDao memberDao = new MemberDao();
	
	
	public  ArrayList<Member> selectAll() {
		Connection conn = getConnection();
		ArrayList<Member> list = memberDao.selectAll(conn);
		return list;
	}

	public  Member selectOne(String inputMemberId) {
		Connection conn = getConnection();
		Member m = memberDao.selectOne(conn, inputMemberId);
		return m;
	}

	public  List<Member> selectByName(String inputMemberName) {
		Connection conn = getConnection();
		List<Member> list = memberDao.selectByName(conn, inputMemberName);
		return list;
	}

	public  int insertMember(Member inputMember) {
		Connection conn = getConnection();
		int result = memberDao.insertMember(conn, inputMember);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}

	public  int deleteMember(String inputMemberId) {
		
		Connection conn = getConnection();
		int result = memberDao.deleteMember(conn, inputMemberId);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}

	public  int updateMember(Member updateMember) {
		Connection conn = getConnection();
		
		int result = memberDao.updateMember(conn, updateMember);
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}

	public void exitProgram() {
		close(getConnection());
		
	}

}
