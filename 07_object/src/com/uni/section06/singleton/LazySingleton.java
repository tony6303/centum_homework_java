package com.uni.section06.singleton;

public class LazySingleton {
	private static LazySingleton Lazy; // 클래스가 초기화되는 시점에는 정적필드를 선언해두고 null 로 초기화
	
	private LazySingleton() { // 외부에서 생성자 호출 제한

	}
	
	public static LazySingleton getInstance() {
		// 인스턴스 생성 한 적 없는 경우 만들어서 반환, 이미 생성 되어있다면 만들어진걸 반환
		if(Lazy == null) {
			Lazy = new LazySingleton();
		}
		
		return Lazy;
	}
	
	
	
	
}
