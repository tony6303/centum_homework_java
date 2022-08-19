package com.uni.section3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	public void fileSave() {
		//FileWriter : 2byte 단위로 출력
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("재밌다~");
			fw.write('A');
			fw.write('\n');
			
			
			char[] cArr = {'a', 'p', 'p' , 'l' , 'e'};
			
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(fw != null) fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} 
		
	} // fileSave 끝 
	
	public void fileOpen() {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			
			while((value = fr.read()) != -1) {
				System.out.println((char) value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}















