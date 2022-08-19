package com.uni.section4.assist.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.uni.section4.assist.dto.Phone;

public class Objects_Test {
	
	public void fileSave() {
		ArrayList<Phone> phoneList = new ArrayList<>(); // Phone 자료형만 들어갈 수 있는 ArrayList
		
		phoneList.add(new Phone("LG" , 100000));
		phoneList.add(new Phone("LG1" , 200000));
		phoneList.add(new Phone("LG2" , 300000));
		
		try {
			// phones.txt 라는 파일 내보낼 준비
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.txt"));
			
			for(int i = 0; i < phoneList.size(); i++) {
				// Object를 write 해  ( 0번 가져와 ) 
				oos.writeObject(phoneList.get(i));  // 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // fileSave 끝
	
	public void fileOpen() {
		ArrayList<Phone> phoneList = new ArrayList<>();
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"));
			
			int i = 0;
			while(true) {
				phoneList.add((Phone) ois.readObject()); // readObject의 반환형은 Object 라서 Phone 으로 다운 캐스팅
				System.out.println(phoneList.get(i));
				i++;
				
			}
		}catch (EOFException e) {
			System.out.println("읽기 끝");
			return;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
//		catch (EOFException e) {  // 여기다 쓰면 UnReachable(닿을수없다) IOException 보다 위에 쓰라고 오류가 나오네요(컴파일에러)
//			
//		} 
	}
	
	
	
}
