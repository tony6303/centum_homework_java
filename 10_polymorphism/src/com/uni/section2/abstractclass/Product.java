package com.uni.section2.abstractclass;

public abstract class Product {

	// 추상 클래스도 필드를 가질 수 있다
	private int nonStaticField;
	private static int StaticField;
	
	
	// 생성자도 가질 수 있다. 근데 직접적으로 호출은 할 수 없다
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public void nonStaticMethod() {
		System.out.println("nonStaticMethon 호출함");
	}
	
	public static void staticMethod() {
		System.out.println("StaticMethon 호출함");
	}
	
	public abstract void abstractMethod();
}
