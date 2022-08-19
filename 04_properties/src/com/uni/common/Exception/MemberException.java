package com.uni.common.Exception;

public class MemberException extends Exception{
	// 기본 생성자
	public MemberException() {
		
	}
	
	// Exception 클래스 오버라이딩
	public MemberException(String message) {
		super(message);
	}
	
	
	
}
