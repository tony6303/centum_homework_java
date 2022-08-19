package com.uni.section02.encapsulation.problem1;

public class Monster {
	
	/* 접근제한자
	    * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
	    * 1. public : 모든 패키지에 접근 허용.
	    * 2. protected : 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능
	    * 3. default : 동일 패키지에서만 접근 허용. (작성하지 않는 것이 default)
	    * 4. private : 해당 클래스 내부에서만 접근 허용.
	    * 
	    * 위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용 가능하다.
	    * 단, 클래스 선언 시 사용하는 접근제한자는 public과 default만 사용 가능하다.
	    * */
	
	/* 캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고 
     * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
     * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용되고 있다.
     * */
	
	private String name;
	private int hp;
	
	
	public void setHp(int hp) {
		if(hp > 0) {
			System.out.println("양수이므로 체력 변경");
			this.hp = hp;
		}else {
			System.out.println("음수나 0을 입력 했으므로 체력을 0으로 변경");
			this.hp = 0;
		}
	}
	
	
	public void setInfo(String info) {
		this.name = info;				
	}
	
	public String getInfo() {
		return "몬스터의 이름은 " + this.name + " 이고 체력은 " + this.hp + " 입니다";
	}
}
