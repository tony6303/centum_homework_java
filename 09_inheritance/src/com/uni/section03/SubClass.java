package com.uni.section03;

public class SubClass extends SuperClass{
	
	 /* 1. 메소드 이름 변경하면 에러 발생
	    * 2. 메소드의 리턴타입 변경하면 에러 발생
	    * 3. 매개변수 갯수나, 타입이 변경되면 에러 발생
	    * 
	    *  */

	@Override
	public void method(int num) {
		// TODO Auto-generated method stub
		super.method(num);
	}
	
	// public final void finalMethod() {} // Cannot override the final method from SuperClass

	
	// 부모메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능
	@Override
	protected void protectedMethod() {
		// TODO Auto-generated method stub
		super.protectedMethod();
	}
	
//	가능
//	@Override 
//	public void protectedMethod() { 
//		// TODO Auto-generated method stub
//		super.protectedMethod();
//	}
	

	
}
