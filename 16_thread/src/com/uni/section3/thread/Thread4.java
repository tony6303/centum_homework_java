package com.uni.section3.thread;

public class Thread4 implements Runnable{
	// sleep() : 지정한 시간만큼 스레드를 정지 시키는 메소드
	@Override
	public void run() {
		int cnt = 0;
		
		while(cnt < 10) {         // 10 초안에  sleepInterrupt 에서 interrupt 를 발생시키면 catch 되어서 예외 발생을 출력 시킨다 !!!
			try {
				Thread.sleep(1000);
				System.out.println((++cnt) + " 초");
			} catch (InterruptedException e) {
				System.out.print("예외 발생");
				System.out.print(cnt + "초에 스레드 종료 ");
				cnt = 10;
				
			}
		} // while 끝
		
		System.out.println("진짜 종료!");
	}

}
