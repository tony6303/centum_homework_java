package com.uni.section01.extend;

public class FireCar extends Car {
	
	private String color;
	
	public FireCar() {
		//super();
		System.out.println("FireCar 클래스 기본 생성자가 호출됨");
	}
	
	

	public FireCar(String name, String color) {
		super(name);
		this.color = color;
	}



	// 알트 쉬프트 S   >>  Override/implements Methods
	/* @Override 어노테이션
	    * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	    * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
	    * */
	@Override
	public void soundHorn() {
		//super.soundHorn();
		if(isRunning()) {
			System.out.println("BBBBBBBBBBBBBBAMMMMMMM~~!!");
		}else {
			System.out.println("소방차가 앞으로 갈 수 없습니다 !!");
		}
		
		
	}
	
	public void sprayWater() {
		System.out.println("물을 뿌립니다");
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}// 클래스 끝
