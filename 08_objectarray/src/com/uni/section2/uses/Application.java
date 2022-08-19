package com.uni.section2.uses;

import java.util.Scanner;

/**
 * @author tony6
 *	이 Application의 흐름이 웹MVC 의 흐름을 이해하는 기초중의 기초 !!!!!!! 
 *  진짜 중요 !!!!!!!!!!!
 */
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner 인스턴스 생성
		
		MemberManager memberManager = new MemberManager();  //  memberManager 인스턴스 생성
		MemberDTO[] members = null;   //  객체배열 선언 , 초기화

		while(true) {
			System.out.println("====회원관리프로그램====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1:
				members = memberManager.signUpMembers();   // MemberManager 클래스의 signUpMembers 함수를 이해하고, 무엇을 return 하는지 확인.
				break;
			case 2:
				memberManager.printAllMembers(members);
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
			
		} // while 끝
		
	}  // main 끝

}
