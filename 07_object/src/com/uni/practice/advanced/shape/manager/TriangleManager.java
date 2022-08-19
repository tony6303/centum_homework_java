package com.uni.practice.advanced.shape.manager;

import com.uni.practice.advanced.shape.model.ShapeVO;

public class TriangleManager {
public void calcPerimeter(ShapeVO shape) {
		
		double height = shape.getHeight();
		double width = shape.getWidth();
		
		double temp = Math.sqrt(height * height + width * width);
		double perimeter = height + width + temp;
		
		System.out.println("삼각형의 둘레는 " + perimeter + " 입니다.");
		
	}

	public void calcArea(ShapeVO shape) {
		
		double height = shape.getHeight();
		double width = shape.getWidth();
		
		double area = height * width / 2;
		
		System.out.println("삼각형의 면적은 " + area + " 입니다.");
		
	}
	
	public void printShape(ShapeVO shape){
		
		System.out.println("도형 타입 : 삼각형");
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("넓이 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
		
	}

	public void paintColor(ShapeVO shape, String color) {
		
		shape.setColor(color);
		
		System.out.println("선택하신 도형을 " + color + "으로 색칠합니다.");
		
	}
}
