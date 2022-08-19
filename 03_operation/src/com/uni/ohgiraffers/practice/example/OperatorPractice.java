package com.uni.ohgiraffers.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		OperatorPractice exam = new OperatorPractice();

		exam.practice9();
	}

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 한 개 입력하세요");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("양수가 아니다");
		} else {
			System.out.println("양수다");
		}
	} // practice1 끝

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 한 개 입력하세요");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0 이다");
		} else {
			System.out.println("음수다");
		}
	} // practice2 끝

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 한 개 입력하세요");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	} // practice3 끝

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("인원 수 : ");
		int people = sc.nextInt();

		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 :" + (candy / people));
		System.out.println("남는 사탕 개수 :" + (candy % people));
	} // practice4 끝

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.println("반(숫자만) : ");
		int classNum = sc.nextInt();

		System.out.println("번호(숫자만) : ");
		int Number = sc.nextInt();

		System.out.println("성별(M/F) : ");
		char ch = sc.next().charAt(0);
		String gender = "";

		if (ch == 'M') {
			gender = "남학생";
		} else if (ch == 'F') {
			gender = "여학생";
		}
		;

		System.out.println("성적(소수점 아래 둘째 까지) : ");
		double point = sc.nextDouble();

		System.out
				.println(grade + "학년" + classNum + "반" + Number + "번" + name + " " + gender + "의 성적은" + point + "이다.");
	} // practice5 끝

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.println("나이 : ");
		int age = sc.nextInt();

		if (age <= 13) {
			System.out.println("어린이");
		} else if (age > 13 && age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}

	} // practice6 끝

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();

		int sum = (kor + eng + math);
		double avg = (kor + eng + math) / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60.0) {
			System.out.println("합격!!");
		} else {
			System.out.println("불합격!!");
		}

	} // practice7 끝

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록번호를 입력하세요 (- 포함) : ");
		String minNo = sc.nextLine();

		if (minNo.charAt(7) == '1') {
			System.out.println("남자");
		} else if (minNo.charAt(7) == '2') {
			System.out.println("여자");
		}

	} // practice8 끝

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2(정수 1보다 큰 수 입력) : ");
		int num2 = sc.nextInt();

		System.out.println("입력 : ");
		int num3 = sc.nextInt();

		String result = "";
		result = num3 < num1 ? "true" : "false";
		result = num3 > num2 ? "true" : "false";

		System.out.println(result);

	} // practice9 끝

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 입력2 : ");
		int num2 = sc.nextInt();
		System.out.println("정수 입력3 : ");
		int num3 = sc.nextInt();

		String result = (num1 == num2) ? ((num2 == num3) ? "true" : "false") : "false";
		System.out.println(result);

	} // practice10 끝

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.println("A사원 연봉: ");
		int sal1 = sc.nextInt();
		System.out.println("B사원 연봉 : ");
		int sal2 = sc.nextInt();
		System.out.println("C사원 연봉 : ");
		int sal3 = sc.nextInt();

		String result1 = sal1 * 1.4 >= 3000 ? "3000이상" : "3000미만";
		String result2 = sal2 >= 3000 ? "3000이상" : "3000미만";
		String result3 = sal3 * 1.15 >= 3000 ? "3000이상" : "3000미만";

		System.out.println("A사원의 인센티브 포함 연봉 : " + sal1 * 1.4);
		System.out.println(result1);
		System.out.println("B사원의 인센티브 포함 연봉 : " + sal2);
		System.out.println(result2);
		System.out.println("C사원의 인센티브 포함 연봉 : " + sal3 * 1.15);
		System.out.println(result3);

	} // practice11 끝

}
