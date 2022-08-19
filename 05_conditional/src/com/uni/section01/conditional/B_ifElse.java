package com.uni.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

	public void testSimpleIfElseStatement() {
		   /* [if-else문 표현식]
	       * if(조건식) {
	       *     조건식이 true일 때 실행할 명령문;
	       * } else {
	       *     조건식이 false일 때 실행할 명령문;
	       * }
	       * */
	      
	      /* if문은 조건식의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
	       * 조건식의 결과 값이 거짓(false)이면  else { } 안에 있는 코드를 실행한다.
	       * */
	      
	      /* 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야 하는 경우 많이 사용된다. */
	      
	      /* 정수 한 개를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
	       * 홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자 
	       * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
	       * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한 개를 입력하세요");
		
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 1) {
			System.out.println("입력하신 수는 홀수 입니다");
		}else {
			System.out.println("입력하신 수는 짝수 입니다");
		}
		
		System.out.println("프로그램을 종료 합니다");
	}
	
	
	
	   public void testNestedIfElseStatement() {
		      
		      /* 중첩된 if-else 문 실행 흐름 확인 */
		      /* if-else 문 안에서 또 다른 조건을 사용하여 if-else 문을 사용할 수 있다. */
		      
		      /* 숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고, 
		       * 음수이면 "입력하신 숫자는 음수 입니다." 출력
		       * 단, 0이면 "0입니다" 라고 출력하세요(같이 풀면서 중첩if-else 설명)
		       * 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
		       * */
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("정수 한 개를 입력하세요");
		   
		   int num1 = sc.nextInt();
		   
		   if(num1 > 0) {
			   System.out.println("양수 입니다");
			   
		   }else if(num1 == 0){
			   System.out.println("0 입니다");
			   
		   }else {
			   System.out.println("음수 입니다");
			   
		   }
		   
	   }

}
