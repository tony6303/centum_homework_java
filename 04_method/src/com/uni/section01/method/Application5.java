package com.uni.section01.method;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 메소드 리턴 테스트 */
	      /* 모든 메소드 내부에는 return; 이 존재한다.
	       * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
	       * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
	       * */
		
		System.out.println("main() 메소드 시작");
		
		Application5 app = new Application5();
		app.testMethod();          // 시작과 종료는 함수가 불러진곳으로
		
	}
	
	public void testMethod() {
		System.out.println("testMethod() 동작확인");
		
		if(true) {
			System.out.println("if문 true 확인");
			return; // 함수 종료시점
		}
		System.out.println("testMethod() 종료됨");  // return을 만나서 testMethod 가 종료되서 이 명령은 실행되지 않았음.
	}
}
