package com.uni.section5.sync;

//공유 자원을 ??하는 생산자 클래스
public class Producer extends Thread{ // 2번으로 작성
	private Buffer criticalData; // 객체로 만들어져 있다
	
	public Producer(Buffer buffer) {
		this.criticalData = buffer;
	}

	@Override              
	public void run() {
		for(int i = 0; i <= 10; i ++) {
			criticalData.setData(i);        // 생산 생산 생산    Buffer 의 메소드 호출
		}
	}
	
}
