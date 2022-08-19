package com.uni.section2.uses;

public class MemberManager {

	public MemberDTO[] signUpMembers() {
		// TODO Auto-generated method stub
		MemberDTO[] members = new MemberDTO[5] ;
		
		members[0] = new MemberDTO(1, "user01", "pass01", "이대엽", 20, '남');
		members[1] = new MemberDTO(2, "user02", "pass02", "최영준", 20, '남');
		members[2] = new MemberDTO(3, "user03", "pass03", "신예림", 20, '여');
		members[3] = new MemberDTO(4, "user04", "pass04", "이규철", 20, '남');
		members[4] = new MemberDTO(5, "user05", "pass05", "박경민", 20, '남');
		
		MemberInsertManager memberInsertManager = new MemberInsertManager(); // MemberInsertManager 인스턴스 생성
		memberInsertManager.insert(members);  // 위에 만들어진 5칸짜리 배열을 mamberInsertManager 클래스의 insert 함수를 이용해서 회원등록을 함
		
		
		return members;  // 리턴 자료형이 MemberDTO[] 이다.
	}
	
	public void printAllMembers(MemberDTO[] mem) {
		
		//   자료형    변수명  :  배열명               향상된 for문 = 배열관련 작업하기에 좋다
		for( MemberDTO member : mem) {
			System.out.println(member.getInformation());  //  MemberDTO 의 함수 사용
		}
	}
	
	

}
