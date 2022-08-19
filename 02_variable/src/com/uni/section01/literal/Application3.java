package com.uni.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /* 문자열 합치기 테스트 */
	      /* 문자열 합치기 결과를 미리 예측하며 코드를 작성해보자 */
	      System.out.println("=========== 두 개의 문자열 합치기 ===========");
	      System.out.println(9 + 9);            
	      System.out.println("9" + 9);         
	      System.out.println(9 + "9");         
	      System.out.println("9" + "9");         
	      
	      System.out.println("=========== 세 개의 문자열 합치기 ===========");
	      System.out.println(9 + 9 + "9");      
	      System.out.println(9 + "9" + 9);      
	      System.out.println("9" + 9 + 9);      
	      
	      /* 바로 위에서 문자열 합치기 한 999 결과를 918로 변경(숫자 연산을 먼저 실행)하고싶다면?? */
	      /* 상식 선에서 알고 있는 대로 괄호 기호를 이용해 숫자 연산을 묶어주게 되면 괄호 안에 있는 연산을 우선 수행한다. */
	      System.out.println("9" + (9 + 9));      
	      
	      /* 문자열 합치기 응용 */
	      /* 10과 20의 사칙연산 결과를 출력하세요 */
	      System.out.println("=========== 10과 20의 사칙연산 결과 ===========");
	      System.out.println(10 + 20);
	      System.out.println(10 - 20);
	      System.out.println(10 * 20);
	      System.out.println(10 / 20);
	      System.out.println(10 % 20);
	      
	      /* 결과는 맞게 출력 되지만 무슨 결과인지 구분하기 쉽지 않다. */
	      /* 문자열 합치기 기능을 응용하여 아래 출력 결과를 보기 좋게 변경해보자 */
	      System.out.println("=========== 10과 20의 사칙연산 결과 보기 좋게 출력 ===========");
	      // System.out.println("10과 20의 합은 : " + 10 + 20 + "입니다."); 
	      // 직접해보기
	      System.out.println("10과 20의 합은 : " + (10 + 20) + "입니다.");
	      System.out.println("10에서 20을 빼면 : " + (10 - 20) + "입니다.");
	      System.out.println("10과 20의 곱은 : " + (10 * 20) + "입니다.");
	      System.out.println("10에서 20을 나눈 몫은 : " + (10 / 20) + "입니다.");
	      System.out.println("10에서 20을 나눈 나머지는 : " + (10 % 20) + "입니다.");
	      
	      
	      
	   
	      System.out.println("기차");                      
	      System.out.println("기차" + "칙칙폭폭");          
	      System.out.println("기차" + 123 + 45 + " 출발"); 
	      System.out.println(123 + 45 + "기차" + "출발");  
	}

}
