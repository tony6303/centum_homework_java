package com.uni.section1.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.uni.section1.list.comparator.AscendingPrice;
import com.uni.section1.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {
		
		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 140000));
		bookList.add(new BookDTO(2, "홍길동", "허균2", 20000));
		bookList.add(new BookDTO(3, "홍길", "허균3", 370000));
		bookList.add(new BookDTO(4, "홍", "허균4", 40000));
		bookList.add(new BookDTO(5, "전동길홍", "허균5", 50000));
		
		
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		bookList.sort(new AscendingPrice());
		
		System.out.println("==가격 오름차순==");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		// 익명 클래스 활용
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getPrice() >= o2.getPrice()? -1 : 1;
			}
			
		});
		
		System.out.println("==가격 내림차순==");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		
		
		   /* 문자열은 대소비교를 할 수 없다.
         * 문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느 것이 더 큰 값인지 확인해야 하는데
         * String클래스의 CompareTo() 메소드에서 이미 정의해 놓았다. */
        
        /* 앞에 값이 더 작은 경우(즉, 바꾸지 않아도 되는 경우) 음수 반환, 
         * 같으면 0 반환, 
         * 앞에 값이 더 큰 경우 양수 반환 (즉, 바꿔야 하는 경우)
         * */
		
		// 책 제목 오름차순
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		System.out.println("==책제목 오름차순==");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		

		// 책제목 내림차순
		// 화살표 함수? 람다표현식?
		// override 할게 하나 밖에 없을때 사용하는거 ??
		bookList.sort((BookDTO o1, BookDTO o2) -> o2.getTitle().compareTo(o1.getTitle()));

		// 같은 동작을 한다죠
//		bookList.sort(new Comparator<BookDTO>() {
//
//			@Override
//			public int compare(BookDTO o1, BookDTO o2) {
//				return o2.getTitle().compareTo(o1.getTitle());
//			}
//			
//		});
		
		System.out.println("==책제목 내림차순==");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
	}
	

}
