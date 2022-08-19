package com.uni.section4.wrapper;

public class Application1 {

	public static void main(String[] args) {
		   /* Wrapper 클래스 */
	      /* 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
	       * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
	       * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스 (Wrapper class)
	       * 라고 한다. (주방에서 사용하는 랩(Wrap)과 같은 의미로 감싼다는 의미이다.) 
	       * */
	      
	      /* 기본타입              래퍼클래스
	       * byte          Byte
	       * short         Short
	       * int           Integer
	       * long          Long
	       * float         Float
	       * double        Double
	       * char          Character
	       * boolean       Boolean
	       * */
	      
	      /* 박싱(Boxing)과 언박싱(UnBoxing) 
	       * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
	       * 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
	       * */
		
		int intValue = 20;
		
		Integer boxingNumber1 = new Integer(intValue);  // 인스턴스 화   박싱 생성자 이용
		Integer boxingNumber2 = Integer.valueOf(intValue);  // 인스턴스 화  박싱 static 메소드 이용

		int unBoxingNumber1 = boxingNumber1.intValue();  // 언박싱 intValue 사용
		
		/* 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing) 
	       * JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일리가 이를 자동으로 처리해준다. 
	       * 이런 자동화된 박싱과 언박싱을 오토박싱, 오토 언박싱 이라고 부른다.
	       * */
		Object[] obj = new Object[2];
		obj[0] = 1;   // Integer.valueOf(1); // 1이 자동으로 박싱 처리됨
		
		Integer boxingNumber3 = intValue;  // 오토박싱        래퍼클래스 변수 = 일반 자료형    래퍼가 씌워진다 (박싱)
		
		int unBoxingNumber2 = boxingNumber3; // 오토 언박싱        일반자료형 = 래퍼클래스 변수   래퍼가 벗겨진다(언박싱)
		
		int inum = 20;
//	      Integer integerNum1 = new Integer(20);
//	      Integer integerNum2 = new Integer(20);
	      Integer integerNum1 = Integer.valueOf(20);
	      Integer integerNum2 = Integer.valueOf(20);
	      Integer integerNum3 = 20;
	      Integer integerNum4 = 20;
	      
		System.out.println(inum == integerNum1);
		System.out.println(inum == integerNum3);
		
		System.out.println(integerNum1 == integerNum2);  // new로 생성해서 비교하면 false가 나오게된다.  deprecated
		System.out.println(integerNum1.equals(integerNum2));
		
	      
	}

}
