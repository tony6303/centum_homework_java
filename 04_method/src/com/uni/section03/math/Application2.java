package com.uni.section03.math;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /* 난수의 활용 */
	      /* Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
	       * 필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재하는데
	       * 필요한 범위까지의 난수를 발생시켜보자.
	       * */
	      
	      /* 원하는 범위의 난수를 구하는 공식
	       * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

		// 0부터 9
		int random1 = (int) Math.random()*10;
				
		// 1부터 10
		int random2 = ((int) Math.random()*10) + 1 ;
		
		// 10부터 15
		int random3 = ((int) Math.random()*6) + 10 ;
		
		
		System.out.println("0 부터 9 사이의 난수 : " + random1);
		System.out.println("1 부터 10 사이의 난수 : " + random2);
		System.out.println("10 부터 15 사이의 난수 : " + random3);
	}

}
