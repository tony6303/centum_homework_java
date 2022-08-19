package com.uni.lambda.standard_functional;

import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.uni.lambda.standard_functional.dto.Student;

public class C_Function {
	/*
	    *  Function<T, R> - apply(T t) : 파라미터 있고 리턴값있는 CASE
	    *   - Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	    *   - 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역활을 한다. 
	    *    
	         @param <T> the type of the input to the function
	         @param <R> the type of the result of the function

	           R apply(T t) 구현 
	    */
	
	public void method01() {
		Function<String, Integer> func1 = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		};
		String str = "lambda";
		int r = func1.apply(str);
		
		System.out.println("익맹 객체 lambda 의 길이 " + r);
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// < input type T , result type R >
		Function<String, Integer> func2 = (t) -> t.length();
		int l = func2.apply("lllam");
		
		System.out.println("람다 lllam의 길이 " + l);
	
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	      /* 
	         Function 에서 파생된 인터페이스           
	         BiFunction<T,U,R> : T와 U 전달하고 R타입으로 반환
	         DoubleFunction<R> : double로 전달하고 R타입으로 반환
	         IntFunction<R> : int로 전달하고 R타입으로 반환
	         IntToDoubleFunction : int로 전달하고 double타입으로 반환
	         IntToLongFunction : int로 전달하고 long타입으로 반환
	         LongToDoubleFunction : long로 전달하고 double타입으로 반환
	         LongToIntFunction : long로 전달하고 int타입으로 반환
	         ToDoubleBiFunction<T, U> : 객체 T와 U를 double로 반환
	         ToDoubleFunction : 객체 T를 double로 반환
	         ToIntBiFunction<T, U> : 객체 T와 U를 int로 반환
	         ToIntFunction   : 객체 T를 int로 반환
	         ToLongBiFunction<T, U>: 객체 T와 U를 long으로 매핑
	         ToLongFunction : 객체 T를 long으로 반환   
	       */
		
		
		
		Student student = new Student("유재석", 20, "M", 80, 70);
		
		Function<Student, String> func3 = (s) -> {
			return s.getName();
		};
		
		System.out.println("학생의 이름 : " + func3.apply(student));
		
		Function<Student, Integer> func4 = s -> s.getAge();
		System.out.println("학생의 나이 : " + func4.apply(student));
		
		
		
		System.out.print("[수학 점수] : ");
//		printInt((s)->{return s.getMath();} , student);
		printInt( s-> s.getMath() , student);
		
		System.out.print("[영어 점수] : ");
		printInt( s-> s.getEnglish() , student);
		
	} // method01 끝
	
	public void printInt(ToIntFunction<Student> function, Student student) {
		
		System.out.println(function.applyAsInt(student));
	}
	
}
