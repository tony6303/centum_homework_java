package com.uni.section08.initblock;

public class Application {

	public static void main(String[] args) {
		    /** 순서
	       1. JVM이 정한 기본값으로 객체 생성됨 
	       2. 명시적 초기화 ex) String name = "홍길동";
	       3. 클래스 초기화 블럭
	       4. 인스턴스 초기화 블럭
	      
	       클래스 변수의 초기화 순서
	       JVM이 정한 기본값 -> 명시적 초기값 -> 정적초기화 블록-> 인스턴스초기화 블록 -> 매개변수가 있는 생성자
	      
	       인스턴스 변수의 초기화 순서
	       JVM이 정한 기본값 -> 명시적 초기값 -> 인스턴스초기화 블록 -> 매개변수가 있는 생성자
			*/
		
	      /* 초기화 블럭과 초기화 순서 */
	      /* 초기화 블럭
	       * 복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
	       * 
	       * 1. 인스턴스 초기화 블럭
	       *   : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
	       *     인스턴스를 호출하는 시점마다 호출이 된다.
	       *     인스턴스변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어쓴다.
	       * {
	       *     초기화 내용 작성
	       * }
	       * 
	       * 2. 정적 초기화 블럭
	       *    : 클래스가 로드될 때 한 번 동작한다.
	       *      정적 필드를 초기화하며, 인스턴스변수는 초기화하지 못한다.
	       * static {
	       *     초기화 내용 작성
	       * }
	       *  */
		
		
		Product product = new Product();
		
		System.out.println(product.getInformation());
		
		Product product2 = new Product("폰", 30000, "샤오미"); 			
		
		System.out.println(product2.getInformation());

	}  // main 끝

}
