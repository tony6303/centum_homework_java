package com.uni.section03.absrtaction;

public class Car {

	private boolean isOn; // 시동 걸렸는지 여부  , 초기 값 false
	private int speed;
	
	public void startUp() {
		
		if(isOn) {
			System.out.println("이미 시동 걸려있음");
		}else {
			this.isOn = true; // 시동을 건다
			System.out.println("시동을 걸었습니다.");
		}
	} // stratUp 끝
	
	
	public void go() {
		if(isOn) {
			System.out.println("차가 앞으로 가는중");
			this.speed = this.speed + 10 ;
			System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다");
		}else {
			System.out.println("차의 시동이 걸려있지 않습니다");
		}
	} // go 끝
	
	public void stop() {
		if(isOn) {
			if(this.speed > 0) {
				this.speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
			}else {
				System.out.println("차가 이미 멈춰있네요");
			}
		}else {
			System.out.println("차의 시동이 걸려있지 않습니다");
		}
	} // stop 끝
	
	public void turnOff() {
		if(isOn) {
			if(this.speed > 0) {
				System.out.println("속도를 내는중이라 시동을 끌 수 없습니다.");
			}else {
				System.out.println("차가 멈춰있어서 정상적으로 시동을 껐습니다.");
			}
		}else {
			System.out.println("차의 시동이 이미 꺼져있습니다.");
		}
		
	}


	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	
	
}
