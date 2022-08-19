package com.uni.section01.method;

public class Calculator {

	/**
	    * <pre>
	    *  매개변수로 전달받은 두 수를 비교하여 더 큰 값을 가진 정수를 반환함
	    *  같은 값을 가지는 조건에 대해서는 처리하지 않음
	    * </pre>
	    * @param first 최대값 비교를 위한 첫 번째 정수
	    * @param second 최대값 비료를 위한 두 번째 정수
	    * @return 두 수 중 큰 값을 정수 형으로 반환
	    */
	public int minNumberOf(int first, int second) {
		
		return (first > second) ? second : first;
	}
	
	
	public static int maxNumberOf(int first, int second) {
		
		return (first > second) ? first : second;
	}
}
