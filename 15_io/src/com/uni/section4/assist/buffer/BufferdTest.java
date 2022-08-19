package com.uni.section4.assist.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdTest { // 입출력 스트림의 성능을 향상시켜주는 보조 스트림

	public void fileSave() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();  // 줄바꿈 해주는 함수인듯
			bw.write("감사합니다");
			
		} catch (IOException e) {             
			e.printStackTrace();
		}
		finally { // 버퍼 안닫으면 계속 열려있어서 함수종료가 안댐!!
			try {
				if(bw != null)bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileSave 끝 

	
	public void fileOpen() {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c_buffer.txt"));
			
			String temp = null;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileOpen 끝
}
  