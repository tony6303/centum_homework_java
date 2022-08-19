package com.uni.section4.run;

import javax.swing.JOptionPane;

import com.uni.section4.daemonthread.CountDown;

public class Application {
	public static void main(String[] args) {
		Thread th = new CountDown();
		
		th.start(); // 20 세고 종료됨
		
		System.out.println(JOptionPane.showInputDialog("아무거나 입력해보세요"));
		
		System.out.println("메인 스레드 종료");
	}
}
