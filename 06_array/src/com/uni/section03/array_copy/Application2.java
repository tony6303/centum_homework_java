package com.uni.section03.array_copy;

public class Application2 {

	public static void main(String[] args) {
		/* 얕은 복사의 활용 */
	      /* 얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
	       * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
	       * */
		
		String[] names = {"홍길동", "유관순", "이순신"};
	      
	    /* 얕은복사 확인을 위한 hashcode 출력 */
		System.out.println("names의 hashcode : " + names.hashCode());
		
		print(names);
		
		String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
		
		System.out.println("animals의 hashcode : " + animals.hashCode());
		
		print(animals);
		

	} // main end
	
	/**<pre>
	    * 배열을 매개변수로 전달받아
	    * 모든 인덱스에 저장되어 있는 값을 출력하는 기능을 제공
	    * </pre>
	    * @param sarr 저장된 값을 출력하기 위한 문자열 배열
	    */
	   public static void print(String[] sarr) {
	      
	      /* 전달받은 배열의 hashcode 출력 */
	      System.out.println("sarr의 hashcode : " + sarr.hashCode());
	      
	      /* 전달받은 배열의 값 출력 */
	      for(int i = 0; i < sarr.length; i++) {
	         System.out.print(sarr[i] + " ");
	      }
	      System.out.println();
	      
	   }  // print end
	   
	   
	   /**<pre>
	    * 동물 종류로 생성된 문자열 배열을 반환하는 메소드
	    * </pre>
	    * @return 동물 종류가 담긴 문자열 배열을 반환한다.
	    */
	   public static String[] getAnimals() {
	      
	      String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
	      
	      /* 얕은복사 확인을 위해 hashcode 출력 */
	      System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());
	      
	      return animals;
	      
	   } // getAnimals end

}
