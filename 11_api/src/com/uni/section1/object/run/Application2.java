package com.uni.section1.object.run;

import com.uni.section1.object.book.Book;

public class Application2 {

	public static void main(String[] args) {
		/* equals() 메소드 오버라이딩
	       * equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다.
	       * 즉 동일한 인스턴스인지를 비교하는 기능을 한다.
	       * 
	       * 동일객체와 동등객체
	       * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
	       * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
	       * 
	       * equals() 메소드의 기본 기능은 동일객체 판단을 한다고 볼 수 있다. (동일성 확인)
	       * 
	       * 하지만 경우에 따라서는 동등객체를 동일 객체로 취급해서 비교하고 싶은 경우가 발생한다.
	       * 즉, 동일한 필드값을 가지는 객체를 같은 객체로 판단할 수 있도록 하는 경우를 말한다.
	       * 그러한 경우 equals() 메소드를 오버라이딩하여, 각각의 필드가 동일한 값을 가지는지를 확인하고
	       * 모든 필드값이 같은 값을 가지는 경우 true, 아닌 경우 false를 반환하도록 작성한다.
	       * */
		Book book1 = new Book(2, "개미", "레베르", 20000);
		Book book2 = new Book(2, "개미", "레베르", 20000);
		
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));  // Book 클래스에서 equals 함수 오버라이딩
		
		// 서로 다른 인스턴스이다    Book 클래스에서 hashcode 오버라이딩 주석해야함
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
		
		

	}

}
