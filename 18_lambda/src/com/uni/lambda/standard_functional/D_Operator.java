package com.uni.lambda.standard_functional;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;

import com.uni.lambda.standard_functional.dto.Student;

public class D_Operator {
	/*
	    * Operator<T> - 파라미터있고 리턴값있는 CASE
	    *   - Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	    *   - Function 함수적 인터페이스와 다르게 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
	    */
	
	 /* 
	  * 그냥 Operatpr 는 없다.
	    ( 모두 데이터타입 동일 )          
	   BinaryOperator<T> : BiFunction<T,U,R>  상속 : 두개의 파라미터 전달하고 반환      
	   UnaryOperator<T> : Function<T,R> 상속 : 하나의 파라미터 전달하고 반환 
	   DoubleBinaryOperator : 두개의 파라미터 double 전달하고  double 반환
	   DoubleUnaryOperator     :   : 하나의 파라미터 double 전달하고 double반환  
	   IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환 
	   IntUnaryOperator     :   : 하나의 파라미터 int 전달하고 int반환  
	   LongBinaryOperator : 두개의 파라미터 long 전달하고  long 반환
	   LongUnaryOperator     :   : 하나의 파라미터 long 전달하고 long반환
	  */
	
	public void method01() {
		BinaryOperator<String> bo = new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				
				return t.length() == u.length() ? 
						"길이가 같음" : t.length() > u.length() ? t : u ;
			}
		}; // 익명 객체 끝
		
		String str1 = "lambda";
		String str2 = "java11";
		String str3 = "test";
		
		String result = bo.apply(str1, str2);
		System.out.println(result);
		
		String result1 = bo.apply(str2, str3);
		System.out.println(result1); // 문자 긴 놈    문자그대로를 반환
		
		// 하나의 파라미터 int 전달하고 int반환
		IntUnaryOperator intUnaryOperator = (a) -> a * a;
		System.out.println(intUnaryOperator.applyAsInt(10));   // 10 * 10
		
		Student st1 = new Student("유재석", 20, "M", 80, 70);
		Student st2 = new Student("홍길동", 25, "M", 10, 100);
		
		// BiFunction<T,U,R>  상속 : 두개의 파라미터 전달하고 반환
		BinaryOperator<Student> binaryOperator = (s1, s2) -> {
			if(s1.getMath() > s2.getMath()) {
				return s1;
			}else {
				return s2;
			}
				
		}; // 익명 객체 끝
		System.out.println("둘 중 수학을 더 잘하는 사람 : " + binaryOperator.apply(st1, st2));
		
		// 람다를 쓰면 위 코드를 이렇게 생략가능 !! ( 근데 api를 ... )
		binaryOperator = BinaryOperator.maxBy((s1, s2) -> Integer.compare(s1.getMath(), s2.getMath()));
		System.out.println(binaryOperator.apply(st1, st2));
		
	}

	
	
	
}

