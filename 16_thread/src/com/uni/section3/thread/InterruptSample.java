package com.uni.section3.thread;

import java.util.Scanner;

public class InterruptSample {
	//interrupt : sleep()나 join()에 의해 일시 정지 상태인 스레드를 실행 대기 상태로 만든다. 
	   //해당 쓰레드에서는 InterruptException이 발생하게 되어 일시 정지를 벗어난다
	
	
	public void sleepInterrupt() {
		Thread4 th4 = new Thread4();
		Thread th = new Thread(th4);
		
		th.start();  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아무 값이나 입력해보세여");
		
		String input = sc.nextLine();
		
		System.out.println("입력한 값: " + input);
		
		th.interrupt();
		
	}
}
