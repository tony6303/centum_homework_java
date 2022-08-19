package com.uni.section2.string;

import java.util.StringTokenizer;

public class Application3 {
	   /* split()과 StringTokenizer */
    /* 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
     * split() : 정규표현식을 이용하여 문자열을 분리한다.
     *           비정형화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
     *           정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
     *           정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정이다.
     * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
     *                   정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 문자열 무시)
     *                   split()보다 속도면에서 더 빠르다.
     *                   구분자를 생략하는 경우 공백이 기본 구분자이다.
     * */
	
	public static void main(String[] args) {
		/* 각 문자열의 의미는 사번/이름/주소/부서 를 의미한다. */
	    String emp1 = "100/홍길동/서울/영업부";      //모든 값 존재함
	    String emp2 = "200/유관순//총무부";         //주소 없음
	    String emp3 = "300/이순신/경기도/";      //부서 없음
	    
	    String[] empArr1 = emp1.split("/");
	    String[] empArr2 = emp2.split("/");
	    String[] empArr3 = emp3.split("/");
	    
	    
//	    for(int i = 0; i < empArr1.length; i++) {
//	    	System.out.println("empArr1[" + i + "] : " + empArr1[i]  );
//	    }
//	    
//	    for(int i = 0; i < empArr2.length; i++) {
//	    	System.out.println("empArr2[" + i + "] : " + empArr2[i]  );
//	    }
//	    
//	    for(int i = 0; i < empArr3.length; i++) {
//	    	System.out.println("empArr3[" + i + "] : " + empArr3[i]  );
//	    }
//	    
//	    String[] empArr4 = emp3.split("/", -1);
//	    
//	    for(int i = 0; i < empArr4.length; i++) {
//	    	System.out.println("empArr4[" + i + "] : " + empArr4[i]  );
//	    }
	    
	    // StringTokenizer 의 경우 공백으로 존재하는 값을 무시
	    StringTokenizer st1 = new StringTokenizer(emp1, "/");
	    StringTokenizer st2 = new StringTokenizer(emp2, "/");
	    StringTokenizer st3 = new StringTokenizer(emp3, "/");
//	    System.out.println(st1.countTokens());
//	    while(st1.hasMoreTokens()) {
//	    	System.out.println(st1.nextToken());
//	    }
//	    System.out.println("nextToken 후 : " + st1.countTokens());  // 하나씩 깎이는듯? 그래서 while 탈출 후 결과 0
//	    while(st2.hasMoreTokens()) {
//	    	System.out.println(st2.nextToken());
//	    }
//	    while(st3.hasMoreTokens()) {
//	    	System.out.println(st3.nextToken());
//	    }
	    
	    String colorStr = "red*oranage#blue/yellow green";	    
//	    String colorStr = "oranage#blue/yellow green";
	    
//	    String[] colors = colorStr.split("*#/ "); // 제대로 안잘린다 !!! ( 아마 안잘리는걸 의도하신게 맞는거같음 )
	    String[] colors = colorStr.split("\\*|#|/");  // * 이 맨앞에 오면 오류가 난다. 그래서 역슬래시 두 번 
	    
	    
        for(int i = 0; i < colors.length; i++) {
        	System.out.println("colors[" + i + "] : " + colors[i]);  // split으로 분리된 배열 출력
        }
	    
        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*#/ ");  // split 과 다르게 붙여서 써도 잘라진다.
        
        while(colorStringTokenizer.hasMoreTokens()) {
        
           System.out.println(colorStringTokenizer.nextToken());
        }
        
	    
	    
	}
	  
    
}

