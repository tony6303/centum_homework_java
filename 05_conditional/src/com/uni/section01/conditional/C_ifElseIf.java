package com.uni.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

	/*
	 * [if-else-if문 표현식] if(조건식1) { 조건식1이 true일 때 실행할 명령문; } else if(조건식2) { 조건식1이
	 * false이고 조건식2가 true일 때 실행할 명령문; } else { 위의 조건 2개가 모두 거짓인 경우 실핼할 명령문; }
	 */

	/*
	 * if-else-if문은 조건식1의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고, 조건식1이 false이면 조건식2를
	 * 확인하여 참(true)이면 else if { } 안에 있는 코드를 실행한다. 조건식1, 2의 결과 값이 모두 거짓(false)이면 else
	 * { } 안에 있는 코드를 실행한다.
	 */

	/* 여러 개의 조건을 제시하여 그 중 한 가지를 반드시 실행시키고 싶은 경우 사용한다. */

	/*
	 * 금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오대로 코드를 작성하고 실행하보자!
	 */

	public void testSipmleIfElseIfStatement() {
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

		System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
		Scanner sc = new Scanner(System.in);

//	      int answer = sc.nextInt();
//	      
//	      if(answer == 1) {
//	    	  System.out.println("거짓말을 하는구나 금도끼는 내 것이다");
//	      }else if(answer == 2) {
//	    	  System.out.println("거짓말을 하는구나 은도끼는 내 것이다");
//	      }else if(answer == 3){
//	    	  System.out.println("사실대로 말하였으니 금도끼 은도끼 모두 주겠다");
//	      }else {
//	    	  System.out.println("무슨 소리를 하는지 모르겠구나");
//	      }

		String answer = sc.nextLine();

		if (answer.equals("금도끼")) {
			System.out.println("거짓말을 하는구나 금도끼는 내 것이다");
		} else if (answer.equals("은도끼")) {
			System.out.println("거짓말을 하는구나 은도끼는 내 것이다");
		} else if (answer.equals("쇠도끼")) {
			System.out.println("사실대로 말하였으니 금도끼 은도끼 모두 주겠다");
		} else {
			System.out.println("무슨 소리를 하는지 모르겠구나");
		}

	}

	public void testNestedIfElseIfStatement() {
		/* 중첩된 if-else-if 문 실행 흐름 확인 */
		/* if-else-if 문 안에서 또 다른 조건을 사용하여 if or if-else or if-else-if 문을 사용할 수 있다. */

		/*
		 * 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다. 90점 이상이면 'A', 80점 이상이면
		 * 'B', 70점 이상이면 'C', 60점 이상이면 'D'를 60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다. 추가로 각 등급의
		 * 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다. 그래서 학생의 이름과 점수를
		 * 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
		 */

		// 학생의 이름과 점수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("학생의 점수를 입력하세요 : ");
		int point = sc.nextInt();

		String grade = "";

		if (point >= 90) {
			grade = "A";
			if (point >= 95) {
				grade = "A+";
			}
		} else if (point >= 80) {
			grade = "B";
			if (point >= 85) {
				grade = "B+";
			}
		} else if (point >= 70) {
			grade = "C";
			if (point >= 75) {
				grade = "C+";
			}
		} else if (point >= 60) {
			grade = "D";
			if (point >= 65) {
				grade = "D+";
			}
		} else if (point < 60 && point >= 0) {
			grade = "F";
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}

		/* 위에서 결정된 등급을 점수와 함께 출력한다. */
		System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
		System.out.println("프로그램을 종료합니다.");

		sc.close();
	} // Nested End

	public void improveNestedIfElseIfStatement() {
		// 학생의 이름과 점수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("학생의 점수를 입력하세요 : ");
		int point = sc.nextInt();

		String grade = "";

		if (point >= 90) {
			grade = "A";

		} else if (point >= 80) {
			grade = "B";

		} else if (point >= 70) {
			grade = "C";

		} else if (point >= 60) {
			grade = "D";

		} else if (point < 60 && point >= 0) {
			grade = "F";
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}

		if (point % 10 >= 5 && point >= 60 || point == 100) {
			grade = grade + '+';
		}

		/* 위에서 결정된 등급을 점수와 함께 출력한다. */
		System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
		System.out.println("프로그램을 종료합니다.");

		sc.close();

	} // improve End

	/*
	 * [switch문 표현식] switch(비교할변수) { case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break; case
	 * 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break; default : case에 모두 해당하지 않는 경우 실행할 구문;
	 * break; }
	 */

	/*
	 * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다. 따라서 일부 호환이 가능하다. 하지만,
	 * switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다. 실수와 논리는 비교할 수 없다. 또한 정확하게 일치하는 경우만
	 * 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다. case절에는 변수를 사용하지 못한다. (값만 비교 가능) 또한, 문자열 비교는
	 * jdk 1.7 이상부터 가능하다.
	 */
	public void testSimpleSwitchStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		int result = 0;

		switch (op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		case '%':
			result = first % second;
			break;
		default:
			break;
		}
		System.out.println(first + " " + op + " " + second + " = " + result);
	} // SimpleSwitchStatement End
	
	
	public void testSwitchVendingMachine() {

	      /* switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
	      /* 1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다. 
	       * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다. */
	      
	      /* switch문을 이용한 간단한 자판기 */
	      System.out.println("=== OhGiraffers vending machine ===");
	      System.out.println("  사이다   콜라   환타   바카스  핫식스  ");
	      System.out.println("==============================");
	      System.out.print("음료를 선택해주세요 : ");
	      
	      /* 원하는 음료를 문자열로 입력받음 */
	      Scanner sc = new Scanner(System.in);
	      String selectedDrink = sc.nextLine();
	      
	      /* 원하는 음료에 맞는 가격을 저장할 변수 */
	      int price = 0;
	      
	      

	      /* 선택한 메뉴에 따라 구문이 출력은 된다. (문자열 비교 가능함) */
	      /* 하지만 한 개의 메뉴를 선택해도 그 메뉴 이후의 메뉴가 전부 선택이 되는 이상한 자판기가 되었다. 
	       * 가격 또한 음료별로 다르지만 마지막 메뉴 가격인 10000원으로 고정되어 있다.
	       * */
	      switch(selectedDrink) {
	         case "사이다" :
	            System.out.println("사이다를 선택하셨습니다.");
	            price = 500;
	            break;
	         case "콜라" : 
	            System.out.println("콜라를 선택하셨습니다.");
	            price = 600;
	            break;
	         case "환타" : 
	            System.out.println("환타를 선택하셨습니다.");
	            price = 700;
	            break;
	         case "바카스" : 
	            System.out.println("바카스를 선택하셨습니다.");
	            price = 2000;
	            break;
	         case "핫식스" : 
	            System.out.println("핫식스를 선택하셨습니다.");
	            price = 10000;
	            break;
	      }
	      
	      System.out.println(price + "원을 투입해주세요!");
	      
	      
	} // VendingMachine End
	
	
	//1~12월 까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요 
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 12월의 마지막날을 알려드리겠습니다 1 ~ 12 중 입력해주세요");
		int month = sc.nextInt();
		
		if(month == 1 )
		
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month +"월의 마지막날은 31일 입니다");
			break;
		case 2:
			System.out.println(month +"월의 마지막날은 28일 입니다");
			break;
		case 4, 6, 9, 11:
			System.out.println(month +"월의 마지막날은 30일 입니다");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다");
			break;
		}
		// 무식하게 sysout 12번 하고있었는데 역시 효율적인 방법이 있었다.
		
		
	}
}
