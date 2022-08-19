package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		Circle[] circle = new Circle[2];
		Rectangle[] rectangle = new Rectangle[2];
		
		Circle emptyCircle = new Circle();
		Rectangle emptyRectangle = new Rectangle();
		
		
		// 위의 사용 데이터를 참고하여 각각 초기화
		/*
		 * x    y    rad
		 * 1   2      3
		 * 3    3    4 
		 * 
		 * x    y    wid   hei
		 * -1   -2   5     2
		 * -2   5   2     8
		 * 
		 */
		
		emptyCircle.setX(1);
		emptyCircle.setY(2);
		emptyCircle.setRadius(3);
		circle[0] = emptyCircle;
		
		emptyCircle.setX(3);
		emptyCircle.setY(3);
		emptyCircle.setRadius(4);
		circle[1] = emptyCircle;
		
		
		
		emptyRectangle.setX(-1);
		emptyRectangle.setY(-2);
		emptyRectangle.setWidth(5);
		emptyRectangle.setHeight(2);
		rectangle[0] = emptyRectangle;
		
		emptyRectangle.setX(-2);
		emptyRectangle.setY(5);
		emptyRectangle.setWidth(2);
		emptyRectangle.setHeight(8);
		rectangle[1] = emptyRectangle;
		
		
		// 각 도형의 draw 메소드 실행 --> 향상된 for문 이용해서
		/**
		 * for (자료형 변수명 : 배열명){
		 * 	
		 * }
		 */
		System.out.println("==== Circle ==== ");
		for (Circle c : circle) {
			c.draw();
		}
		
		System.out.println("==== Rectangle ==== ");
		for (Rectangle r : rectangle) {
			r.draw();
		}
	}

}
