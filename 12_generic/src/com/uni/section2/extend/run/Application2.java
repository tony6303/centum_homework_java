package com.uni.section2.extend.run;

import com.uni.section2.extend.Bunny;
import com.uni.section2.extend.DrunkenBunny;
import com.uni.section2.extend.Rabbit;
import com.uni.section2.extend.RabbitFarm;
import com.uni.section2.extend.WildCardFarm;

public class Application2 {

	public static void main(String[] args) {
		   /* 와일드카드(WildCard) 
	       * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
	       * 그 객체의 타입 변수를 제한할 수 있다.
	       * 
	       * <?> : 제한 없음
	       * <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
	       * <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
	       * */
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
//		public void anyType(RabbitFarm<?> farm) {
//			farm.getAnimal().cry();
//		}
//		
//		public void extendsType(RabbitFarm<? extends Bunny> farm) {
//			farm.getAnimal().cry();
//		}
//		
//		public void superType(RabbitFarm<? super Bunny> farm) {
//			farm.getAnimal().cry();
//		}
		
		// 농장 생성자체가 불가능
		// wildCardFarm.anyType(new RabbitRarm<Animal>());  // 안됨
		
		// 어떤 토끼농장이던 매개변수로 사용가능
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		// Bunny 이거나 Bunny의 후손 클래스들만 사용 가능, 상위 타입은 불가능
		// wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new DrunkenBunny()));
		wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		
		// Bunny 이거나 Bunny의 부모 클래스들만 사용 가능, 하위 타입은 불가능
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Bunny()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));	
		// wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
	}

}
