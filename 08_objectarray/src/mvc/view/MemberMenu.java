package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	
	private Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	
	
	
	public void mainMenu() {
		while(true){
			
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1. 신규 회원 등록"); // insert
			System.out.println("2. 회원 정보 검색"); // search
			System.out.println("3. 회원 정보 수정"); // update
			System.out.println("4. 회원 정보 삭제"); // delete
			System.out.println("5. 회원 정보 출력"); // printAll
			System.out.println("6. 회원 정보 정렬"); // sort
			System.out.println("9. 프로그램 종료");
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1:
				// insertMember 실행
			case 2:
				searchMember();   // 구현 완료
			case 3:
				// updateMember 실행
			case 4:
				// deleteMember 실행
			case 5:
				// getMem 반복문으로 실행
			case 6:
				
			case 9:
				System.out.println("프로그램을 종료 합니다");
				return;
			}
			break;
			
		}
	}
	
	public void insertMember() {
		if(mc.SIZE > 10) {
			return;
		}else {
			mc.getMemberCount(); // 현재 회원 수 가져오기
			
		}
	}
	
	public void searchMember() {
		while(true){
			
			
			System.out.println("===== 회원 정보 검색 =====");
			System.out.println("1. 아이디로 검색하기"); // insert
			System.out.println("2. 이름으로 검색하기"); // search
			System.out.println("3. 이메일로 검색하기"); // update
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if(num == 9) {
				mainMenu();
			}else if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력 하셨습니다 이자식아");
				searchMember();
			}
			
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();
			
			switch(num) {
			case 1:
			case 2:
			case 3:
				if(mc.searchMember(num, search) == null) {
					System.out.println("검색된 결과가 없습니다.");
					break;
				}else {
					System.out.println(mc.searchMember(num, search).information()); 
				}
			} // switch 끝
		}
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
			
	}
}
