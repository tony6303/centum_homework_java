package com.uni.section02.demensional_array;

public class Application2 {

	public static void main(String[] args) {
		//추가 필요
		
		/* 2차원 정변배열을 선언 및 할당 하고 차례로 값을 대입해서 출력해보자 */
		   
	      /* 1. 배열의 선언 및 할당
	       * 정변 배열의 경우 각 인덱스별 배열을 따로 할당할 수 도 있지만
	       * 선언과 동시에 모든 배열을 할당할 수 있다.
	       * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
	       * */
	      int[][] iarr = new int[3][5];      //길이 5의 배열을 3개 할당하고 그 주소를 묶어 관리하는 배열의 주소를 stacik의 iarr에 저장한다.

	      for(int i = 0; i < iarr.length; i++) {
		    	for(int j = 0; j < iarr[i].length; j++) {
		    		System.out.print(iarr[i][j] + " ");
		    		
		    	}
		    	System.out.println();
		    }
	} // main end

}
