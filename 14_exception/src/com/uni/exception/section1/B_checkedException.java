package com.uni.exception.section1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_checkedException {
	//CheckedException 은 반드시 예외처리를 해줘야한다.
	   // 조건문, 소스 코드의 수정으로 해결이 안된다. -- 예측불가
	   // 주로 외부 매개체의 입출력시 발생 
	
	public void method1() { // method2() 한테 예외처리를 위임받아서 method1 도 예외처리가 필요해졌다. 
		
		try {
			method5();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("종료");
		}
		
	}
	
	public void method2() {
		byte[] aa = {'a' , 'b' , 'c'};
		
//		System.out.write(aa); // try catch 가 필수인 함수
		
		// throws : 지금 이 메소드에서 예외를 처리하지 않고 현재 이메소드를 호출한 곳으로 위임하겠다
		
		/*2. try~ catch()처리 : 이구문에서 바로 예외를 처리하겠다.
	       * 
	       * try :  예외가 발생할 가능성이있는 코드를 블록내에 작성 
	       * catch (발생될예외클래스 매개변수): try 구문에서 예외가 발생하면 어떻게 처리를 할것인지 작성 
	       * finally : try~catch 문 수행후 반드시 꼭 실행되어야 하는 코드를 작성
	       * 
	       * */
		
//		System.out.write(aa);
	}
	
	public void method3() {   // 제대로 실행을 잘 못했지만 그냥 넘어갈랍니다
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} finally {
			//실행시 FileNotFoundException (없는 파일을 읽어서 실행하려고 하니 )발생 시키고
	         //catch 에서 e.printStackTrace(); 출력이 되고 
	         //finally 블럭에서 레퍼런스 변수 (br) 에 초기값 null 이 그대로 들어가 있는 상태 이기때문에 
	         //null 을 참조하는 레퍼런스 변수에 close() 를 사용했기 때문에 NullPointerException 이 발생한다. 
				try {
					if(br != null) br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}  // finally 끝
		
	} // method3 끝
	
	
	public void method4() throws IOException { 
		// try ~ with ~ resource :  반납할 close자원 이 있는경우 처리 -> try () 괄호 안에 객체 생성할수 있고 
        //이 괄호안에서 생성한 객체는 close 해주지않아도 자동 close 된다. 
		try(BufferedReader br = new BufferedReader(new FileReader(""));){
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
	} // method4 끝
	
	
	public void method5() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아무거나 입력");
		
		String str = br.readLine();
		
		System.out.println(str);
		
		if(str.equals("a")) {
			throw new Exception("에러가 발생했어요");
		}
	}
}
