package com.uni.section4.daemonthread;

public class CountDown extends Thread{

	@Override
	public void run() {
		for(int i = 20; i >= 0; i--) {
			
			try {
				Thread.sleep(500);
				System.out.println(i);   // 20 에서 0으로 카운트다운
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(" 카운트다운 스레드 종료");
	}  // run 끝
	
}
