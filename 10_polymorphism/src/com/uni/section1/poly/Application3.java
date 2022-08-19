package com.uni.section1.poly;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application3 app = new Application3();
		
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
		
		app.feed(animal1);  // 동일한 타입
		app.feed(animal2);
		
		
		Rabbit animal3 = new Rabbit();
		Tiger animal4 = new Tiger();
		
		app.feed(animal3);  // 묵시적 형변환
		app.feed(animal4);
	}

	
	public void feed(Animal animal) { // 상위타입으로 받아줌으로써 각각 메소드 생성을 안해도 됨 feed(Rabbit r) , feed(Tiger t)
		animal.ear();
	}
}
