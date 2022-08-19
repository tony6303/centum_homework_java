package com.uni.lambda.standard_functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.uni.lambda.standard_functional.dto.Student;

public class E_Predicate {

	
	   /*
	    * Predicate<T> - test(T t) - 파라미터 있고 리턴값(boolean) 있는 CASE
	    *   - Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
	    *   - 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역활을 한다.
	    *   
	    *   BiPredicate()
	    *   DoublePredicate()
	    *   IntPredicate()
	    *   LongPredicate()
	    * 
	    */
	
	
	public void method01() {
		Predicate<String> predicate1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 5;	 // true / false 를 반환
			}
		};
		
		String str = "lambda";
		boolean r1 = predicate1.test(str);
		System.out.println(r1);   // 5글자 보다 기니까 true
		
		Predicate<Integer> predicate2 = (value) -> value > 1000;
		
		int number = 99;
		boolean r2 = predicate2.test(number);
		System.out.println(r2);  // false
		
		
		Predicate<Integer> predicate3 = (value) -> value > 10;
		boolean r3 = predicate2.and(predicate3).test(5);
		System.out.println(r3);  // false
		
		boolean r4 = predicate2.and(predicate3).test(1500);    // predicate3 의 조건 통과  and   predicate2의 조건 통과  >> true
		System.out.println(r4);  // true 
		
		boolean r5 = predicate2.or(predicate3).test(15);    // predicate3 의 조건 통과  or   predicate2의 조건 통과  >> true
		System.out.println(r5);  // true 
		
		
		Student st1 = new Student("유재석", 20, "M", 80, 70);
		Student st2 = new Student("이효리", 25, "F", 10, 100);
		
		
		Predicate<Student> predicate = (s) -> {
			return s.getGender().equals("M");
		};
		
		System.out.println("유재석은 남자? : " + predicate.test(st1));
		System.out.println("이효리는 남자? : " + predicate.test(st2));
		
		IntPredicate intPredicate = (i) -> i > 100;
		System.out.println(intPredicate.test(100));   // false
		System.out.println(intPredicate.test(1000));   // true
		
		
		
		
		
		
	}// method 끝

	
	public double avg(Predicate<Student> predicate, Student student) {
		double avg = 0 ;
		
		if(predicate.test(student)) {
			avg = (student.getMath() + student.getEnglish()) / 2;
		}
		
		return avg;
	} // avg 끝
	
	
}

