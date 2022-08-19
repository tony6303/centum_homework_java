package com.uni.section2.uses;

public class MemberInsertManager {
	
	public void insert(MemberDTO[] members) {  // 매개변수로 MemberDTO[] (객체배열) 자료형을 받았음
		System.out.println("회원을 등록합니다");
		
		   for(int i = 0; i < members.length; i++) {  // 객체배열의 길이만큼 반복함
		         System.out.println(members[i].getName() + "님을 회원 등록에 성공했습니다.");  // MemberDTO 클래스의 get함수 사용
		      }
		      
		      System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");  // length 로 배열길이만큼 정보 가져왔다고 출력
	}
}
