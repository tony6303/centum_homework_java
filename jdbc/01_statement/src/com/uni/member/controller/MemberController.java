package com.uni.member.controller;

import java.util.ArrayList;

import com.uni.member.model.dao.MemberDao;
import com.uni.member.model.dto.Member;
import com.uni.member.view.MemberMenu;

public class MemberController {
	
	private MemberDao memberDao = new MemberDao();
	
	public void selectAll() {
		MemberMenu menu = new MemberMenu();
		ArrayList<Member> list = memberDao.selectAll();
		
		// selectAll 이 실행되고 ArrayList는 null로 만들어졌기 때문에 null로 비교하지않고 isEmpty로 비교한다
		if(!list.isEmpty()) {  
			menu.displayMemberList(list);
		}else {
			menu.displayError("해당되는 데이터가 없습니다.");
		}
		
	} // selectAll 끝

	public void selectOne(String inputMemberId) {
		MemberMenu menu = new MemberMenu(); 
		Member m = memberDao.selectOne(inputMemberId);
		
		
		if(m != null) {
			menu.displayMember(m);
		}else {
			menu.displayError(inputMemberId + " 해당되는 데이터가 없습니다."); 
		}
	}

	public void selectByName(String inputMemberName) {
		
	}

	public void insertMember(Member inputMember) {
		
	}

	public void updateMember(Member updateMember) {
		
	}

	public void deleteMember(String inputMemberId) {
		
	}
	
	

}
