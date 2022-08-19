package com.uni.section02.encapsulation.problem1;

public class Application {

	public static void main(String[] args) {
		
	    // set, get 이용해서 monster 값 변경, 출력
	    Monster monster4 = new Monster();
	    
	    monster4.setInfo("드라큘라");
	    monster4.setHp(-2000);
	    
	    monster4.getInfo();
	    
	    
	    /* name -> kinds로 변경했기 때문에 직접 name 필드에 접근하는 코드는 전부 컴파일 에러를 발생시킨다.
	       * 즉, Monster클래스의 일부를 수정한 것 뿐인데 사용하는 곳에서는 전부 함께 수정을 해야 하는 부담이 생긴 것이다.
	       * 이것은 유지보수에 악형향을 미친다.
	       * */
	    
	    
	    
	    Monster monster1 = new Monster();
	    
	    monster1.setInfo("프랑켄슈타인");   // setKinds
        monster1.setHp(200);
	      
	    System.out.println(monster1.getInfo());
	}

}
