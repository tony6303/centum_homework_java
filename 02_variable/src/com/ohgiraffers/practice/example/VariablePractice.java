package com.ohgiraffers.practice.example;

import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablePractice exam = new VariablePractice();
//		exam.method1();
//		exam.method2();
//		exam.method3();
		exam.method4();
	}

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();

		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();

		System.out.println("성별을 입력하세요");
		char gender = sc.next().charAt(0);

		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();

		System.out.println("키" + height + "인 " + age + "살" + " " + gender + "자 " + name + "님 반갑습니다^^");
	} // method1 끝

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력하세요");
		int first = sc.nextInt();

		System.out.println("두 번째 정수를 입력하세요");
		int second = sc.nextInt();

		System.out.println("더하기 결과 :" + (first + second));
		System.out.println("빼기 결과 :" + (first - second));
		System.out.println("곱라기 결과 :" + (first * second));
		System.out.println("나누기 몫 결과 :" + (first / second));

	} // method2 끝

	public void method3() {
		Scanner sc = new Scanner(System.in);

		double width = sc.nextDouble();
		double height = sc.nextDouble();

		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (double) 2 * (width + height));
	} // method3 끝

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("영어 문자열을 입력해보세요.");
		String str = sc.nextLine();

		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));

	} // method4 끝
}
