package com.uni.lambda.standard_functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class B_Supplier {
	
	/*
	    * Supplier<T>  - get() : 파라미터 없고 리턴값있는 CASE
	    *   - Supplier 함수적 인터페이스는 매개 변수가 없고 리턴값이 있는 getXXX() 메소드를 가지고 있다.
	    *   - 이 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역활을 한다.
	    *      @param <T> the type of results supplied by this supplier
	            T get() :  T 타입으로 정해진 값을 반환한
	    */
	
	
	public void method01() {
		Supplier<String> supplier1 = new Supplier<String>() {

			@Override
			public String get() {
				
				return "익명객체 <T> 타입으로 정해진 값을 반환한다";
			}
			
		}; //
		
		supplier1.get();
		
		Supplier<String> supplier = () -> "엄청나게 생략된 람다";
		System.out.println(supplier1.get());
		System.out.println(supplier.get());
		
		   /* 
        Supplier 에서 파생된 인터페이스           
        BooleanSupplier :  boolean 타입으로 반환 getAsBoolean()
        DoubleSupplier  :  double 타입으로 반환 getAsDouble()
        IntSupplier  :  int 타입으로 반환 getAsInt()
        LongSupplier  :  long 타입으로 반환 getAsLong()
     
      */
		
		// 파생된 인터페이스 작성해보기
		IntSupplier intSupplier = () -> 30 + 40;
		System.out.println("intSupplier 리턴 : " + intSupplier.getAsInt());
		
		
		
		
		
		
	} // method01 끝
}
