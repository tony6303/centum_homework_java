package com.uni.lambda.standard_functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class A_Consumer {

	public void method01() {
		Consumer<String> consumer1 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		};
		consumer1.accept("consumer tesT");
		
		// 람다로 변경
		
//		Consumer<String> consumer2 = (t) -> {
//			System.out.println(t);
//		};
//		consumer2.accept("lambda consumer");
		
		
		
		
		/*
		    *  Consumer<T> - accpet(T t) : 파라미터 있고 리턴값없는  CASE
		    *   - Consumer 함수적 인터페이스는 리턴값이 없는 accept() 메소드를 가지고 있다.
		    *   - accept() 메소드는 단지 매개값을 소비하는 역활을한다. (사용만하고 리턴값이 없다.)
		    *   @param <T> the type of the input to the operation
		             void accept(T t) 
		    *   
		    */
		Consumer<String> consumer2 = s -> System.out.println("매개값 출력 " + s);
		consumer2.accept("consumer test1");
		
		consumer2.andThen(consumer1).accept("consumer test2");  // 메소드 체이닝
		
		
		
		
		/* 
        Consumer 에서 파생된 인터페이스
        BiConsumer :  파라미터 2개 
        DoubleConsumer : double타입의 파라미터
        IntConsumer : int타입의 파라미터
        LongConsumer : long타입의 파라미터
        ObjDoubleConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 double
        ObjIntConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 int
        ObjLongConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 long
  
        */
		
		
		BiConsumer<String, String> biConsumer = (String str1, String str2) -> {
			System.out.println(str1 + " / " + str2);
		};
		biConsumer.accept("두개의" , "매개값을 받아");
		
		
		// 파생 인터페이스로 람다 직접 만들어보기 
		
		
	}// method01 끝
}
