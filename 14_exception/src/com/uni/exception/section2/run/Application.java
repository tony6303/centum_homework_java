package com.uni.exception.section2.run;

import java.util.Scanner;

import com.uni.exception.section2.exception.MyException;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("정수를 하나 입력하세요~ : ");
	      
	      int num = sc.nextInt();
	      
//	      try {
//			checkNum(num);
//		} catch (MyException e) {
//			e.printStackTrace();
//		}
	      
	      MyException m = new MyException();
	      try {
			m.checkNum2(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	      
	      
	}
	
//	public static void checkNum(int num) {
//		try {
//			if(num < 10)  throw new MyException("10보다 작아요");
//		} catch (Exception e) {
//			System.out.println("정상종료에요 ");
//			
//		}
		
//		if(num < 10) {
////			MyException me = new MyException("10보다 작은수 입니다 에러");
//			throw new MyException("10보다 작은수 입니다 에러");
//			
//		}else {
//			System.out.println("10보다 같거나 크네요 통과");
//		}
		
	//} // checkNum 끝

}
