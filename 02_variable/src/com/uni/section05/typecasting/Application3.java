package com.uni.section05.typecasting;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int inum = 10;
		long lnum = 100;
		
		
		// 방법 1. 두 수의 연산 결과를 int 형으로 변환 후 int 자료형 변수에 리턴 받는다.
		
		int isum = (int) (inum + lnum);
		System.out.println("inum + lnum : " + isum);
		
		
		// 방법 2. long형 값을 계산 할 때 부터 int 형으로 강제 형 변환 한다.
		int isum2 = inum + (int)lnum;
		System.out.println("inum + (int)lnum : " + isum2);
		
		
		// 방법 3. 결과값을 long형 자료형으로 받는다 (자동 형 변환 이용)
		long lsum = inum + lnum;
		System.out.println("(long)(inum + lnum)" + lsum);
		
		// 주의 int 미만의 연산처리 결과는 int형이다.
		
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		
	    int result1 = byteNum1 + byteNum2;
	    int result2 = byteNum1 + shortNum1;
	    int result3 = shortNum1 + byteNum1;
	    int result4 = shortNum1 + shortNum2;
	      
	    System.out.println("result1 : " + result1);
	    System.out.println("result2 : " + result2);
	    System.out.println("result3 : " + result3);
	    System.out.println("result4 : " + result4);
		
		//byte result5 = byteNum1 + byteNum2;  // int미만의 연산결과는 int 인데, result5 의 자료형은 byte 라서 에러 !!
	    byte result5 = (byte) (byteNum1 + byteNum2);
		
	}

}
