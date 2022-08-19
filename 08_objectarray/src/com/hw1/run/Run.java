package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체배열을 크기 3으로 할당 한 뒤
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		Employee[] empArr = new Employee[3];
		Employee emp = new Employee();
		
		empArr[0] = new Employee();
		System.out.println(empArr[0].hashCode());
		
		empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		
		empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

		System.out.println("empArr[0] : " + empArr[0].information());
		System.out.println("empArr[1] : " + empArr[1].information());
		System.out.println("empArr[2] : " + empArr[2].information());
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
		emp = empArr[0];
		emp.setEmpName("김말똥");
		emp.setDept("영업부");
		emp.setJob("팀장");
		emp.setAge(30);
		emp.setGender('M');
		emp.setSalary(3000000);
		emp.setBonusPoint(0.2);
		emp.setPhone("01055559999");
		emp.setAddress("전라도 광주");
		System.out.println(emp.information());
		
		emp = empArr[1];
		emp.setDept("기획부");
		emp.setJob("부장");
		emp.setSalary(4000000);
		emp.setBonusPoint(0.3);
		System.out.println(emp.information());
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		emp = empArr[0];
		System.out.println("김말똥의 연봉 " + (emp.getSalary() + ( emp.getSalary() * emp.getBonusPoint() ) ) * 12);
		
		emp = empArr[1];
		System.out.println("홍길동의 연봉 " + (emp.getSalary() + ( emp.getSalary() * emp.getBonusPoint() ) ) * 12);
		
		emp = empArr[2];
		System.out.println("김말순의 연봉 " + (emp.getSalary() + ( emp.getSalary() * emp.getBonusPoint() ) ) * 12);
		
		// 3명 직원의 연봉 평균을 구하여 출력
		double result = 0;
		
		for(int i = 0; i < empArr.length; i++) {
			emp = empArr[i];
			result = result + (emp.getSalary() + ( emp.getSalary() * emp.getBonusPoint() ) ) * 12;
			System.out.println(result);
		}
		
		System.out.println("직원들의 연봉의 평균 : " + result/3);
	}

}
