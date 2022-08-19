package com.uni.section1.thread;

// Runnable 인터페이스로 구현
public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("스레드2 : " + i + "$###$#$#$#$###" );
		}
	}

}
