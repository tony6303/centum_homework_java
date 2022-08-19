package com.uni.section1.poly;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상위타입으로 객체 배열 5개 만들고 각 인덱스에 인스턴스 생성해서 대입 (랜덤하게)
		Animal[] animalArr = new Animal[5];
//		animalArr[0] = new Rabbit();
		
		for(int i = 0; i < animalArr.length; i++) {
			int randomNum = (int)(Math.random()*9);
			
			if(randomNum % 2 == 0) {
				animalArr[i] = new Rabbit();
			}else {
				animalArr[i] = new Tiger();
			}
		}
		
		
		// cry 메소드 실행 - 동적바인딩
		for(int i = 0; i < animalArr.length; i++) {
			System.out.print("인덱스" + i + "번의 울음소리 : " );
			animalArr[i].cry();
			
		}
		
		// 각 클래스 별 고유 메소드 동작 instanceof 사용    토끼,호랑이가 아니면 해당객체가 아닙니다 출력
		// 구분을 어떻게 하는거지 ?
		for(int i = 0; i < animalArr.length; i++) {
			
			if (animalArr[i] instanceof Rabbit) {
				((Rabbit)animalArr[i]).jump();
			}else if(animalArr[i] instanceof Tiger){
				((Tiger)animalArr[i]).bite();
			}else {
				System.out.println("호랑이 객체가 아닙니다");
			}
		}
		
	}

}
