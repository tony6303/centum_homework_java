package com.uni.section3.interfaceimplements;

public interface InterProduct{

	/* 인터페이스는 상수 필드만 작성 가능하다. 
	    * public static final 제어자 조합을 상수 필드라고 부른다.
	    * 반드시 선언과 동시에 초기화 해줘야 한다.
	    * */
	public static final int MAX_NUM = 100;
	
	int MIN_NUM = 10; // 묵시적으로 static final int
	
	// 인터페이스는 생성자를 가질 수 없다.
	
	// 추상 메소드만 생성가능
	public abstract void nonStaticMethod();
	
	
	   /* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다. (다른 접근제한자 사용 불가)
	    * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우 
	    * 반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다. 
	    * */
	
	void abstMethod(); // 묵시적 public abstract 
	
	// static 메소드는 작성가능 ( JDK 1.8 이상 )
	public static void staticMethod() {
		System.out.println("InterProduct 클래스의  static 메소드 호출됨");
	}
	
	// default 로 작성하면 nonStatic 메소드로 작성 가능하다 ( JDK 1.8 이상 )
	public default void defaultMethod() {
		System.out.println("InterProduct 클래스의  default 메소드 호출됨");
	}
	
	
}
