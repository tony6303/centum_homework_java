package com.uni.section04.incre_decre_operator;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      /* 증감연산자 */
	      /* 피연산자의 앞 or 뒤에 사용이 가능하다. */
	      /* '++' : 1 증가의 의미
	       * '--' : 1 감소의 의미
	       * */
		
		   int num = 20;
	      System.out.println("num : " + num);
	      
	      num++;      //1 증가
	      System.out.println("num : " + num);
	      
	      ++num;      //1 증가
	      System.out.println("num : " + num);
	      
	      num--;      //1 감소
	      System.out.println("num : " + num);
	      
	      --num;      //1 감소
	      System.out.println("num : " + num);
	      
	      /* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
	      
	      /* 하지만! 문제는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다. */
	      /* 다른 연산자와 함께 사용할 때 증감 연산자의 의미
	       * '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
	       * 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
	       * '--var' : 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행함
	       * 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
	       * (증감연산자)값 : 전위 연산자 --> 선증감 후처리
	       * 값(증감연산자) : 후위 연산자 --> 선처리 후증감
	       * */
	   
	      
			/*
			 * int a = 10; int b = 20; int c = 30;
			 * 
			 * System.out.println(a++); // a = 10(11) System.out.println((a++) + (++b)); //
			 * a = 12 , b = 20 (21) System.out.println((a++) + (--b) + (--c)); // a = 12(13)
			 * b = 20 c = 29
			 */	      
	      
	      int a = 5;
	      int b = 10;
	                                              // a = 6   b = 9
	      int c = (++a) + b;   // a = 6 b = 10         c =16
	      int d = c / a;   //  16 / 6  =   		d =2  >> d = 1
	      int e = c % a;  // 16  %  6   =   e =4    >>   e=5 
	      int f = e++;    //   4   (5)       			 f = 4
	      int g = (--b) + (d--);   // 9   + 2 (1)       g = 11   
	      int h = 2;   //    2
	      
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
	      System.out.println(d);
	      System.out.println(e);
	      System.out.println(f);
	      System.out.println(g);
	      
	      
	      int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
	      //     6(7)  +  9 /    (15/4)  *  (11(10) - 1) % (6 + 2 )
	      //                           6 + 9 /  3  *  10 % 8
	      //                6 + 30% 8 
	      //               6+ 3   = 9      <<< 나머지계산인데 몫을 구했음 ㅠㅠㅠ 
	      //      답  6 + 6 = 12
	      
	      System.out.println(i);
	}

}
