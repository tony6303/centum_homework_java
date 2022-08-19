package com.uni.section03.array_copy;

public class Application4 {

	public static void main(String[] args) {
		/* 깊은 복사는 원본과 복사본 중 둘 중 한 가지 값을 변경해도 다른 하나에 영향을 주지 않는다.
	       * 같은 값을 가지고 있는 서로 다른 배열이기 때문이다.
	       */
		
		 /* 두 개의 같은 값을 가지는 배열을 만들었다. */
	      int[] arr1 = {1,2,3,4,5};
	      int[] arr2 = arr1.clone();
	      
        // 각 배열의 인덱스에 10씩 누적 증가 시킴
	    for(int i =0; i < arr1.length; i++) {
	    	arr1[i] = arr1[i] + 10;
	    }
	    
	    for(int i =0; i < arr1.length; i++) {
	    	System.out.print(arr1[i] + " ");
	    }
	    System.out.println();
	    
	    /* 향상된 for문 : jdk 1.5 버젼부터 추가되었다.
	       * 배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행한다.*/
	    for(int i : arr2) {
	    	i = i + 10;
	    }
	    
	    
	    /* 주의 : 향상된 for문은 배열에 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수는 없다. 
	       * 대신 변경하는 것이 아니고 사용하는 것이 목적이라면 조금 더 편하게 사용할 수 있다.
	       * */
	    for(int i =0; i < arr2.length; i++) {
	    	System.out.print(arr2[i] + " ");
	    }
	    System.out.println();
	} // main end

}
