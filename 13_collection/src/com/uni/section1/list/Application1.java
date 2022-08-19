package com.uni.section1.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Application1 {

	public static void main(String[] args) {
		   
	      /* 컬렉션 프레임워크(Collection Framework) */
	      /* 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
	       * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
	       * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다. */
	      
	      /* Collection Framework는 크게 3가지 인터페이스중 한 가지를 상속받아 구현해 놓았다.
	       * 1. List 인터페이스
	       * 2. Set 인터페이스
	       * 3. Map 인터페이스
	       * 
	       * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
	       * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
	       * */
	      
	      /* 각 인터페이스 별 특징
	       * 1. List 인터페이스
	       *  - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
	       *  - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
	       * 2. Set 인터페이스
	       *  - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
	       *  - HashSet, TreeSet 등이 있다.
	       * 3. Map 인터페이스
	       *  - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
	       *  - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
	       *  - value는 중복된 값을 저장할 수 있다.
	       *  - HashMap, TreeMap, HashTable, Properties 등이 있다.
	       *  */
	      
	      /* List와 Set의 공통인 Collection 인터페이스 주요 메소드
	       * add(), clear(), contains(), equals(), isEmpty(), 
	       * iterator(), remove(), size(), toArray() 등이 있다.
	       *  */
		
		
		
		
		
		
		 /* ArrayList
	       * 가장 많이 사용되는 컬렉션 클래스 이다.
	       * JDK 1.2부터 제공된다.
	       * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
	       * 
	       * ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
	       * 배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
	       * ArrayList는 저러한 배열의 단점을 보완하고자 
	       * 크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
	       * 자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
	    
	       * */
		
		
		ArrayList alist = new ArrayList();
		List list = new ArrayList();
		
		Collection clist = new ArrayList();
		
		alist.add("abcd");
		alist.add(34.0);
		alist.add(new Date());
		
		System.out.println(alist);
		// System.out.println(alist.toString());
		
		System.out.println(alist.size());
		
		System.out.println("\nalist 내용 출력");
		for(int i = 0; i < alist.size(); i ++) {
			System.out.println(alist.get(i));
		}
		
		
		// 원하는 인덱스 위치에 값 추가 가능, 값을 추가하는 경우 덮어 쓰는것이 아니고 
	      //새로운값이 들어가는 인덱스 위치에 값을 넣고 인덱스가 하나씩 뒤로 밀림.
		alist.add("apple");
		System.out.println(alist);				
		
		alist.add(3,"banana"); // 인덱스 위치에 새로 삽입 가능 *덮어쓰기 아님
		System.out.println(alist);
		
		alist.remove(2); // 인덱스 위치의 값 삭제
		System.out.println(alist);
		
		alist.set(3, new Boolean(true)); // 인덱스 위치의 값 수정
		System.out.println(alist);
		
		List<String> stringList = new ArrayList<String>(); // 스트링 타입만 가능하다
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orage");
		stringList.add("mango");
		stringList.add("grape");
		//stringList.add(12345);
		
		System.out.println("stringList : " + stringList);
		
		
		/* Collection 인터페이스가 아닌 Collections 클래스이다.
	       * Collection에서 사용되는 기능들을 static 메소드들로 구현한 클래스이며
	       * 인터페이스명 뒤에 s가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스를 의미하게 된다.
	       * */
		Collections.sort(stringList);  // 장렬  
		
		// 오름차순
		System.out.println("stringList sort : " + stringList);
		
		stringList = new LinkedList<String>(stringList);
		
		
		
		
		
		
		
		
		/* Iterator란?
	       * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
	       * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
	       * 
	       *  ▼▼▼▼ 사용목적  사용목적  사용목적  사용목적  사용목적  사용목적  사용목적 ▼▼▼▼
	       * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
	       * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
	       * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
	       * 
	       * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false를 반환
	       * next() : 다음 요소를 반환
	       * */
		
		Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator(); // 거꾸로 정렬 ??
		
		
//		while(dIter.hasNext()) { // StringTokenizer 랑 비슷하다
//			System.out.println(dIter.next());
//		}
		
		// StringTokenizer 처럼 count 변수같은게 있어서 위의 while 문을 주석을 하고 실행해야 정상출력이 된다.
		List<String> descList = new ArrayList<String>();
		while(dIter.hasNext()) { 
			descList.add(dIter.next());
		}
		
		System.out.println(descList);
		
		
		
		
		
		
		
		
		
		
		
	}

}
