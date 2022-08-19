package com.uni.section01.method;

public class Application7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application7 app7 = new Application7();
		
		int first = 20;
		int second = 10;
		
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
	    System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
	    System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
	    System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first, second));
	}
	
	private int plusTwoNumbers(int first, int second) {
			// TODO Auto-generated method stub
			return first + second;
		}
	
	private int minusTwoNumbers(int first, int second) {
		// TODO Auto-generated method stub
		return first - second;
	}
	
	private int multipleTwoNumbers(int first, int second) {
		// TODO Auto-generated method stub
		return first * second;
	}		
	
	private int divideTwoNumbers(int first, int second) {
		// TODO Auto-generated method stub
		return first / second;
	}




	
}
