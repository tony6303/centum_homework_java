package com.uni.section03.math;

import java.util.Random;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      /* java.util.Random 클래스 */
	      /* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생 
	       * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환 */
	      
	      /* 원하는 범위의 난수를 구하는 공식
	       * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값 
	       * */
		
		Random random = new Random();
		
		// 0부터 9
				int random1 = random.nextInt(10);
						
				// 1부터 10
				int random2 = random.nextInt(10) + 1;
				
				// 10부터 15
				int random3 = random.nextInt(6) + 10;
				
				//   -128부터 127
				int random4 = random.nextInt(256) - 128;
				
				
				System.out.println("0 부터 9 사이의 난수 : " + random1);
				System.out.println("1 부터 10 사이의 난수 : " + random2);
				System.out.println("10 부터 15 사이의 난수 : " + random3);
				System.out.println("10 부터 15 사이의 난수 : " + random4);
	}

}
