package com.uni.section6.race.run;

import com.uni.section6.race.thread.Heart;
import com.uni.section6.race.thread.Star;

public class Application {
	
	public static int tot1 = 0;
	public static int tot2 = 0;
	
	public static void main(String[] args) {
		Heart h = new Heart();
		Star s = new Star();
		
		Thread th1 = new Thread(h);
		Thread th2 = new Thread(s);
		

		try {
			th1.start();
			
			Thread.sleep(500);
			
			th2.start();
			
			th1.join();  // main 스레드가 th1의 작업이 끌날때 까지 대기함
			th2.join();  // main 스레드가 th2의 작업이 끌날때 까지 대기함
			
			// join을 안하니까 tot1, tot2 의 초기화 값인 0 으로 무승부가 출력되고 스레드가 그뒤에 이어서 실행 됨 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String str = (Application.tot1 > Application.tot2)? "하트 승리" : (Application.tot1 < Application.tot2)? "별 승리" : "무승부";
		System.out.println(str);
	}
}
