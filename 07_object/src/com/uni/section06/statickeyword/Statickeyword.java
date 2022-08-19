package com.uni.section06.statickeyword;

public class Statickeyword {
	
	// 전역변수 : non-static(인스턴스변수) 필드와 static필드 (클래스변수, 정적필드) 선언
	private int nonstaticCount;
	private static int staticCount;
	
	public Statickeyword() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNonStaticCount() {
		return this.nonstaticCount;
	}
	
	public int getStaticCount() {
		return Statickeyword.staticCount;   // 스태틱의 접근법
	}
	
	public void increaseNonStaticCount() {
		this.nonstaticCount++;
	}
	
	public void increaseStaticCount() {
		Statickeyword.staticCount++;
	}
}
