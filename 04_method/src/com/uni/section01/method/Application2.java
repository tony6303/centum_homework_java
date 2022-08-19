package com.uni.section01.method;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() 시작함");

		Application2 app2 = new Application2();
		
		app2.methodA();
		
		System.out.println("main() 종료됨");
	}
	public void methodA() {
		System.out.println("methodA() 호출됨");
	}
	
}
