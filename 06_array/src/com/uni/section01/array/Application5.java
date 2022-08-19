package com.uni.section01.array;

import java.util.Random;

public class Application5 {

	public static void main(String[] args) {
		/* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
	    /* 먼저 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자 */
	    String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};//인덱스 0-3까지의 난수 
	    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"}; // 0~12 까지의 난수
	      
	    Random random = new Random();
//	    int randomShapeIndex = random.nextInt(4);
//	    int randomCardNumberIndex = random.nextInt(14);
	    
	    int randomShapeIndex = (int) (Math.random() * shapes.length);
	    int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);
	    
	    System.out.println(randomShapeIndex);
	    System.out.println(randomCardNumberIndex);
	      
	    System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + " 카드 입니다.");

	}

}
