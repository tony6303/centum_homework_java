package com.uni.section01.conditional;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 단독 if문 흐름 확인용 메소드 호출 */
		A_if a = new A_if();
//		a.testSimpleIfStatement();
//		a.testNestedIfStatement();
		
		/* 단독 if-else 문 흐름 확인용 메소드 호출 */
		B_ifElse b = new B_ifElse();
		//b.testSimpleIfElseStatement();
		//b.testNestedIfElseStatement();
		
		C_ifElseIf c = new C_ifElseIf();
//		c.testSipmleIfElseIfStatement();
//		c.testNestedIfElseIfStatement();
//		c.improveNestedIfElseIfStatement();
//		c.testSimpleSwitchStatement();
		c.testSwitchVendingMachine();
//		c.method1();	
	}

}














