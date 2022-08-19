package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력 
		String name;
		int age;
		double height;
		double weight;
		
		int grade;
		String major;
		
		Student[] stuArr = new Student[3];
		Student stu1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		Student stu2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Student stu3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		stu1.setName("홍길동");
		stu2.setName("김말똥");
		stu3.setName("강개순");
		
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].information());
		}
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])  // 많은거 같아서 3명으로 
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함
		int salary;
		String dept;
		
		int count = 0;
		
		Employee[] empArr = new Employee[3];
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("이름을 입력하세요.");
			name = sc.nextLine();
			
			System.out.println("나이를 입력하세요.");
			age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("신장을 입력하세요.");
			height = sc.nextDouble();
			
			System.out.println("몸무게를 입력하세요.");
			weight = sc.nextDouble();
			
			System.out.println("급여를 입력하세요.");
			salary = sc.nextInt();
			sc.nextLine();
			
			System.out.println("부서를 입력하세요.");
			dept = sc.nextLine();
			
			emp.setAge(age);
			emp.setHeight(height);
			emp.setWeight(weight);
			emp.setSalary(salary);
			emp.setDept(dept);
			
//			Employee emptyEmployee2 = new Employee(name,age,height,weight,salary,dept);
			Employee emptyEmployee = new Employee(emp.getName(), emp.getAge(), emp.getHeight(), emp.getWeight(), emp.getSalary(), emp.getDept());
			emptyEmployee.setName(name);
			
			empArr[count] = emptyEmployee;
			count++;  // 한 명씩 추가 되었기 때문에 count 1증가
			
			// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
			char isMore;
			System.out.println("사원을 더 추가하시겠습니까? (y,n)");
			isMore = sc.next().charAt(0);
			sc.nextLine();
			
			if(isMore == 'y') {
				if(count == 3) {
					System.out.println("사원이  3명이 되어서 추가 입력은 할 수 없습니다.");
					break;
				}
			}else if(isMore == 'n') {
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다");
				break;
			}
			
		} // while 끝
		
		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i = 0; i < count; i++) {
			System.out.println( empArr[i].information());
		}
		
//		향상된 for문
//		for(Employee employee: empArr) {
//			System.out.println(employee.information());
//		}

	}

}
