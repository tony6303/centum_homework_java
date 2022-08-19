package com.uni.section04.scanner;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /**
	       *  java.util.Scanner 클래스는 이미 제공되는 클래스이다. 
	       *  이 Scanner라는 클래스가 가지고 있는 메소드를 이용해서 키보드로 값을 입력받을 것이다. 
	       *  우리가 어떤 클래스에 있는 메소드를 사용하고자 할 때 
	       *  클래스 생성 -> 메소드 호출 했었다. 그러면 Scanner 클래스에 작성되어있는 메소드를 호출하고자 한다면
	       *  얘도 생성 후 실행해야된다. 
	       *  
	       *  단 요 클래스는 살짝 종특이다. 생성을 할 때 어떠한 문구를 작성하게 된다. 
	       *
	          // next() : 띄어쓰기로 구분
	         // nextLine() : 줄바꿈으로 구분
	         // next() 값만 읽어오고 엔터는 버퍼에 남아있다.
	         // next() 바로 다음에 nextLine()이 있을시 버퍼에 남아있는 엔터 line을 읽어온다.
	         // next(), nextXXX() 메소드 뒤에 nextLine() 메소드를 한번 더 사용해서 버퍼에 남아있는 엔터를 실행시켜주면됨.

	       */
		
		   /* 1. Scanner 객체 생성 */
	      /* 1-1. 원래 이렇게 Scanner 객체를 만들어야 함 */
	      //java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		
		Scanner sc = new Scanner(System.in);
		
		// 2. 자료형 별 값 받기
		// 2.1 문자형 /* nextLine() : 입력받은 값을 문자열로 반환해줌 */
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		// 2.2 정수형
		// nextInt() : 입력받은 값을 Int로 변환 한다.
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();  
		System.out.println("당신의 나이는 " + age + "입니다.");
		
		/* nextLong() : 입력받은 값을 long 형으로 반환한다.*/
		System.out.println("금액을 입력해주세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 " + money + "원 입니다.");
		
		
		/* 2-3. 실수형 값 입력 받기 */
	    /* nextFloat() : 입력받은 값을 float 형으로 반환한다. */
		System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");
        
        
        /* nextDouble() : 입력받은 값을 double 형으로 반환한다. */
        System.out.print("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");
        
        
        /* 2-4. 논리형 값 입력받기 */
        /* nextBoolean() : 입력받은 값을 boolean형으로 반환한다.
         * true or false 외에 다른 값을 입력하게 되면 InputMismatchException 발생함
         * */
        System.out.print("참과 거짓 중에 한 가지를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");
        
        
        /* 2-5. 문자형 값 입력받기 */
        /* 아쉽게도 문자를 직접 입력 받는 기능을 제공하지는 않는다.
         * 따라서 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
         * java.lang.String에 charAt(int index)를 사용한다.
         * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자 형으로 반환해주는 기능을 한다.
         * 
         * index는 0부터 시작하는 숫자 체계
         * 만약 존재하지 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException이 발생한다.
         * */
        
        sc.nextLine();   // boolean 입력하고 난 뒤 엔터가 남아있어서 이걸로 처리하신다고 하네요
        System.out.println("아무문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);    // charA(n)   n 번째 인덱스 가져오는 함수
        
        System.out.println("입력하신 문자는" + ch + "입니다.");
        
        sc.close();
        
	}

}















