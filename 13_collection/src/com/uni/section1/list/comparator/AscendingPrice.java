package com.uni.section1.list.comparator;

import java.util.Comparator;

import com.uni.section1.list.dto.BookDTO;

public class AscendingPrice implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		// 바꿔야 하는 상황 >> 양수
		// 유지해야 하는 상황 >> 음수
		// 두 값이 같은 경우 >> 0
		int result = 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			result = 1;
		}else if(o1.getPrice() < o2.getPrice()) {
			result = -1;
		}else {
			result = 0;
		}
		
		return result;
	}

	
}
