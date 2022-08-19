package array_practice.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * 검색할 문자를 하나 입력 받아 
		 * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 문자열을 하나 입력하세요 : helloworld
		 * 검색할 문자를 입력하세요 : l
		 * 
		 * -- 출력 예시 --
		 * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		 * */

		Scanner sc = new Scanner(System.in);
		int count = 0; // 문자 갯수 카운트 변수

		System.out.println("문자열 하나를 입력하세요 : ");
		String str = sc.nextLine();

		System.out.println("검색할 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);

		char[] carr = str.toCharArray(); // 문자열 배열을 문자 자료형 배열로 변환하는 함수

		for (int i = 0; i < carr.length; i++) {
			if (ch == carr[i]) {
				count = count + 1; // 인덱스0 부터 배열의 끝 까지 '문자 자료형 배열' 과 '검색할 문자'가 일치하면 카운트 1개 상승
			}
		}

		System.out.println("입력하신 문자열" + str + "에서 찾으시는 문자 " + ch + "은(는) " + count + "개 입니다.");
	}
}
