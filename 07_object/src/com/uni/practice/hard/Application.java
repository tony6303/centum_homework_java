package com.uni.practice.hard;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//스캐너를 이용해서 모든 직원 정보를 입력 받아
		 //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
		 //getter를 이용하여 모든 필드 값 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n직원번호 입력(정수) : ");
		int number = sc.nextInt();
		sc.nextLine(); // 다음 스캐너가 nextLine일때 사용
		
		System.out.print("\n직원명 입력 : ");
		String name = sc.nextLine();  // nextLine 끼리 이어진건 상관없음
		
		System.out.print("\n부서 입력 : ");
		String dept = sc.nextLine();
		
		System.out.print("\n직급 입력 : ");
		String job = sc.nextLine();
		
		System.out.print("\n나이 입력(정수) : ");
		int age = sc.nextInt();
		sc.nextLine(); // 다음 스캐너가 nextLine일때 사용
		
		System.out.print("\n성별 입력(남,여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("\n월급 입력 : ");
		int salary = sc.nextInt();
		
		System.out.print("\n보너스 입력(실수) : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine(); // 다음 스캐너가 nextLine일때 사용
		
		System.out.print("\n연락처 입력 : ");
		String phone = sc.nextLine();
		
		System.out.print("\n주소 입력 : ");
		String address = sc.nextLine();
		
		EmployeeVO evo = new EmployeeVO();
		evo.setNumber(number);
		evo.setName(name);
		evo.setDept(dept);
		evo.setJob(job);
		evo.setAge(age);
		evo.setGender(gender);
		evo.setSalary(salary);
		evo.setBonusPoint(bonusPoint);
		evo.setPhone(phone);
		evo.setAddress(address);
		
		System.out.println(evo.getNumber());
		System.out.println(evo.getName());
		System.out.println(evo.getDept());
		System.out.println(evo.getJob());
		System.out.println(evo.getAge());
		System.out.println(evo.getGender());
		System.out.println(evo.getSalary());
		System.out.println(evo.getBonusPoint());
		System.out.println(evo.getPhone());
		System.out.println(evo.getAddress());
		
		
	}

}
