package com.uni.section1.init;

public class Application {

	public static void main(String[] args) {
	   /* 객체배열은 레퍼런스변수에 대한 배열이다. 
	   * 생성한 인스턴스도 배열을 이용해서 관리하면
	   * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
	   * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
	   * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다. 
	   * */

		Car car1 = new Car("차1", 30);
		Car car2 = new Car("차2", 60);
		Car car3 = new Car("차3", 90);
		Car car4 = new Car("차4", 120);
		Car car5 = new Car("차5", 150);
		
//		car1.driveMaxSpeed();
//		car2.driveMaxSpeed();
//		car3.driveMaxSpeed();
//		car4.driveMaxSpeed();
//		car5.driveMaxSpeed();
		
		
		
		Car[] carArray = new Car[5];
		
		carArray[0] = new Car("차1", 30);
		carArray[1] = new Car("차2", 60);
		carArray[2] = new Car("차3", 90);
		carArray[3] = new Car("차4", 120);
		carArray[4] = new Car("차5", 150);
		
//		carArray[0].driveMaxSpeed();
//		carArray[1].driveMaxSpeed();
//		carArray[2].driveMaxSpeed();
//		carArray[3].driveMaxSpeed();
//		carArray[4].driveMaxSpeed();
		
		for(int i = 0; i < carArray.length; i ++) {
			carArray[i].driveMaxSpeed();
		}
		
		// 할당과 동시에 초기화
		Car[] carArray2 = {
				new Car("차1", 30),
				new Car("차2", 60),
				new Car("차3", 90),
				new Car("차4", 120),
				new Car("차5", 150)
		};	
		
		/**
		 * for (자료형 변수명 : 배열명){
		 * 	
		 * }
		 */
		
		// carArray2 향상된 for문 으로 출력
		for (Car c : carArray2) {
			c.driveMaxSpeed();
		}
		
	}
	

}

