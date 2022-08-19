package com.uni.section1.object.run;

import com.uni.section1.object.book.Book;

public class Application {

	public static void main(String[] args) {
		Book book1 = new Book(1, "연어의온도", "이기주", 50000);
		Book book2 = new Book(2, "개미", "레베르", 20000);
		Book book3 = new Book(3, "연어", "이주", 30000);
		
		// toString() 오버라이딩 전 : 인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해쉬코드가 문자열 반환
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		
		System.out.println(book1.information());
		System.out.println(book2);   // toString 이 생략되있나봄 
		System.out.println(book3);
	}

}
