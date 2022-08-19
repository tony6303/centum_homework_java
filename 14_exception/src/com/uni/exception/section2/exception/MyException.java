package com.uni.exception.section2.exception;

public class MyException extends Exception{
	
	public MyException() {
	
	}
	
	// 오버라이딩 ??
	public MyException(String string) {
		super(string);
	}
	
	public void checkNum2(int num) throws Exception  {
		if(num < 10) {
			throw new Exception("10보다 작아서 에러");
		}else {
			System.out.println("정상종료에요 ");
		}
	}
	
	
	
}
