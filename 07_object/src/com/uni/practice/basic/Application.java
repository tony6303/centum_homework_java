package com.uni.practice.basic;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
		 */
		
		MemberVO mvo = new MemberVO();
		
		//getter를 이용해서 필드의 초기값 확인
		System.out.println("id : " +mvo.getId());
		System.out.println("pwd : " +mvo.getPwd());
		System.out.println("name : " +mvo.getName());
		System.out.println("age : " + mvo.getAge());
		System.out.println("gender : " + mvo.getGender());
		System.out.println("phone : " + mvo.getPhone());
		System.out.println("email :  " + mvo.getEmail());
		
		 //setter를 이용해서 필드 값 변경
		mvo.setId("user01");
		mvo.setPwd("pass01");
		mvo.setName("홍길동");
		mvo.setAge(20);
		mvo.setGender('M');
		mvo.setPhone("010-1234-5678");
		mvo.setEmail("hong123@greedy.com");
		
		 //getter를 이용해서 변경된 필드값 확인
		System.out.println("변경 후 id : " +mvo.getId());
		System.out.println("변경 후 pwd : " +mvo.getPwd());
		System.out.println("변경 후 name : " +mvo.getName());
		System.out.println("변경 후 age : " + mvo.getAge());
		System.out.println("변경 후 gender : " + mvo.getGender());
		System.out.println("변경 후 phone : " + mvo.getPhone());
		System.out.println("변경 후 email :  " + mvo.getEmail());
		
		

	}

}
