package com.uni.section05.parameter;

public class Application {

	public static void main(String[] args) {
		ParameterTest pt = new ParameterTest();
		
		int num = 20;
		
		pt.testPrimaryTypeArrayParameter(num);
		
		int[] iarr = new int[] {1,2,3,4,5};
		
		pt.testPrimaryTypeArrayParameter(iarr);
		
		RectAngle r1 = new RectAngle(12.5, 22.5);
		
		System.out.println("인자로 전달하는 값 : " + r1); // r1 을(주소값) ParameterTest 함수의 매개변수로 넣을거임
		
		pt.testClassTypeParameter(r1);
		
//		System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
//	    r1.calcArea();
//	    r1.calcRound();
		
		pt.testVaribaleLengthArrayParameter("김대엽", args); // 가변인자는 전달하지 않아도 된다
		pt.testVaribaleLengthArrayParameter("김대엽", "볼륑", "골푸","숴핑" );
		
		String[] strArr = new String[] {"볼륑", "골푸","숴핑"};
		pt.testVaribaleLengthArrayParameter("김대엽", strArr ); // 배열도 전달 가능
		
	} // main 끝

}
