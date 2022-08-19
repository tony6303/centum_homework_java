package com.uni.section1.poly;

public class Rabbit extends Animal{

	@Override
	public void ear() {
		// TODO Auto-generated method stub
		System.out.println("토끼가 풀을 뜯어 먹고 있습니다");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("토끼가 달려 갑니다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("토끼가 울음소리를 냅니다");
	}	
	
	public void jump() {
		System.out.println("토끼가 점프 합니다");
	}
	
}
