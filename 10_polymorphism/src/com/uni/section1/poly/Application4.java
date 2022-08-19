package com.uni.section1.poly;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application4 app = new Application4();
		
		Animal randomAnimal = app.getRandomAnimal();
		
		randomAnimal.cry();
		app.getRandomAnimal().ear();
	}

	
	public Animal getRandomAnimal() {
		int random = (int)(Math.random()*2);
		return random == 0 ? new Rabbit() : new Tiger();		  // 삼항연산자
	}
}
