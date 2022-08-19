package array_practice.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고 
		 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
		 * 
		 * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 홀수인 양의 정수를 입력하세요 : 7
		 * 
		 * -- 출력 예시 --
		 * 1 2 3 4 3 2 1
		 * 1 2 3 4 5 4 3 2 1
		 * -- 입력 예시 --
		 * 홀수인 양의 정수를 입력하세요 : 8
		 * 
		 * -- 출력 예시 --
		 * 양수 혹은 홀수만 입력해야 합니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("홀수인 양의 정수를 입력하세요 : ");
		int size = sc.nextInt();
		if (size % 2 == 1) {
			int[] iarr = new int[size]; // 입력받은 size 만큼의 정수형 배열 선언, 할당

			for (int i = 0, value = 0; i <= size / 2; i++) {
				iarr[i] = value = value + 1; // size의 절반 인덱스까지 1씩 증가하는 값으로 할당 (value)

				for (int j = (size / 2) + 1, value2 = 1; j < iarr.length; j++) { // size의 절반 인덱스+1 부터(초기값) 1씩 커지는 값 으로
																					// 뺄셈 연산 (value2)
					iarr[j] = iarr[size / 2] - value2;
					value2 = value2 + 1;
				}
			}
			for (int index = 0; index < iarr.length; index++) { // 다시 0부터 배열 끝까지 올라가는 변수 만들어서 반복문으로 배열 출력
				System.out.print(iarr[index] + " ");
			}

		} else {
			System.out.println("양수 혹은 홀수만 입력해야 합니다.");
		}

	}
}
