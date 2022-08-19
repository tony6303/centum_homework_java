package com.uni.section01.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		/* 배열의 사용 방법 */
	      
	      /* 배열의 선언 */
	      /* 자료형[] 변수명;
	       * 자료형 변수명[]; 로 선언할 수 있다.
	       * */
	      
	      /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
		
		// 아무데나 붙여도 상관은없지만   저는 보통 자료형에 붙이는걸 선호
		
		int[] iarr;
		char carr[];
		
		   /* 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
	       * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
	       * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 참조자료형(reference type)이라고 한다.
	       * */
		
		// 배열을 할당 할 때 크기를 반드시 지정 해 주어야 한다.
		//iarr = new int[];  // 크기를 지정해주지 않아서 에러 발생
		
		iarr = new int[5];
		carr = new char[10];
		
		// 선언과 할당을 동시에
		int[] iarr2 = new int[5];
		char[] carr2 = new char[10];
		
		/* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
	       * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
	       * */
		
		System.out.println("iarr2 : " + iarr2);
		System.out.println("carr2 : " + carr2);
		
		/* hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다. 
	       * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overriding 해서 사용한다. 
	       * 이 부분은 뒤에서 다루게 되니, 그 전까지는 쉽게 주소값이라고 생각하고 사용하면 된다.
	       * */
		
		System.out.println("iarr2의 hashcode : " + iarr2.hashCode());
		System.out.println("carr2의 hashcode : " + carr2.hashCode());
		
		
		/* 배열의 길이를 알 수있는 기능을 필드로 제공하고 있다. 
	       * 필드 또한 뒤에서 다루게 될 것이다. (일종의 변수라고 보면 된다) 
	       * 필드가 무엇인지 궁금하면 자바 api document 에 가서 array 검색 */
	      /* 참고로 String의 문자열 길이는 메소드로 제공하고 있기 때문에 length()로 사용한다. */
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("carr2의 길이 : " + carr2.length);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("새로 할당할 배열의 크기를 입력 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		
		darr = new double[30];
		
		System.out.println("수정 후 darr의 hashcode : " + darr.hashCode());
		System.out.println("수정 후 darr의 길이 : " + darr.length);
		
		
		darr = null;
		
		/* NullPointerException 발생함
	       * 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우 참조연산자를 사용하게 될 때 발생하는 에러이다.
	       * */
//		System.err.println("삭제 후 darr의 길이 : " + darr.length); // NULLPointerException 발생
		
		
	      /* 한번 할당된 배열은 지울 수 없다.
	       * 다만 레퍼런스 변수를 null로 변경하여 더 이상 주소를 참조할 수 없게된 배열은
	       * 일정 시간이 지난 후 heap의 old 영역으로 이동하여 GC(가비지컬렉터)가 삭제시킨다.
	       * 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조 불가능하다.
	       * */
		
		
	} // main end

}

