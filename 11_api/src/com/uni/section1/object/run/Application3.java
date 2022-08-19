package com.uni.section1.object.run;

import com.uni.section1.object.book.Book;

public class Application3 {

	public static void main(String[] args) {
		
		   /* Object 클래스의 명세에 작성된 일반 규약에 따르면
	       * equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어 있다.
	       * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
	       * 같은 해시코드값을 가져야 한다는 규약에 위반되게 된다. (강제성은 없지만 규약대로 작성하는 것이 좋음)
	       * */
		
		
		Book book1 = new Book(2, "개미", "레베르", 20000);
		Book book2 = new Book(2, "개미", "레베르", 20000);
		
		
		
		// 동일한 해쉬코드가 되었다
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());

	}

}
