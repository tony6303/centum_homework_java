package com.uni.section5.sync;

//공유 자원을 꺼내서 소비하는 소비자 클래스
public class Consumer extends Thread { // 3번으로 작성

	private Buffer criticalData;

	public Consumer(Buffer buffer) {
		this.criticalData = buffer;
	}

	@Override               
	public void run() {
		for (int i = 0; i <= 10; i++) {
			criticalData.getData(); // 소비 소비 소비         Buffer 의 메소드 호출
		}
	}

}
