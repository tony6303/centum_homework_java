package com.uni.section01.method;

public class Application8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* static 메소드를 호출하는 방법
	       * 클래스명.메소드명();  <- 이런 방식으로 호출한다.
	       * */
		System.out.println("10 + 20 의 합 " + Application8.sumTwoNumbers(10, 20));
		
		System.out.println("10 + 20 의 합 " + sumTwoNumbers(10, 20));
		
	}
	
	
	// static 메모리에 올라가있다 !!
	public static int sumTwoNumbers(int first, int second) {
		return first + second;
	}

}
