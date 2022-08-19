package com.uni.section02.looping_statement;

import java.util.Scanner;

public class B_while {
	/**
     * * while문
     * 
     * [초기식]
     * 
     * while(조건식) {
     *       반복적으로 실행할 코드;
     *       [증감식]
     * }
     * 
     * 조건식이 true일 경우 해당 실행코드 실행
     * 
     * 조건식 검사 --> true일 경우 실행코드 실행
     * 조건식 검사 --> true일 경우 실행코드 실행
     * 조건식 검사 --> false일 경우 실행코드 실행 X --> 반복문 빠져 나감
     * 
     * 
     */
	
	
	/* 1부터 10까지 1씩 증가시키면서 (10번) i값을 출력하는 기본 반복문*/
	public void testSimpleWhileStatement() {
		int i = 1;
		while(i < 10) {
			System.out.println("현재 i의 값 : " + i );
			i = i + 1;
			}
	}  // testSimpleWhileStatement end

	public void testWhileExample1() {
		/* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		/* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능 */
	      /* length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환한다. */
	      /* index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다. 
	       * 만약 존재하지 않는 인덱스에 접근하게되면 StringIndexOutOfBoundsException이 발생한다.!!*/
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			
			System.out.println(index + " : " + ch);
			index = index + 1;
		}
		
		
		for(int j=0; j <str.length(); j++ ) {
			char ch = str.charAt(j);
			
			System.out.println(j + " : " + ch);
			
		}
	} // testWhileExample1 end
	
	public void testWhileExample2() {
		/**<pre>
	    * while문 연습을 위한 예제2
	    * 1부터 입력받은 정수 까지의 합계를 구하는 예제
	    * </pre>
	    */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 어디까지의 합을 구할까요? 정수 입력 : ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			sum = sum + i;
			i = i + 1;
		}
		
		System.out.println("1부터 "+ num +"까지의 합은" + sum + "입니다.");
	}  //testWhileExample2 end
	

	public void testWhileExample3() {
		/**<pre>
	    * while문 연습을 위한 예제3
	    * while문을 이용하여 구구단을 2단부터 9단까지 출력
	    * </pre>
	    */
	   int i = 2;
	   int j = 1;
		
		while(i <= 9) {
			while(j <= 9) {
				System.out.println(i+ " * " +j+ " = "+ (i * j));
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
			j = 1;
		}	   
		   
	} // testWhileExample3 end
}
