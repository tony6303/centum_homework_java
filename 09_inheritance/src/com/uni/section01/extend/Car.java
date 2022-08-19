package com.uni.section01.extend;

public class Car {
	private boolean runningStatus;
	private String name;

	public Car() {
		System.out.println("Car의 기본 생성자가 호출됨");
	}
	
	
	
	public Car(String name) {
		this.name = name;
	}



	public void run() {
		runningStatus = true;
		System.out.println("자동차가 달립니다");
	}
	
	public void soundHorn() {
		if(isRunning()) {
			System.out.println("BAAAM");
		}else {
			System.out.println("달리지않으면 경적을 울릴 수 없습니다.");
		}
	}

	protected boolean isRunning() {
		return runningStatus;
	}
	
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈춥니다");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
