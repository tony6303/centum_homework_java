package com.uni.section02.looping_statement;

import java.util.Scanner;

public class C_doWhile {
	
	/**
     * * do-while문
     * 
     * [초기식]
     * 
     * do{
     *       반복적으로 실행할 코드;
     * 
     *       [증감식]
     * 
     * }while(조건식); 
     * 
     * 
     * 초기식  --> 무조건 한번은 실행 --> 증감식 
     * 조건식 --> true일 경우 실행 --> 증감식
     * 조건식 --> true일 경우 실행 --> 증감식
     * 조건식 --> false일 경우 빠져나감
     * 
     * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
     * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
     * 
     */
	
	public void testSimpleDoWhileStatement() {

		do {
			System.out.println("i can do");
		} while (false);

	} // testSimpleDoWhileStatement end

	/**
	 * <pre>
	* do-while문 연습을 위한 예제1
	* 입력한 문자열을 반복적으로 출력한다.
	* 단, exit가 입력되면 반복을 멈춘다.
	 * </pre>
	 */
	public void testDoWhileExample1() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("입력 값 : " + str);
		}while(!str.equals("exit"));   // str이  exit 가 아니면 반복한다
		
		System.out.println("종료합니다");
		
		
	} // testDoWhileExample1 end
}
