package com.uni.section5.sync;

public class Application {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		// Producer 와 Consumer 는 Thread 를 extends 한 상태이고, Thread 의 자식이다.
		
		Thread t1 = new Producer(buffer); // 생성자 매개변수로 Buffer 클래스를 받고 있다.
		Thread t2 = new Consumer(buffer); // 생성자
		
		// Buffer 클래스에 있는 setData, getData 함수가 동시에 실행 된다
		t1.start();
		t2.start();
		

	}

}
