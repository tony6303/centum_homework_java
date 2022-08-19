package com.uni.section3.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
	/* Map 인터페이스의 특징
     * 
     * Collection 인터페이스와는 다른 저장 방식을 가진다.
     * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
     * 
     * 키(key)란?
     * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
     * 
     * 1. 요소의 저장 순서를 유지하지 않는다.
     * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
     * 
     * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
     * HashMap이 가장 많이 사용되며 HashTable은 JDK 1.0부터 제공되며
     * HahaMap과 동일하게 동작한다. 하위 호환을 위해 남겨놓았기 때문에 가급적이면 HashMap을 사용하는 것이 좋다.
     * */
	public static void main(String[] args) {
		HashMap hmap = new HashMap();
		
//		Map hmap2 = new HashMap();
		
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		
		System.out.println(hmap);
		
		hmap.put(12,  "yellow banana");
		hmap.put(9, "yellow banana");
		
		System.out.println(hmap);
		
		System.out.println(hmap.get(9));
		
		
		
		
		
		/* 키 값을 가지고 삭제를 처리할 때 */
	      hmap.remove(9);
	      System.out.println("hmap : " + hmap);

	      /* 저장된 객체 수를 확인할 때 */
	      System.out.println("hmap에 저장된 객체 수 : " + hmap.size());
	      
	      HashMap<String, String> hmap2 = new HashMap<>();

	      hmap2.put("one", "java 8");
	      hmap2.put("two", "oracle 11g");
	      hmap2.put("three", "jdbc");
	      hmap2.put("four", "html5");
	      hmap2.put("five", "css3");
		
	      
	      
		Iterator<String> keyIter = hmap2.keySet().iterator();   // keyset : key 만 볼수 있게		
		System.out.println("keyset() : " +hmap2.keySet());
		
		while(keyIter.hasNext()	) {
			String key = keyIter.next();
			String value = hmap2.get(key);
			
			System.out.println(key + " " + value);
		}
		
		
		
		Collection<String> values = hmap2.values();
		
		Iterator<String> valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		Set<Map.Entry<String, String>> set = hmap2.entrySet();
		
		Iterator<Map.Entry<String, String>> entryIter = set.iterator();
		while(entryIter.hasNext()) {
			// 못썼음
//			Map.Entry<String, String> entry = 
//			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
