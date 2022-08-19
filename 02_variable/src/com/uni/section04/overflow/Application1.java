package com.uni.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 오버 플로우 - 자료형 별 값의 최대 범위를 벗어나는 경우   직역 : 흘러넘친다
		
		byte num1 = 127; // byte 의 자료형 크기 -128 ~ 127 
		
		
		System.out.println("num1 : " + num1);  // 127
		
		num1++; // num = num + 1;  어어 흘러넘친다
		
		System.out.println("num1 overflow : " + num1 );   // -128
		
		
		
		
		// 언더 플로우 - 최소 범위보다 작은수를 발생시키는 경우 발생한다. 오버 플로우의 반대 개념
		
		byte num2 = -128;
		
		System.out.println("num2 : " + num2);  // -128
		
		num2--;  // num2 = num2 - 1;
		
		System.out.println("num2 underflow : " + num2);  // 127
		
		
		num1 = 127;
		
		System.out.println(num1);
		byte result1 = (byte) (num1 +3);
		
		System.out.println("result1 : " + result1);
		
		int firstNum = 1000000;
		int secondNum = 7000000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("multi : " + multi);
		
		
		
		long longMulti = (long)firstNum * secondNum;   // 강제 형변환
		
		System.out.println("longMulti : " + longMulti);
	}

}
