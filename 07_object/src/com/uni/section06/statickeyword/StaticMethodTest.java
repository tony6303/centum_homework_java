package com.uni.section06.statickeyword;

public class StaticMethodTest {
	
	private int count;
	private static int staticCount;
	
	public void nonStaticMethod() {
		
		this.count++;
		StaticMethodTest.staticCount++;
		System.out.println("nonStaticMethod 호출됨");
		
	}
	
	public static void staticMethod() {
		// static은 프로그램 실행 시 이미 메모리에 올라가있고
		// 인스턴스를 생성하지않고도 사용하는 스태틱 메소드 이므로 this주소를 사용할 수 없다
		
		// this.count++;    
		staticCount++;  //  같은 클래스 내에서는 클래스명. 생략가능
		System.out.println("StaticMethod 호출됨");
	}
	
}
