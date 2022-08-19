package com.uni.section2.thread;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		// 우선순위 적용 시키기위한 delay 코드
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			for(int j = 0; j < Integer.MAX_VALUE; j++) {
				
			}
		}
		
		System.out.println(Thread.currentThread().getName()); // 현재 실행중인 스레드 이름 출력
	} // run 끝

}
