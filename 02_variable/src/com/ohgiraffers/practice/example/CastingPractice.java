package com.ohgiraffers.practice.example;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		CastingPractice exam = new CastingPractice();

//		exam.method1();
//		exam.method2();
		exam.method3();

	}

	public void method1() {
		char A = 'A';
		System.out.println("A Unicode : " + (int) A);
	} // method1 끝

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 : ");
		double kor = sc.nextDouble();

		System.out.println("영어 : ");
		double eng = sc.nextDouble();

		System.out.println("수학 : ");
		double math = sc.nextDouble();

		double result = kor + eng + math;
		double resultAvg = (kor + eng + math) / 3;

		System.out.println("총점 : " + (int) (result));
		System.out.println("평균 : " + (int) (resultAvg));
	} // method2 끝

	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A'; // 65

		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int) dNum); // 2
		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double) iNum1); // 10.0
		System.out.println((double) iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5
		System.out.println((int) fNum); // 3
		System.out.println(iNum1 / (int) fNum); // 3
		System.out.println(iNum1 / fNum);// 3.3333333
		System.out.println(iNum1 / (double) fNum); // 3.333333333333335
		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println((int) ch + iNum1); // 75
		System.out.println((char) (ch + iNum1)); // 'K'
	} // method3 끝
}
