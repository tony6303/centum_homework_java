package com.uni.section06.finalkeyword;

public class FinalFieldTest {
	
	// non-static field에 final 사용
	
	// private final int NON_STATIC_NUM;  // 초기화를 하지 않아서 에러가 납니다
	// 1. 선언과 동시에 초기화
	private final int NON_STATIC_NUM = 1;
	
	// 2. 생성자를 이용한 초기화
	private final String NON_STATIC_NAME;
	
	public FinalFieldTest(String nonStaticName) {
		this.NON_STATIC_NAME = nonStaticName;
	}
	
	// static field 에 final 사용
	
	// private static final int STATIC_NUM // 초기화를 하지 않아서 에러
	
	// 1. 선언과 동시에 초기와
	private static final int STATIC_NUM = 1;
	
	// 2. 생성자로 초기화
	   /* 생성자를 이용한 초기화는 불가능하다.
	    * 생성자는 인스턴스가 생성되는 시점에 호출이 되기 때문에 그 전에는 초기화가 일어나지 못한다.
	    * 하지만 static은 프로그램이 start될 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
	    * 기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
	    * */

	
	
	
}
