package com.uni.section01.literal;
/**패키지 선언부
 * 가장 첫번째줄에 작성해야한다
 * 모든 클래스는 패키지 내에 존재해야한다
 * 
 * section01.uni.com
 * 보통 패키지 이름은 도메인(홈페이지주소)의 역순이다. ( 사실 간단한 실습할때는 아무거나 적어도 상관없다 )
 * 왜냐하면 홈페이지의 주소는 인터넷 상에서 유일한 주소이기 때문에 (쉽게말하면 중복 방지)
 * 
 *  [] 대괄호
 *  {} 중괄호
 *  () 소괄호
 *  
 *  탭 = 공백4칸
 *  Shift + 탭 = 공백4칸 후진  ( 탭 사용은 들여쓰기 하기에 아주 유용합니다 )
 *  
 *  
 *  Ctrl + Shift + f = 코드 자동 정렬
 * 	
 */
public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 여러 가지 값의 형태를 출력해보자 */
	      /* 1. 숫자 형태의 값
	       *  1-1. 정수 형태의 값
	       *  1-2. 실수 형태의 값
	       * 2. 문자 형태의 값
	       * 3. 문자열 형태의 값
	       * 4. 논리 형태의 값
	       */
	      
	      /* 1. 숫자 형태의 값 */
	      /* 1-1. 정수 형태의 값 출력 */
	      System.out.println(123);
	      /* 1-2. 실수 형태의 값 출력 */
	      System.out.println(1.23);
	      
	      /* 2. 문자 형태의 값 출력 */
	      System.out.println('a');         
	      //System.out.println('ab');         
	      //System.out.println('');         
	      System.out.println('1');         
	      
	      /* 3. 문자열 형태의 값 출력 */
	      System.out.println("안녕하세요");      
	      System.out.println("123");         
	      System.out.println("");            
	      System.out.println("a");         
	      
	      /* 4. 논리 형태의 값 출력 */
	      System.out.println(true);
	      System.out.println(false);      
	}
}
