package com.uni.section02.variable;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /* 변수를 사용하기 위한 방법 */
	      /* 1. 변수를 준비한다.(선언)
	       * 2. 변수에 값을 대입한다.(값 대입 및 초기화)
	       * 3. 변수를 사용한다.
	       * */
	      
	      /* 1. 변수를 준비한다. (선언) */
	      /* 1-1. 변수를 선언하는 방법 */
	      /* 자료형 변수명; */
	      
	      /* 자료형이란?
	       * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
	       * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다.
	       * 이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
	       * 그 중 기본자료형 8가지 부터 살펴보기로 한다.
	       *  */
		
		/* 1-1-1. 숫자를 취급하는 자료형 */
	      
	      byte bnum;         //1byte
	      short snum;         //2byte
	      int inum;         //4byte
	      long lnum;         //8byte
		
	      /* 1-1-2. 실수를 취급하는 자료형 */
	      
	      float fnum;     //4byte
	      double dnum;      //8byte
	      
	      /* 1-1-3. 문자를 취급하는 자료형 */
	      char ch;			//2byte
	      char ch2;			//
	      
	      /* 1-1-4. 논리값를 취급하는 자료형 */
	      boolean isTrue;		//1byte
	      
	      /* 1-1-5. 문자열을 취급하는 자료형 */
	      String str;		
	      
	      
	      /* 변수에 값 대입
	       * 위에서 값을 담기위한 공간을 확보했다면 해당 변수에 값 대입 가능 
	       * 
	       * [표현법] 변수명 = 값;
	       * */
	      /* 2-1. 정수를 취급하는 자료형에 값 대입 */
	      bnum = 1;
	      snum = 2;
	      inum = 4;
	      lnum = 8L;
	      
	      /* 2-2. 실수를 취급하는 자료형에 값 대입 */
//	      fnum = 4.0; 실수형의 기본 값이 double 이기때문에 f 안 붙이면 사용불가능
	      
	      fnum = 4.0f;
	      dnum = 4.0;
	      
	      /* 2-3. 실수를 취급하는 자료형에 값 대입 */
	      ch = 'a';
	      ch2 = 97;

	      /* 2-4. 자료형에 값 대입 */
	      isTrue = true;
	      isTrue= false;
	      
	      
	      /* 2-5. 문자열을 취급하는 자료형에 값 대입 */
	      str = "안녕하세요";
	      
	      System.out.println("========== 변수에 저장된 값 출력 ===========");
	      System.out.println("bnum의 값 : " + bnum);
	      System.out.println("snum의 값 : " + snum);
	      System.out.println("inum의 값 : " + inum);
	      System.out.println("lnum의 값 : " + lnum);
	      
	      System.out.println("fnum의 값 : " + fnum);
	      System.out.println("dnum의 값 : " + dnum);
	      
	      System.out.println("ch의 값 : " + ch);
	      System.out.println("ch2의 값 : " + ch2);
	      
	      System.out.println("isTrue의 값 : " + isTrue);
	      
	      System.out.println("str의 값 : " + str);
	}

}
