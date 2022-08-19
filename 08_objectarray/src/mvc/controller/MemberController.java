package mvc.controller;

import mvc.model.vo.Member;
import mvc.view.MemberMenu;

public class MemberController {

	public final int SIZE = 10; // 최대 회원 수
	private int memberCount; // 현재 회원 수
	private Member[] mem = new Member[SIZE];  // 회원 객체 배열
	
	Member emptyMember = new Member();

	// 초기화 블럭
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		
		memberCount = 5;
		
	}
	
	public int getMemberCount() {
		return memberCount;
	}

	public Member[] getMem() {
		return mem;
	}

	public Member checkId(String userId) {
		
		
		return null;		
	}
	
	public void insertMember(Member m) {
		mem[memberCount] = m;  // 매개변수 멤버객체m 을 객체배열mem 맨 마지막 인덱스로 추가
		memberCount++;
	}
	
	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		
		
		
		switch(menu) {
		case 1: // 아이디로 검색
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getUserId().equals(search)) {  // 객체배열 mem 에서 userId 를 get 해온게 검색키워드랑 일치하는게 있으면, 그 회원 정보를 출력
					searchMember = mem[i];
					return searchMember;  // mem[i] 리턴
				}
			} // for 끝
			return searchMember;  // null 리턴
			
		case 2: // 이름으로 검색
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getName().equals(search)) {  // 객체배열 mem 에서 Name 를 get 해온게 검색키워드랑 일치하는게 있으면, 그 회원 정보를 출력
					searchMember = mem[i];
					return searchMember;  // mem[i] 리턴
				}
			} // for 끝
			return searchMember;  // null 리턴
			
		case 3: // 이메일로 검색
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getEmail().equals(search)) {  // 객체배열 mem 에서 Email 를 get 해온게 검색키워드랑 일치하는게 있으면, 그 회원 정보를 출력
					searchMember = mem[i];	
					return searchMember;  // mem[i] 리턴
				}
			} // for 끝
			return searchMember;  // null 리턴
		
		default:
			System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요 ( 1 ~ 3 , 9 )");
			
		} // switch 끝
		System.out.println("검색 결과가 없습니다 234");
		
		
//		if(menu == 1) { // 아이디로 검색
//			for(int i = 0; i < mem.length; i++) {
//				if(mem[i].getUserId().equals(search)) {  // 객체배열 mem 에서 userId 를 get 해온게 검색키워드랑 일치하는게 있으면, 그 회원 정보를 출력
//					searchMember = mem[i];
//					return searchMember;
//				}else {
//					System.out.println("비정상종료");
//					System.out.println(i);
//					break;
//				}
//			}
//		}else if(menu == 2){ // 이름으로 검색
//			for(int i = 0; i < mem.length; i++) {
//				if(mem[i].getName().equals(search)) {  // 객체배열 mem 에서 Name 를 get 해온게 검색키워드랑 일치하는게 있으면, 그 회원 정보를 출력
//					searchMember = mem[i];
//					return searchMember;
//				}else {
//					System.out.println("비정상종료");
//					break;
//				}
//			}
//		}else if(menu == 3) { // 이메일로 검색
//			for(int i = 0; i < mem.length; i++) {
//				if(mem[i].getEmail().equals(search)) {  // 객체배열 mem 에서 Email 를 get 해온게 검색키워드랑 일치하는게 있으면, 그 회원 정보를 출력
//					searchMember = mem[i];
//					return searchMember;
//				}else {
//					System.out.println("비정상종료");
//					break;
//				}
//			}
//		}else if(menu == 9) { // 이전 메뉴로
//			MemberMenu mm = new MemberMenu();
//			mm.mainMenu();
//			return null;
//		}else {
//			
//			System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요 ( 1 ~ 3 , 9 )");
//		}
		
		return searchMember;
		
	} // searchMember 끝 내가 짯는데 내가 모르겠는데요
	
	public void updateMember(Member m, int menu, String update) {
		
	}
	
	public void deleteMember(String userId) {
		
	}
	
	public Member[] sortIdAsc() {
		
		return null;
	}
	
	public Member[] sortIdDesc() {
			
			return null;
		}
	
	public Member[] sortAgeAsc() {
		
		return null;
	}
	
	public Member[] sortAgeDesc() {
		
		return null;
	}
	
	public Member[] sortGenderDesc() {
		
		return null;
	}
}









