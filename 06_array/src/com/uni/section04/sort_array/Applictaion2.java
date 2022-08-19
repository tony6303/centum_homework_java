package com.uni.section04.sort_array;

public class Applictaion2 {

	public static void main(String[] args) {
		   /* 순차 정렬 */
	      /* 순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
	       * 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
	       * */
	      
	      /* 초기 배열 선언 및 초기화 */
	      int[] iarr = {2,5,4,6,1,3};
	      
	      // 2 5 4 6 1 3  i=2 , j=1 일때 교환발생
	      // 2 4 5 6 1 3  i=4 , j=0
	      // 1 4 5 6 2 3  i=4 , j=1
	      // 1 2 5 6 4 3  i=4 , j=2
	      // 1 2 4 6 5 3  i=4 , j=3
	      // 1 2 4 5 6 3  i=5 , j=2
	      // 1 2 3 5 6 4  i=5 , j=3
	      // 1 2 3 4 6 5  i=5 , j=4
	      // 1 2 3 4 5 6  
	      
	      /* 인덱스 한 개씩 증가시키는 반복문 
	       * 첫 번째 인덱스는 비교할 필요 없어서 1번 인덱스부터 비교 시작 */
	      for(int i = 1; i < iarr.length; i++){
	         
	         /* 인덱스가 증가할 때 마다 처음부터 해당 인덱스까지 값을 비교하는 반복문 */
	         for(int j = 0; j < i; j++){
	            
	            /* 오름차순 정렬을 위한 처리 - 오름차순이기때문에 앞에있는 숫자가 크면 바꿔줘야한다. 
	             * 내림차순은 부등호만 반대로 처리하면 됨 
	             **/
	            //비교 주체가 비교대상보다 작을 경우에 값을 교환
	            System.out.println("i : " + i + " ---> " +iarr[i]);
	            System.out.println("j : " + j + " ---> " +iarr[j]);
	            if(iarr[i] < iarr[j]) {  // 지금 비교할 숫자 보다 뒤에있는 숫자가 더 크면,
	               
	               System.out.println("==교환발생 ==");

	               int temp;
	               temp = iarr[i];
	               iarr[i] = iarr[j];
	               iarr[j] = temp;
	            } // if end

	         }  // for end
	      } // for end
	      
	      /* 값 출력용 반복문 */
	      for(int i = 0; i < iarr.length; i++){
	         System.out.print(iarr[i] + " ");
	      }

	} // main end

}
