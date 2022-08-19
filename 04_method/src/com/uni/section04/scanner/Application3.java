package com.uni.section04.scanner;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 스캐너 주의 사항 */
	      /* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
	       * 그래서 크게 두 가지 사항을 주의해야 한다.
	       * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때 
	       * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
	       * */
		
		/* 스캐너 객체 생성 */
	      Scanner sc = new Scanner(System.in);
	      
	      /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때  */
//	      입력 버퍼에 '뒷 문자 + 엔터' 값이 남아있어서  다음 next 명령에 자동으로 들어가기때문에 오류가 날 수도 있다.
//	      입력 버퍼에 '뒷 문자 + 엔터' 값이 남아있어서  다음 next 명령에 자동으로 들어가기때문에 오류가 날 수도 있다.
//	      입력 버퍼에 '뒷 문자 + 엔터' 값이 남아있어서  다음 next 명령에 자동으로 들어가기때문에 오류가 날 수도 있다.
//	      입력 버퍼에 '뒷 문자 + 엔터' 값이 남아있어서  다음 next 명령에 자동으로 들어가기때문에 오류가 날 수도 있다.
//	      입력 버퍼에 '뒷 문자 + 엔터' 값이 남아있어서  다음 next 명령에 자동으로 들어가기때문에 오류가 날 수도 있다.
//	      입력 버퍼에 '뒷 문자 + 엔터' 값이 남아있어서  다음 next 명령에 자동으로 들어가기때문에 오류가 날 수도 있다.
	      // 공백 포함한 숫자 2개를 입력해보세요.
	      
	      
//	      System.out.print("문자열을 입력해주세요 : ");
//	      String str1 = sc.next();            //공백이나 개행문자 전 까지를 읽어온다.
//	      System.out.println("str1 : " + str1);
//	      
//	      System.out.print("숫자를 입력해주세요 : ");
//	      int num1 = sc.nextInt();            //정수 값을 읽어온다.
//	      System.out.println("num1 : " + num1);
	      
	      
	      /* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
	      System.out.print("다시 숫자를 입력해주세요 : ");
	      int num2 = sc.nextInt();
	      System.out.println("num2 : " + num2);
	      
	      sc.nextLine();
	      System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
	      
	   
	      String str2 = sc.nextLine();
	      System.out.println("str2 : " + str2);      
	      
	}

}
