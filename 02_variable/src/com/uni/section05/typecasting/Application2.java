package com.uni.section05.typecasting;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      /* 강제형변환 */
	      /* 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다. 
	       * 예) (바꿀자료형) 값; 
	       * */
	      
	      /* 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다. */
	      /* 1. 강제 형변환 규칙
	       * 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
	       * 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
	       * 1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
	       * 1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
	       * */
	      
	      /* 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. */
	      /* 1-1-1. 정수 끼리의 강제 형변환 */
		long lnum = 8;
		
		//int inum = lnum; //데이터 손실 가능성을 컴파일러가 알려준다.
		int inum = (int) lnum;
		
		
		short snum = (short) inum;
		byte bnum = (byte) snum;
		
		/* 1-1-2. 실수 끼리의 강제 형변환 */
		double dnum = 8.0;
		// float fnum = dnum;  // 데이터 손실 가능성을 컴파일러가 알려준다.
		float fnum = (float) dnum;
		
		
		 /* 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
		float fnum2 = 4.0f;
		
		// long lnum2 = fnum2;  // float는 4byte, long 은 8byte 임에도 자동 형변환 불가능 (소수점 자리 이하 데이터 손실 가능성)
		long lnum2 = (long) fnum2;
		
		
		/* 1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환이 필요하다. */
		char ch = 'a';
		
		//byte bnum2 = ch;
		byte bnum2 = (byte) ch; 
		
		
	}

}










