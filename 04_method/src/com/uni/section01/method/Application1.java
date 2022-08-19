package com.uni.section01.method;

import com.sun.jdi.Method;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메소드란? */
      /* 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
       * 자세한 메소드 사용법은 객체 부분에서 다루게 되니 지금은 호출 흐름에 대해 이해할 수 있도록 하자.
       *  */
		
		
		System.out.println("main 시작됨");
		
		
		Application1 app1 = new Application1();
		// 클래스명 사용할이름  = new 클래스명();         // 객체 생성
				
		app1.methodA();
		// 사용할이름.메소드명();                   // 메소드 호출
		
		
		System.out.println("main 종료됨");
	}
	
	
	public void methodA() {
		System.out.println("methodA() 호출함");
		
		methodB();
		
		System.out.println("methodA() 종료됨");
	}

	public void methodB() {
		System.out.println("methodB() 호출함");
		
		methodC();
		
		System.out.println("methodB() 종료됨");
	}
	
	public void methodC() {
		System.out.println("methodC() 호출함");
		
		System.out.println("methodC() 종료됨");
	}
	
}