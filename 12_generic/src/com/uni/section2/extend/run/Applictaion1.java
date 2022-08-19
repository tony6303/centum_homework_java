package com.uni.section2.extend.run;

import com.uni.section2.extend.Animal;
import com.uni.section2.extend.Bunny;
import com.uni.section2.extend.DrunkenBunny;
import com.uni.section2.extend.Mammal;
import com.uni.section2.extend.Rabbit;
import com.uni.section2.extend.RabbitFarm;
import com.uni.section2.extend.Snake;

public class Applictaion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		RabbitFarm<Animal> farm2 = new RabbitFarm<>();  // Rabbit 보다 상위로 만들 수 없다
//		RabbitFarm<Mammal> farm3 = new RabbitFarm<>();  // Rabbit 보다 상위로 만들 수 없다 
		
		// Rabbit 이거나 후손들만 제네릭 타입으로 사용가능
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
		
//		farm1.setAnimal(new Snake()); // farm1 << RabbitFarm 에서 지정한 타입만 대입할 수 있다 
		
		farm1.setAnimal(new Rabbit());
		farm1.getAnimal().cry();
		
		farm2.setAnimal(new Bunny());
		farm2.getAnimal().cry();
		
		farm3.setAnimal(new DrunkenBunny());
		farm3.getAnimal().cry();
		
		
	}

}
