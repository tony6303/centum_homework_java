package com.uni.section02.looping_statement;

import java.util.Random;
import java.util.Scanner;

public class A_for {
	/**
	 * 반복문 : 프로그램의 수행흐름을 제어하는 제어문중 하나, 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * for문/while문( do- while문)
	 * 
	 * *for문
	 * 
	 * for(초기식;조건식;증감식){//반복 횟수를 지정하기위해서 제시하는것들 ..반복적으로 실행시키고자 하는 실행 구문..
	 * 
	 * }
	 * 
	 * -초기식 : 반복문이 수행될때 "단 한번만 실행되는 구문" (보통 반복문 안에서 사용될 변수를 선언하고 초기값을 대입하는 구문) -조건식
	 * : "반복문이 수행될 조건" 을 작성하는 구문 조건식이 true일 경우 해당 실행 구문을 실행 조건식이 false일 경우 반복을 멈추고
	 * 빠져나옴 (보통 초기식에서 사용된 변수를 가지고 조건식을 작성) -증간식 : 반복문을 제어하는 변수값을 증감시키는 부분 (주로 초기식에
	 * 제시한 변수를 가지고 증감 연산자 사용)
	 * 
	 * 
	 * for문 초기식--> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 --> 조건식 검사 -> true일 경우 실행구문을
	 * 실행 --> 증감식 --반복-- --> 조건식 검사 -> false일 경우 실행구문을 실행 하지 않음 --> 반복문을 빠져나옴
	 * 
	 * * 알아둘것 ~ for 문안에 있는 초기식, 조건식, 증감식은 모두 생략 가능 하긴 함(하지만 ; 은 반드시 필수 작성) 즉,for()
	 * 안에서만 생략 될뿐 모두 필요한 요소임.
	 */

	/* 반복문의 기본 흐름 테스트 */

	/*
	 * [for문 표현식] for(초기식; 조건식; 증감식) { 조건을 만족하는 경우 수행할 구문(반복할 구문); }
	 */

	public void testSimpleForStatement() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	} // testSimpleForStatement End

	/* 무엇을 반복하는지를 확인하고, 반복문으로 개선해보기 */

	/* 10명의 학생 이름을 입력받아 이름을 출력해보자 */
	/* 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해보자!! */
//    Scanner sc = new Scanner(System.in);
//    
//    System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//    String student1 = sc.nextLine();
//    System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//    
//    System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//    String student2 = sc.nextLine();
//    System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//    
//    System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//    String student3 = sc.nextLine();
//    System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//    
//    System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//    String student4 = sc.nextLine();
//    System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//    
//    System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//    String student5 = sc.nextLine();
//    System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//    
//    System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//    String student6 = sc.nextLine();
//    System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//    
//    System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//    String student7 = sc.nextLine();
//    System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//    
//    System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//    String student8 = sc.nextLine();
//    System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//    
//    System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//    String student9 = sc.nextLine();
//    System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//    
//    System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//    String student10 = sc.nextLine();
//    System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//    
//    System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

	public void testForExample1() {
		String[] student = new String[10]; // 원래 배열을 안쓰는 문제인데, 안쓰면 한 학생만 10번 출력하게되서 문제가 좀 어색해보였다

		for (int i = 0; i < student.length; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.print(i + 1 + "번째 학생의 이름을 입력해주세요 : ");
			student[i] = sc.nextLine();
			System.out.println(i + 1 + "번째 학생의 이름은 " + student[i] + "입니다.");
		}
		System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

	} // testForExample1 End

	public void testForExample2() {
		// 1 ~ 10의 합계를 구하여라
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합은 " + sum);
	} // testForExam2 End

	public void testForExample3() {
		// 5 ~ 10 사이의 난수를 발생시켜서 원하는 만큼 발생한 난수들의 합계를 구하여라
//		Random random = new Random();
//		int sum = 0;
//		
//		for(int i=0; i<5; i++) {
//			int randomNum = random.nextInt(6) +5;
//			System.out.println("생성된 난수 : " + randomNum);
//			
//			sum = sum + randomNum;
//		}
//		System.out.println("난수들의 합 : " + sum);

		
		// 5 ~ 10 사이의 난수를 발생시켜서 1부터 난수까지의 합계를 구하여라
		Random random = new Random();
		int sum = 0;

		int randomNum = random.nextInt(6) + 5;

		for (int i = 1; i <= randomNum; i++) {
			sum = sum + i;
		}
		System.out.println("생성된 난수 : " + randomNum);
		System.out.println("난수들의 합 : " + sum);

	} // testForExam3 End

	public void testForExample4() {

		/*
		 * 숫자 두 개를 입력 받아 작은 수 에서 큰 수까지의 합계를 구하세요 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		 */
		Scanner sc = new Scanner(System.in);

		int start = 0;
		int end = 0;
		int sum = 0;

		System.out.println("정수를 하나씩 총 두 개 입력 하세요");
		start = sc.nextInt();
		end = sc.nextInt();

		if (start > end) {
			int temp = 0;
			temp = start;
			start = end;
			end = temp;
		}

		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}

		System.out.println("합계 : " + sum);
	} // testForExam4 End

	public void printSimpleGugudan() {

		/*
		 * 키보드로 2~9 사이의 구구단을 입력받아 2~9 사이인 경우 해당 단의 구구단을 출력하고, 그렇지 않은 경우
		 * "반드시 2~9 사이의 양수를 입력해야 합니다. 출력"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 몇 단을 출력 할까요? (2 ~ 9) ");

		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
		}
		System.out.println("프로그램을 종료합니다");
	} // printSimpleGugudan End

	public void printGugudanFromTwoToNine() {
		/* 2단부터 단을 1씩 증가시키는 반복문 */

		for (int dan = 2; dan <= 9; dan++) {
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + dan * su);
			}
			System.out.println("=======");
		}

	} // printGugudanFromTwoToNine End

	public void printUpgradeGugudanFromTwoToNine() {

		/* 단을 2단부터 9단까지 하나씩 증가시킨다. */
		for (int dan = 2; dan < 10; dan++) {

			/* 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다. */
			printGugudanOf(dan);
			/* 한 단을 출력하고 한 줄을 띄운다. */
			System.out.println();
		}

	} // printUpgradeGugudanFromTwoToNine End 

	private void printGugudanOf(int dan) {
		for(int su=1; su<=9; su++) {
			System.out.println(dan*su);
		}
		
	} // printGugudanOf End
	
	
	public void printStarInputRowTimes() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력 할 행 수를 입력하세요");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
