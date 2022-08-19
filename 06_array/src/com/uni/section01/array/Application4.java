package com.uni.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		/* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번째 학생의 점수 입력 : ");
			score[i] = sc.nextInt();
			
			sum = sum + score[i];
		} // for end
			avg = ( sum / score.length );
			
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	} // main end

}
