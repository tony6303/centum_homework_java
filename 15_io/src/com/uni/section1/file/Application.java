package com.uni.section1.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		
		try {
			// 1. 경로를 지정하지 않으면 현재 프로젝트에 생성
			File f1 = new File("test.txt");  // f1 객체 생성
			f1.createNewFile();  // 단독으로 사용 못해서 try catch 생성
			
			File f2 = new File("D:\\test2\\test2.txt");  // f2 객체 생성
			f2.createNewFile();  // 단독으로 사용 못해서 try catch 생성
			
			File f3 = new File("D:\\test3");  // 확장자가 없으면 폴더를 생성함
			f3.mkdir();
			
			File f4 = new File("D:\\test3\\test3.txt");  //  f3으로 경로를 꼭 만들어줘야한다 안하면 경로 못찾아서 에러 
			f4.createNewFile();
			
			// 존재여부 확인
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			
			System.out.println("=============");
			System.out.println(f2.isFile());  // 파일
			System.out.println(f3.isFile());  // 폴더
			
			File exam = new File("testFolder");
			exam.mkdir();
			File exam2 = new File("testFolder\\test.txt");
			exam2.createNewFile();
			
			
			
			System.out.println("파일명 : "+ exam2.getName());
	         System.out.println("절대경로 : "+ exam2.getAbsolutePath()); // 최상위 경로부터 내파일이 있는경로 까지 모두 나타 낸것
	         System.out.println("상대경로 : "+ exam2.getPath());// 파일이 위치한 폴더를 기준으로 상대적인 경로
	         System.out.println("파일 용량 : "+ exam2.length() );
	         System.out.println("상위 폴더 : "+ exam2.getParent());// parent
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // main 끝

}
