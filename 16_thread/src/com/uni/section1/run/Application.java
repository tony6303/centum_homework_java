package com.uni.section1.run;

import com.uni.section1.thread.Thread1;
import com.uni.section1.thread.Thread2;

public class Application {

	public static void main(String[] args) {
		/* 프로세스와 스레드 */
		/*
		 * 프로세스(process)란 실행중인 프로그램이라고 할 수 있다. 
		 * 즉, 사용자가 작성한 프로그램을 운영체제에 의해 메모리와 cpu를 할당받아
		 * 실행중인 것을 말한다.
		 * 
		 * 스레드(thread)란 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다. 
		 * 모든 프로세스에는 한 개이상의 스레드가 존재하며 두 개
		 * 이상의 스레드를 가지는 프로세스를 멀티스레드 라고 한다.
		 */

		/*
		 * 스레드를 생성하는 방법 
		 * 1. Thread클래스를 상속받는 방법 
		 * 2. Runnable 인터페이스를 상속받는 방법
		 */

		// Runnable 인터페이스 vs Thread 클래스의 차이점
		// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다.
		// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
		// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.

		
		Thread1 thread1 = new Thread1();
		
		Thread2 thread2 = new Thread2();
		Thread  th = new Thread(thread2);  // Runnable 매개변수로 받음
		
//		thread1.run;
//		th.run();
		
		thread1.start();
		th.start();
		
		System.out.println( "메인 메소드 끝");
		
//		thread2.run();  // Runnable 타입이므로 생성한 객체를 스레드로 생성함 
		
		
		
	}

}
