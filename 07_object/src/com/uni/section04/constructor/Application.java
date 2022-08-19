package com.uni.section04.constructor;

public class Application {
	
	   
    /* 생성자란?
     * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다. 
     * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
     * 기본생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
     * (즉, 인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.)
     * 
     * 이렇게 기본생성자를 이용해 인스턴스를 생성하게 되면 자바에서는 자료형별 초기값을 이용해 필드를 초기화 한다.
     * 필드의 초기값을 사용자가 원하는대로 설정하고 싶은 경우 생성자의 호출 시 인자로 값을 전달하여 호출할 수 있다.
     * 이러한 인자를 받아 필드를 초기화 할 목적의 생성자를 매개변수있는 생성자라고 한다.
     * 하지만 매개변수 있는 생성자가 한 개라도 존재하는 경우 Compiler는 기본생성자를 자동으로 추가해주지 않으니
     * 사용시 주의해야 한다.
     * 매개변수있는 생성자는 주로 인스턴스 생성 시점에 필드의 값을 사용자가 원하는대로 초기화 할 목적으로 사용한다.
     * */
    	

	
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1.getInformation());
		
		User user2 = new User("user01", "pass0103", "이대령");
		System.out.println(user2.getInformation());
		
		User user3 = new User("user02", "pass805", "김대엽", new java.util.Date());
		System.out.println("user3의 hashcode : " + user3.hashCode());
		System.out.println(user3.getInformation());
		

		User user4 = new User(user3);
	}

}
