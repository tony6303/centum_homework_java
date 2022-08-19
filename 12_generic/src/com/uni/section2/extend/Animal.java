package com.uni.section2.extend;

public class Animal {
	/***
	    *                animal
	    *                         
	    *             MAMMAL       REPTILE<------  애니멀을 실체화 ,한 구현체 
	    *                               
	    *           RABBIT          SNAKE <--- 일반화 / 특수화   , 확장의 의미   REPTILE을 구체화한것 특수화 , 
	    * 
	    * 
	    *          BUNNY
	    * 
	    * 
	    *       DRUNKENBUNNY
	    * 
	    * 
	    * 
	    * 
	    * */
	
	public void cry() {
		System.out.println("동물의 울음소리");
	};
}
