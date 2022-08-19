package array_practice.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
		 * 성별 자리 이후부터 *로 가려서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 주민등록번호를 입력하세요 : 990101-1234567
		 * 
		 * -- 출력 예시 --
		 * 990101-1******
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록번호를 입력하세요 : ");
		String jumin = sc.nextLine();

		char[] carr = jumin.toCharArray(); // 문자열 배열을 문자 자료형 배열로 변환하는 함수

		for (int i = 0; i < carr.length; i++) {
			for (int j = 8; j <= 13; j++) {
				carr[j] = '*'; // 문자형 배열 인덱스를 직접 지정해서 * 문자를 대입함
			}

			System.out.print(carr[i]); // 문자 자료형 배열 모두 출력
		}

	}
}
