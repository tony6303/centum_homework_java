package array_practice.section02.demensional_array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 가로와 세로 길이를 정수형으로 입력 받아
		 * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
		 * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
		 * 
		 * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
		 * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
		 * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
		 * 
		 * -- 입력 예시 --
		 * 가로 행의 수를 입력하세요 : 5
		 * 세로 열의 수를 입력하세요 : 4
		 * 
		 * -- 출력 예시 --
		 * F H Z G 
         * W F O T 
         * O R X V 
         * W H J X 
         * W S S J 
		 * */ 
		// A (65) ~ Z (90)
		
		String[] str = new String[] {"",};
		
		Scanner sc = new Scanner(System.in);
		
		int row = 0;
		int col = 0;
		
		do {
			System.out.println("가로 행의 수를 입력하세요 : ");
			row = sc.nextInt();
					
			System.out.println("세로 열의 수를 입력하세요 : ");
			col = sc.nextInt();
			
			if(row > 10 || col > 10 || row < 0 || col < 0) {   // 행, 열이  10보다 크거나 ,  0보다 작으면 에러 출력
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.\n");
			}
				
		}
		while(row > 10 || col > 10 || row < 0 || col < 0);  // 10보다 크거나 0보다 작으면 조건에 맞을 때 까지 반복
		
			char[][] chArr = new char[row][col];   // 입력받은 값으로 정변배열 생성

			for (int i = 0; i < chArr.length; i++) {
				for (int j = 0; j < chArr[i].length; j++) {
					chArr[i][j] = (char)((int)(Math.random()*26) + 65 );   // 0,0 부터 순서대로 char 형변환 시킨 난수들 할당
					System.out.print(chArr[i][j] + " ");
				}
				System.out.println();
			}

		
	} // main 끝
}
