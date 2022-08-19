package com.uni.section2.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

	/* LinkedHashSet 클래스 */
    /* HashSet이 가지는 기능을 모두 가지고 있고
     * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
     * JDK 1.4 부터 제공하고 있다. */
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		    lhset.add("java");
		    lhset.add("oracle");
		    lhset.add("jdbc");
		    lhset.add("html");
		     lhset.add("css");

		    System.out.println("lhset : " + lhset);
		    
		    // treeset 놓쳤구요
//		    TreeSet<String>
	}

}
