package com.uni.first;  // 패키지 : 유사한 클래스를 묶어주는 역할

public class HelloWorld {

	//public : 메인 메소드는 외부에서 호출할수있다.
	//static : 객체를 생성하지 않고도 실행 시킬 수 있다.
	//void : 반환값이 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi~~~~");   // println  << 자동으로 줄바꿈 해준다
		
		
		System.out.print("안녕~~\n");  //   \n (역슬래시 n) 은 줄바꿈 해주는 약속된 언어이다  
		System.out.print("안녕123~~"); //  print  << 한 행에 쭉 이어서 출력해준다.
	}

}
