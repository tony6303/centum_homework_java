package com.uni.section04.constructor;

import java.util.Date;

public class User {
	   /* 생성자의 작성 위치
	    * 작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만,
	    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
	    * */
	   
	   /* 생성자의 사용 목적
	    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
	    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
	    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
	    *    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다. (초기값 전달 강제화)
	    * */
	   
	   /* 생성자 작성 방법
	    * [표현식]
	    * 접근제한자 클래스명(매개변수) {
	    *     인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
	    *     this.필드명 = 매개변수;      //설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
	    * }
	    * 
	    * 생성자 작성 방법은 메소드를 작성하는 방법과 매우 유사하다. 하지만 두 가지 사항을 조심해야 한다.
	    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대/소문자까지 같아야 함)
	    * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)
	    * */
	   
	   /* 기본생성자(매개변수 없는 생성자)와 매개변수 있는 생성자
	    * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수 도 있다.
	    * 매개변수 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
	    * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
	    * */
	   
	
	private String id;
	private String pwd;
	private String name;
	private Date enrollDate;

	public User() {
		System.out.println("User 클래스의 기본생성자 호출 됨");
	}
	
	// 매개변수가 있는 생성자
	public User(String id, String pwd, String name) {  // 이것이 오버로딩 ( 생성자 이름은 같은데 , 매개변수가 다른 형태 )
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
	    System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
	    System.out.println("this의 hashcode : " + this.hashCode());
	}
	
	/* id, pwd, name 필드를 초기화하는 기능을 가진 생성자를 바로 위에서 작성했었다.
     * 따라서 중복되는 초기화 내용이 발생하게 되는데, 이 중복되는 초기화 내용을 줄여서 작성할 수 있다.
     * this() 메소드를 이용하는 것이다.
     * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
     * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일함)
     * 리턴되어 돌아오지만 리턴값은 존재하지 않는다. 
     * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 Compile Error가 발생한다.
     * 
     * */
	public User(String id, String pwd, String name, Date enrollDate) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
		this(id, pwd, name); // 생성자 호출
		this.enrollDate = enrollDate;
		
		System.out.println("User 클래스의 모든필드를 초기화하는 생성자 호출함...");
	}
	
	
	/* 복사 생성자 */
	   /* 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화값으로 이용할 수 있다. 
	    * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다. (깊은복사)
	    * */
	public User(User otherUser) {
		this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
		System.out.println("User 클래스의 복사생성자 호출함...");
		
		// this 주소와 otherUser의 주소가 서로 다른지 확인
		System.out.println("this의 hashcode : " + this.hashCode());
	    System.out.println("otherUser의 hashcode : " + otherUser.hashCode());
	}
	
	
	/**<pre>
	    *   모든 필드가 가지고 있는 값을 문자열로 합치기하여 반환하는 메소드
	    * </pre>
	    * @return 모든 필드값을 문자열 합치기한 문자열
	    * */
	   public String getInformation() {
	      
	      return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
	   }
	   
	   
}
