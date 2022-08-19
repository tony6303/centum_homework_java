package com.uni.section2.extend;

public class RabbitFarm<T extends Rabbit> {  // 토끼 클래스만 받겠다

	private T animal;
	
	public RabbitFarm() {
		// TODO Auto-generated constructor stub
	}

	public RabbitFarm(T animal) {
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	
}
