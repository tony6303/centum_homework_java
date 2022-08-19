package com.uni.section3.stringbuilder;

public class Application2 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		
	      /* capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드 (문자열 길이 + 16이 기본 용량)*/
		System.out.println(sb1.capacity());  // capacity : 수용량, 용량
		for(int i = 0; i < 50; i++) {
	         sb1.append(i);
	         
	         System.out.println("sb1 : " + sb1);
	         System.out.println("capacity : " + sb1.capacity());      // (기존 문자열 + 1) * 2씩증가함 16 (16+1 *2 는) 34 , (34+1 *2) 70
	         System.out.println("hashcode : " + sb1.hashCode());      //동일 인스턴스임
	      }
		
		StringBuilder sb2 = new StringBuilder("javaoracle");
		
	      /* delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부문의 문자열을 제거한다.
	       * deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
	       * 둘 다 원본에 영향을 미친다.
	       *  */
		
		System.out.println(sb2.delete(2, 5));
		System.out.println(sb2.deleteCharAt(0));
		
		
		
		/* insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다. 
	       * 원본에 영향을 미친다.
	       * */
		
		System.out.println(sb2.insert(1, "vao"));
		System.out.println(sb2.insert(0, "j"));
		
		
		/* reverse() :  문자열 인덱스 순번을 역순으로 재배열한다. 
	       * 원본에 영향을 미친다.
	       * */
		
		System.out.println(sb2.reverse());
		
		
	}

}
