package com.uni.section05.parameter;

public class ParameterTest {
	/* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있다. 
     * 
     * 매개변수(parameter)로 사용 가능한 자료형
     * 1. 기본자료형
     * 2. 기본자료형 배열
     * 3. 클래스자료형
     * 4. 클래스자료형 배열
     * 5. 가변인자
     * */
	
	public void testPrimaryTypeArrayParameter(int num) {
		System.out.println("매개변수로 받은 값 : " + num);
	}
	
	public void testPrimaryTypeArrayParameter(int[] iarr) {
	      
	      /* 배열의 주소가 전달된다.
	       * 즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킨다.(얕은복사) */
	      System.out.println("매개변수로 전달받은 값 : " + iarr);
	      
	      /* 배열의 값 출력 */
	      System.out.print("배열의 값 출력 : ");
	      for(int i = 0; i < iarr.length; i++) {
	         System.out.print(iarr[i] + " ");
	      }
	      System.out.println();
	      
	      /* 배열의 0번인덱스에 값 변경 */
	      iarr[0] = 99;
	      
	      /* 값 변경 후 배열의 값 출력 */
	      System.out.print("변경 후 배열의 값 출력 : ");
	      for(int i = 0; i < iarr.length; i++) {
	         System.out.print(iarr[i] + " ");
	      }
	      System.out.println();
	   }  // testPrimaryTypeArrayParameter 끝
	
	public void testClassTypeParameter(RectAngle rectAngle) {
		   /* 인스턴스도 주소가 전달된다. 
	       * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 서로 동일한 인스턴스를 가리킨다. (얕은복사)*/
	      System.out.println("매개변수로 전달받은 값 : " + rectAngle);
	      
	      /* 사각형의 넓이와 둘레 출력 */
	      System.out.println("변경 전 사각형의 넓이와 둘레 ========================");
	      rectAngle.calcArea();
	      rectAngle.calcRound();
	      
	      /* 사각형의 너비와 높이를 변경 */
	      rectAngle.setWidth(100);      //자동형변환 적용됨
	      rectAngle.setHeight(100);
	      
	      /* 변경 후 사각형의 넓이와 둘레 출력 */
	      System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
	      rectAngle.calcArea();
	      rectAngle.calcRound();
	} // testClassTypeParameter 끝
	
	// 																가변인자 ? << 공부해볼 내용   특징: 인자 맨뒤에 써야한다
	public void testVaribaleLengthArrayParameter(String name, String...hobby) { 
		System.out.println("이름 : " + name);
	      System.out.println("취미의 갯수 : " + hobby.length);
	      System.out.print("취미 : ");
	      for(int i = 0; i < hobby.length; i++) {
	         System.out.print(hobby[i] + " ");
	      }
	      System.out.println();
	}
	
	
	
}
