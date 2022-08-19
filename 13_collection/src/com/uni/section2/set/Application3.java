package com.uni.section2.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
	public static void main(String[] args) {
		/* TreeSet 클래스 */
	      /* TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
	       * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
	       * JDK 1.2부터 제공되고 있으며 
	       * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다. 
	       * */
	      
	      /* 자동 오름차순 정렬하여 이진 트리 형태로 요소를 저장하고 있음 */
		
		TreeSet<String> tset = new TreeSet<>();
		
		 tset.add("java");
	      tset.add("oracle");
	      tset.add("jdbc");
	      tset.add("html");
	      tset.add("css");

	      /* 자동 오름차순 정렬됨 */
	      System.out.println(tset);
	      
	      Iterator<String> iter = tset.iterator();
	      
	      while(iter.hasNext()) {
	    	  System.out.println((String)iter.next().toUpperCase());
	      }
	      
	      
	      Set<Integer> lotto = new TreeSet<>();
	      
	      // 로또 농쳤구요
	      while(lotto.size() < 6) {
	    	  lotto.add((int)(Math.random()*45)+1);
	      }
	    	  
	}
}
