package com.hw2.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("면적 : " + Math.round(3.14 * radius * radius*10)/10.0);
		System.out.println("둘레 : " + Math.round(3.14 * (radius + radius)*10)/10.0);
		
		
//		double test = Math.round(28.259999 * 100)/100.0;
//		System.out.println(test);
	}
	
	
	
}
