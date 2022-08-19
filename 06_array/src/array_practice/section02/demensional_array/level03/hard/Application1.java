package array_practice.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {

public static void main(String[] args) {
		
		/* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
		 * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
		 * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
		 * 
		 * -- 출석부 --
		 * 1. 홍길동
		 * 2. 이순신
		 * 3. 유관순
		 * 4. 윤봉길
		 * 5. 장영실
		 * 6. 임꺽정
		 * 7. 장보고
		 * 8. 이태백
		 * 9. 김정희
		 * 10. 대조영
		 * 11. 김유신
		 * 12. 이사부
		 * 
		 * -- 출력 예시 --
		 * == 1분단 ==
		 * 홍길동 이순신
		 * 유관순 윤봉길
		 * 장영실 임꺽정
		 * 
		 * == 2분단 ==
		 * 장보고 이태백
		 * 김정희 대조영
		 * 김유신 이사부
		 * 
		 * 출력한 이후 학생 이름을 입력 받아 몇 분단 몇 번째 줄 왼쪽/오른쪽 에 위치하는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 검색할 학생 이름을 입력하세요 : 대조영
		 * 검색하신 대조영은 2분단 두 번째 줄 오른쪽에 있습니다.
		 */
			String[] strArr = { "홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부" };
			String[][] teamOne = new String[3][2];
			String[][] teamTwo = new String[3][2];  // 정변배열 선언, 할당
		
			int index = 0;
			System.out.println("== 1분단 ==");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
		
					teamOne[i][j] = strArr[index];
					index++;
		
					System.out.print(teamOne[i][j] + " ");
				}
				System.out.println();
			}
			// 현재 index = 6
		
			System.out.println("== 2분단 ==");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
		
					teamTwo[i][j] = strArr[index];
					index++;
		
					System.out.print(teamTwo[i][j] + " ");
				}
				System.out.println();
			}
			Scanner sc = new Scanner(System.in);
			
			System.out.println("검색할 학생 이름을 입력하세요 : ");
			String name = sc.nextLine();
			String where;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if(teamOne[i][j].equals(name)) {
						if(j==0) {
							where ="왼";
						}else {
							where ="오른";
						}
						System.out.println("검색하신 "+name+"은 1분단 "+(i+1) +"번째 줄"+where +"쪽에 있습니다.");
					}
					
				}
			}		
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if(teamTwo[i][j].equals(name)) {
						if(j==0) {
							where ="왼";
						}else {
							where ="오른";
						}
						System.out.println("검색하신 "+name+"은 2분단 "+(i+1) +"번째 줄 "+where +"쪽에 있습니다.");
					}
				}
			}
			
	
	}
}
