package com.uni.section2.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {
		/* Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
	       * 1. 요소의 저장 순서를 유지하지 않는다.
	       * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복하지 않게 하나의 null만 저장한다.)
	       * */

		HashSet<String> hset = new HashSet<String>();
		
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
		
		   hset.add(new String("java"));
		      hset.add(new String("oracle"));
		      hset.add(new String("jdbc"));
		      hset.add(new String("html"));
		      hset.add(new String("css"));

		      /* 저장 순서 유지 안됨 */
		      System.out.println("hset : " + hset);

		      /* 중복 허용 안함 */
		      hset.add(new String("java"));
		      
		      System.out.println("hset : " + hset);
		      System.out.println("저장된 객체수 : " + hset.size());
		      System.out.println("포함확인 : " + hset.contains(new String("oracle")));
		      
		      
		    Object[] arr = hset.toArray();
		    for(int i = 0; i < arr.length; i ++) {
		    	System.out.println(i + " : " + arr[i]);
		    }
		    
		    Iterator<String> iter = hset.iterator();
		    while(iter.hasNext()) {
		    	System.out.println();
		    }
		    
		    // 뭐 하나 더 있었음
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
