package com.uni.section06.singleton;

public class EagerSingleton {
	private static EagerSingleton eager = new EagerSingleton(); // 클래스가 초기화 되는 시점에 인스턴스를 생성
			
	private EagerSingleton() { // 외부에서 인스턴스 생성 제한!!!!!!!!!!!!!
		// private
	} 
	
	public static EagerSingleton getInstance() { //메소드를 호출하면 인스턴스를 반환
		return eager; // 인스턴스 반환
	}
			
}
