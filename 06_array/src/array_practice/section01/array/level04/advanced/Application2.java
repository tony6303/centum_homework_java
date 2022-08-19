package array_practice.section01.array.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		/* 숫자 야구게임 만들기 
		 * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
		 * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
		 * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
		 * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
		 * 
		 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
		 * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
		 * 
		 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
		 * 횟수는 차감하지 않는다.
		 * 
		 * -- 프로그램 예시 (난수 7416 의 경우) --
		 *
		 * 10회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 1234
		 * 아쉽네요 0S 2B 입니다.
		 * 9회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 5678
		 * 아쉽네요 0S 2B 입니다.
		 * 8회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 7416
		 * 정답입니다.
		 * */

		Scanner sc = new Scanner(System.in);

		int[] answerArr = new int[4];
		for (int i = 0; i < answerArr.length; i++) {
			if(i == 0) {
				answerArr[i] = (int) ((Math.random() * 9) + 1); // 1 부터 9까지의 난수 생성후 배열에 초기화
			}else {
				answerArr[i] = (int) (Math.random() * 10); // 0 부터 9까지의 난수 생성후 배열에 초기화
			}
			

			for (int j = 0; j < i; j++) { // 중복 제거, 다시 난수생성
				if (answerArr[i] == answerArr[j]) {
					i--;
				}
			} // 중복제거 for 끝

		} // 배열 초기화 for 끝

		System.out.print("답공개 : ");
		
		for(int i = 0; i < answerArr.length; i++) {
			
			System.out.print(answerArr[i]);
		}

		int[] challengeArr = new int[4]; 
		int challengeNum = 0;

		int S = 0;
		int B = 0;
		int life = 10;

		while (life != 0) {   // 게임 시작 !! 남은횟수가 0일 때 종료
			S = 0;
			B = 0;

			System.out.println("\n" + life + "회 남았습니다.");
			System.out.println("맞춰봐라");
			challengeNum = sc.nextInt();
			
			
			if (challengeNum > 9999 || challengeNum < 1000) {        // 4자리 정수 제대로 입력안하면 횟수 감소 하지않음
				System.out.println("4자리의 정수를 입력해야 합니다.");
			} else{
				for (int i = 0; i < challengeArr.length; i++) { // 
					if (i == 0) {   // 1000의 자리 비교
						challengeArr[i] = ((challengeNum % ((int) Math.pow(10, challengeArr.length - i))
								/ (int) Math.pow(10, (challengeArr.length - 1) - i)));
					} else {   // 100, 10, 1의자리 비교
						challengeArr[i] = (((challengeNum
								- (challengeArr[i - 1] * (int) Math.pow(10, challengeArr.length - i)))
								% ((int) Math.pow(10, challengeArr.length - i))
								/ (int) Math.pow(10, (challengeArr.length - 1) - i)));
					}
					/**
					 *challengeArr[0] = challengeNum % 10000 / 1000;
					 *challengeArr[1] = (challengeNum - (1000의자리 수 * 1000) % 1000) / 100;
					 *challengeArr[2] = (challengeNum - (100의자리 수 * 100) % 100) / 10;
					 *challengeArr[3] = (challengeNum - (10의자리 수 * 10) % 10) / 1; 
					 *
					 *
					 *7416  > 7
					 *416   > 4
					 *16    > 1
					 *6     > 6
					 *
					 */
//					System.out.println(challengeArr[i]);

				} // for 끝

				for (int i = 0; i < answerArr.length; i++) {
					if (answerArr[i] == challengeArr[i]) { // 스트라이크는 답 숫자, 도전 숫자의 자리수만 비교하면 된다.
//						System.out.println("임시 스트라이크 i = " + i);
						S++;
					}
					for (int j = 0; j < answerArr.length; j++) { // 볼은 답 숫자, 도전 숫자를 비교할 때 같은 자리 숫자와의 비교는 제외 해야한다.
						if ((answerArr[i] == challengeArr[i])) {
							continue;
						}
						if (answerArr[j] == challengeArr[i]) {
//							System.out.println("임시 볼 i = "+ i +" j =" + j);
							B++;
						}
					} // j 반복문 끝

				} // i 반복문 끝
				if (S == 4) {
					System.out.println("정답입니다~");
					return;
				}

				System.out.println("아쉽네요 " + S + "S" + B + "B 입니다.");

				life--;
			} // 4자리정수 입력요구 else 끝

		} // while 끝

//		System.out.println(challengeNum % 10000 / 1000);    // 10의 4 / 10의 3    0일때 3    4-i/  3-i
//		System.out.println((challengeNum - (challengeNum % 10000 / 1000)* 1000) / 100);
//		System.out.println(challengeNum % 1000 / 100);		 //10의 3 / 10의 2       1일때 2   
//		System.out.println(challengeNum % 100 / 10);        // 10의 2 / 10의 1      2일때 1
//		System.out.println(challengeNum % 10 / 1);          // 10의 1 / 10의 0      3일때 0
//		System.out.println((int)Math.pow(10,4));
//		System.out.println((int)Math.pow(10,3));
//		System.out.println((int)Math.pow(10,2));
//		System.out.println((int)Math.pow(10,1));

//			challengeArr[0] = challengeNum % 10000 / 1000;
//			challengeArr[1] = challengeNum - 0번수 * 1000 % 1000 / 100;
//			challengeArr[2] = challengeNum % 100 / 10;
//			challengeArr[3] = challengeNum % 10 / 1;
//			? = 7416 % 10000 / 1000 = 7
//			? = 416 % 1000 / 100 = 4

		System.out.println("프로그램 종료");

	} // main 끝
}
