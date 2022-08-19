package com.uni.section03.dto;

public class Application {

	public static void main(String[] args) {
		/*DTO(Data Transfer Object) 설계
	       * 데이터를 주고받을떄 하나의 값만 전달하는것은 아니다 여러데이터를 한번에 주고받기위한 용도
	       * private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성
	       * */
	       /* 회원 정보를 담는 MemberDTO라는 클래스를 DTO 클래스로 설계하고 작성해볼 것이다.
	       * 이번에는 회원이 할 수 있는 행동이 주체가 아닌, 관리하려는 회원의 데이터에 집중해서 필드부터 설계한다.
	       * MemberDTO 클래스부터 만들어보자.
	       * */

		
		   MemberDTO member = new MemberDTO();
		      member.setNumber(1);
		      member.setName("홍길동");
		      member.setAge(20);
		      member.setGender('남');
		      member.setHeight(180.5);
		      member.setWeight(80.6);
		      member.setActivated(true);
		      
		      System.out.println("회원번호 : " + member.getNumber());
		      System.out.println("회원명 : " + member.getName());
		      System.out.println("나이 : " + member.getAge());
		      System.out.println("성별 : " + member.getGender());
		      System.out.println("키 : " + member.getHeight());
		      System.out.println("몸무게 : " + member.getWeight());
		      System.out.println("회원활성화상태 : " + member.isActivated());
		      
		      printMember(member);
		      
	} // main 끝
	
	public static void printMember(MemberDTO member) {
		System.out.println( member.getName());
	}

}
