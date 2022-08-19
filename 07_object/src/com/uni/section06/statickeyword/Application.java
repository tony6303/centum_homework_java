package com.uni.section06.statickeyword;

public class Application {

	public static void main(String[] args) {
	      /* static : 정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
	       *          인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
	       *          ★★★★★여러 인스턴스가 공유해서 사용할 목적의 공간이다.★★★★★
	       *          하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다.
	       *          ★★★★★명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하자.★★★★★
	       *          의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때 이다.
	       *          
	       *          
	       *          
	       * final  : final은 종단의 의미를 가지는 키워드이다.
	       *          final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경 불가의 의미이다.
	       *          1. 지역변수 : 초기화 이후 값 변경 불가
	       *          2. 매개변수 : 호출시 전달한 인자 변경 불가
	       *          3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
	       *          4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
	       *          5. non-static 메소드 : 메소드 재작성(overriding) 불가
	       *          6. static 메소드 : 메소드 재작성(overriding) 불가
	       *          7. 클래스 : 상속 불가
	       * */

		Statickeyword sk = new Statickeyword();
		
		System.out.println("non-static : "+ sk.getNonStaticCount());
		System.out.println("static : "+ sk.getStaticCount());
		
		sk.increaseNonStaticCount();
		sk.increaseStaticCount();
		
		System.out.println("non-static : "+ sk.getNonStaticCount());
		System.out.println("static : "+ sk.getStaticCount());
		
		
		
		Statickeyword sk2 = new Statickeyword();
		
		System.out.println("sk2 non-static : "+ sk2.getNonStaticCount());
		System.out.println("sk2 static : "+ sk2.getStaticCount());
		
		sk2.increaseNonStaticCount();
		sk2.increaseStaticCount();
		
		System.out.println("sk2 non-static : "+ sk2.getNonStaticCount());
		System.out.println("sk2 static : "+ sk2.getStaticCount());
		   /* 인스턴스 변수의 경우에는 sft1과 st2 두 개의 인스턴스가 서로 값을 공유하지 못하고
	       * 인스턴스를 생성할 때 마다 0으로 초기화 되었다.
	       * 하지만 static 필드의 경우에는 클래스변수 자체가 프로그램을 종료할 때 까지 유지되고 있기 때문에
	       * 값을 유지하고 있다.
	       * 따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다. 
	       * */
		
		
		
		// ㅡㅡㅡㅡㅡㅡnonStaticMethodㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		
		
		/* static 메소드도 이렇게 호출은 할 수 있다.
	       * 하지만 static메소드의 경우에는 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야 한다.
	       * static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
	       * static 메소드를 호출하는 방식으로 호출해야 한다.
	       * */
		smt.staticMethod(); // 권장하지않음, 노란 줄
		
		StaticMethodTest.staticMethod();
		
		
	}

}
