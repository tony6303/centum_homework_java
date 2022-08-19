package com.uni.section4.assist.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTest {
	// Data 관련 보조스트림은 
	   // 데이터를 읽고 쓰는데 있어서 byte단위가 아닌 기본자료형의 크기로 읽고 쓸수 있다.
	   // 단, 각 기본 자료형의 크기가 다르기 때문에 출력한 데이터 순서와 똑같은 순서로 읽어와야된다.
	   
	   public void fileSaveOpen() {
	      
	      
	      try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
	         DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))){
	         
	         // 먼저 파일로 출력 하고
	         dos.writeUTF("박효신");
	         dos.writeInt(94);
	         dos.writeChar('A');
	         dos.writeBoolean(true);
	         dos.writeDouble(15.21);
	         
	         while(true) {
	            System.out.println(dis.readUTF() + ", " 
	                        + dis.readInt() + ", " 
	                        + dis.readChar() + ", "
	                        + dis.readBoolean() + ", "
	                        + dis.readDouble());
	         }
	         
	         
	         
	      } catch (FileNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (EOFException e) {
	         // 파일에 더이상 읽을 내용이 없을 때 발생하는 Exception이다
	         // 발생 할 수 밖에 없는 Exception이기 때문에 다음 처리 로직을 작성해 준다.
	         System.out.println("파일 읽기 완료");
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      
	   }
}
