package com.uni.section2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	//pdf 에 스트림 기가막힌 사진 있습니다 그거보면서 이해하세요
	
	
	//프로그램 >> 외부매체(파일) 내보내기
	public void fileSave() {
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a_byte.txt");
			
			fout.write(97);  // 아스키코드
			fout.write('b');
			// fout.write('김');  // char형 이라서 글자 깨짐
			
			
			// write(byte[] b, int off, int len) : off 인덱스 부터 len 개 만큼
			byte[] bArr = {99, 100, 101}; // c d e
//			fout.write(bArr, 0, 1);
			fout.write(bArr);  // 통째로 출력
			
			fout.write(bArr, 0, 3 );  // 인덱스 0 로부터 3개 출력
			
		} catch (FileNotFoundException e) {   // fileoutputstream catch
			
			e.printStackTrace();
		} catch (IOException e) {  // write  catch
			
			e.printStackTrace();
		}finally {
			
				try {
					//스트림 이용 후 반드시 닫아줘야한다
					if(fout != null) fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} // finally 끝
		
		
	} // fileSave 끝
	
	
	// 프로그램 << 파일     가져오기
	public void fileRead() {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			int value = 0;
			while((value = fis.read())!= -1) { // 한글자 한글자씩 읽다가 파일이 끝나면 -1을 출력하는 read 함수의 성질을 이용
				System.out.println(value);
				System.out.println((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//스트림 이용 후 반드시 닫아줘야한다
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

