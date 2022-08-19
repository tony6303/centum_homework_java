package com.uni.section2;

import java.io.FileOutputStream;

public class Application {

	public static void main(String[] args) {
		 // "바이트 스트림" : 데이터를 1바이트 단위로 전송하는 통로다! (좁은 통로임.. 1바이트면 한글은 깨짐..)
	      // "기반 스트림" : 외부매체랑 직접적으로 연결되는 통로다!
	      
	      // "바이트 기반 스트림"   --> 외부매체를 지정하고 그 외부매체와 직접적으로 연결된 통로에 데이터를 1바이트 단위로 전송하겠다!! (입력 및 출력)
	      
	      // XXXInputStream   : XXX매체로부터 데이터를 입력받는 통로 (외부매체로 부터  데이터 읽어오겠다. 가져오겠다.)
	      // XXXOutputStream   : XXX매체로 데이터를 출력하는 통로 (외부매체에 데이터 쓰겠다. 빼내겠다.)
		
		FileByteTest fb = new FileByteTest();
		fb.fileSave();
		fb.fileRead();
		

	}

}
