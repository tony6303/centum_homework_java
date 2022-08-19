package com.uni.section03.math;

public class Applicaion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* java.lang.Math */
	      /* Math 클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스 이다.
	       * API문서 보는거 설명하면서 static member로만 구성되어 있는 것을 보여준다.
	       * 다른 클래스에 정의된 static 메소드호출을 할 수 있을 것이다.
	       * */
		
		System.out.println("-7 의 절대값 : " + java.lang.Math.abs(-7));
		
		
		System.out.println("-7 의 절대값 : " + Math.abs(-7));
		
		
		// 0.0 ~ 9.9999+  1 000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		System.out.println("난수 발생 " + Math.random());
	}

}
