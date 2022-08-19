package com.uni.section05.logical_operator;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      /* 논리 연산자의 우선순위와 활용 */
	      /* 논리 and 연산자와 논리 or 연산자의 우선선위
	       * && : 11순위
	       * || : 12순위
	       * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다
	       * */
	      
	      int x = 3;
	      int y = 10;
                                    //( F   &&  T   ) = False
	      System.out.println(y >= 5 || x < 0 && x > 2); //true
	      
	      /* 1. 1부터 100 사이의 값인지 확인 */
	      /* 1 <= 변수 <= 100 이렇게는 사용 못함  --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
	      
	      int num1 = 55;
	      boolean result1 = ( num1 >= 1 && num1 <= 100 );
	      System.out.println("1부터 100 사이의 값인지 확인 : " + result1);
	      
	      
	      /* 2. 영어 대문자인지 확인 */
	      /* 영어 대문자냐? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
	      
	      char ch1 = 'G';
	      System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z') );	      
	      
//	      3. 대소문자 상관없이 영문자 y 인지 확인
	      char ch2 = 'y';
	      System.out.println("대소문자 상관없이 영문자 y 인지 확인 : " + (ch2 == 'y' || ch2 == 'Y' ));
	      
//	      4. 영문자 인지 확인
	      char ch3 = 't';
	      char ch4 = '가';	    		  
	      System.out.println("영문자 인지 확인 : " + ((ch3 >= 'a' && ch3 <= 'z')||(ch3 >= 'A' && ch3 <= 'Z')));
	      System.out.println("영문자 인지 확인 : " + ((ch4 >= 'a' && ch4 <= 'z')||(ch4 >= 'A' && ch4 <= 'Z')));
	      
	      /* A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
	      /* 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 된다.
	       * 하지만 연산자 우선순위를 디테일하게 학습하고 개발하는 개발자가 적은 현실로 인해
	       * 논리적으로 먼저 실행하는 내용을 괄호로 묶어 주는게 좋다.
	       * */
	      
	      
	      
	      /**
	       *  && : 두 개의 조건이 모두 true 여야 결과값이 true이다. (AND)
	       *  
	       *  true && true    => true
	       *  true && false    => false
	       *  false && true   => false
	       *  false && false    => false
	       *  
	       *  --> && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건은 굳이 실행하지 않는다. 
	       *  
	       *  || : 두 개의 조건이 하나라도 true라면 결과값이 true이다. (OR)
	       *  
	       *  true || true    => true
	       *  true || false    => true
	       *  false || true   => true
	       *  false || false   => false
	       * 
	       * --> || 연산자를 기준으으로 앞의 결과가 true가 나온다면 뒤의 조건은 굳이 실행하지 않는다. 
	       */
	      /* AND 연산과 OR 연산의 특징 
	       * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
	       * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
	       * */
	      
	      /* 1. 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함  */
	      /* 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
	       * 뒤의 조건을 확인할 필요 없이 false를 반환한다.
	       * 따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다. 
	       * */
	      int num500 = 10;
	      int result500 = (false && ++num500 > 0)? num500 : num500;
	      
	      int myTest = 50;
	      int myResult = (myTest >=500 && ++num500 > 0)? num500 : num500;   
	      // && 앞의 비교조건이 false 이기 때문에 , && 뒷문장은 비교 하지도 않는다
	      
	      System.out.println("&& 실행확인 : " + result500);
	      System.out.println("&& 실행확인2 : " + myResult);
	      
	      /* 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함 */
	      /* 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
	       * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
	       * 따라서 연산 횟수를 줄이기 위해서는 ||연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다. 
	       * */
	      int num501 = 10;
	      int result501 = (true || ++num501 > 0)? num501 : num501;   
	      // && 앞의 비교조건이 false 이기 때문에 , && 뒷문장은 비교 하지도 않는다
	      
	      System.out.println("|| 실행확인 : " + result501);
	      
	}

}


