package com.uni.section08.initblock;

public class Product {
	private String name;
	private int price;
	
	private static String brand ="삼성";  // 명시적 초기화
	
	// 3. STATIC 블록   클래스 변수를 초기화 시키는 블럭, 프로그램 시작 시 단 한번만 초기화
	static {
//		name = "테스트";   // static 블럭에서 인스턴스 변수를 초기화 할 수 없음
//		price = 10000;
		
		brand = "LG";
		
		System.out.println("static(정적) 초기화 블럭 동작");
		
	}
	
	
	
	// 4. 인스턴스 블록    
	// 객체 생성시 마다 초기화, 생성자 보다 먼저 실행 됨
	
	{
		name = "이대엽";
		price = 1000000000;
		
		System.out.println("인스턴스 블록 동작");
	}
	
	
	public Product() {
		System.out.println("기본생성자 호출");
		
	}
	
	
	
	   public Product(String name, int price, String brand) {
		super();
		this.name = name;
		this.price = price;
		Product.brand = brand;
		
		System.out.println("매개변수 있는 생성자 호출됨");
	}



	/* 필드값 문자열 합치기 한 문자열 반환용 메소드 */
	public String getInformation() {
		return "Product [name=" + this.name + ", price=" + this.price + ",brand=" + Product.brand + "]";
	}
}
