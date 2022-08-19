package com.uni.section02.superkeyword;

import java.util.Date;

public class Application {   // 자식 (computer)를 호출하면 부모(product) 생성자가 먼저 호출되고, 그다음 자식생성자가 호출이 된다  를 알려주는 실습

	public static void main(String[] args) {
		/* super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도
	       *         함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수로
	       *         자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는 레퍼런스 변수이다.
	       * super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
	       *           부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
	       *           구문이라면, super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
	       *           호출할 수 있도록 한 구문이다.
	       * */

		ProductDTO pDto = new ProductDTO();
		System.out.println(pDto.getInformation());
		
		ProductDTO pDto2 = new ProductDTO("s-0123", "삼성", "갤럭시Z", 300000, new Date());
		System.out.println(pDto2.getInformation());
		
		
		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1.getInformation());
		
		/* ComputerDTO 모든 필드를 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
	      ComputerDTO computer2 = new ComputerDTO("퀼컴 스냅드래곤", 512, 12, "안드로이드");
	      System.out.println(computer2.getInformation());
	      
	      
	      ComputerDTO computer3 = 
	              new ComputerDTO("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new Date()
	                    , "퀼컴 스냅드래곤", 512, 12, "안드로이드");
	        System.out.println(computer3.getInformation());
	}

}
