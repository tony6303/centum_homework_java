package com.uni.section1.thread;

// Thread 상속 받기
public class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("스레드1 : " + i );
		}
	}

}
