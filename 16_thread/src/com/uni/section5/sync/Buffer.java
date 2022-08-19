package com.uni.section5.sync;

public class Buffer { // 1번으로 작성
	private int data;
	private boolean empty = true;
	
	
	// 생산자가 생산한 상품이 있어야 소비 가능하도록
	public synchronized void getData() {
		while(empty) { // 상품이 없으면
			try {
				wait();     // notify 가 호출 될때 까지 기다린다 (wait의 기능임) ( 생산될 때 까지 )
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("소비자 : " + data + "번 상품을 소비했습니다");
		
		empty = true; // 텅 빈 상태
		
		notify();  // 동기화된 블록 안에서 호출한 객체 내부에 대기중인 스레드를 깨운다.
		// 여러 스레드가 있을 경우 임의의 스레드 하나에만 통보한다.
	}
	
//	public void getData() {
//		System.out.println("소비자 : " + data + "번 상품을 소비했습니다");
//		
//		empty = true;
//	}
	
	public synchronized void setData(int data) {
		while(!empty) { // 상품이 없지 않으면 (있으면)
			try {
				wait();      // notify 가 호출 될때 까지 기다린다 (wait의 기능임) ( 소비될 때 까지 )
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;       //  
		System.out.println("생산자 : " + data + "번 상품을 생산했습니다");
		
		empty = false;     // 물건이 있는 상태
		
		notify();  // 동기화된 블록 안에서 호출한 객체 내부에 대기중인 스레드를 깨운다.
		// 여러 스레드가 있을 경우 임의의 스레드 하나에만 통보한다.
	}
	
	
//	public void setData() {
//		System.out.println("생산자 : " + data + "번 상품을 생산했습니다");
//		
//		empty = false;
//	}
}
