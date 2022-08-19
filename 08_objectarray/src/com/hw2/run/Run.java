package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.   // 10명은 많은거 같아서 3명으로 줄였습니다
		int count = 0; // 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임
		
		int grade;
		int classroom;
		String name;
		int kor;
		int eng;
		int math;
		
		Student[] studentArr = new Student[3];
		Student stu = new Student();
		
		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			
			System.out.println("학년을 입력하세요.");
			grade = sc.nextInt();
			
			System.out.println("반을 입력하세요.");
			classroom = sc.nextInt();
			sc.nextLine();
			
			System.out.println("이름을 입력하세요.");
			name = sc.nextLine();
			
			System.out.println("국어점수를 입력하세요.");
			kor = sc.nextInt();
			
			System.out.println("영어점수를 입력하세요.");
			eng = sc.nextInt();
			
			System.out.println("수학점수를 입력하세요.");
			math = sc.nextInt();
			
			
			stu.setGrade(grade);
			stu.setClassroom(classroom);
			stu.setName(name);
			stu.setKor(kor);
			stu.setEng(eng);
			stu.setMath(math);
			
			Student emptyStudent = new Student(stu.getGrade(), stu.getClassroom(), stu.getName(), stu.getKor(), stu.getEng(), stu.getMath());
			
			studentArr[count] = emptyStudent;
			count++;  // 한 명씩 추가 되었기 때문에 count 1증가
			
			
			
			// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
			char isMore;
			System.out.println("학생을 더 추가하시겠습니까? (y,n)");
			isMore = sc.next().charAt(0);
			
			if(isMore == 'y') {
				if(count == 3) {
					System.out.println("학생부가  3명이 되어서 추가 입력은 할 수 없습니다.");
					break;
				}
			}else if(isMore == 'n') {
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다");
				break;
			}
			
		} // while 끝
		
		// 현재 배열에 담겨있는
		// 학생들의 정보를 모두 출력
		
		for(int i = 0; i < count; i++) {
			System.out.println( studentArr[i].information());
		}

	}

}
