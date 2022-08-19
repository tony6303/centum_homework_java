package com.uni.section4.assist.run;

import com.uni.section4.assist.buffer.BufferdTest;
import com.uni.section4.assist.data.DataTest;
import com.uni.section4.assist.object.ObjectTest;
import com.uni.section4.assist.object.Objects_Test;

public class Application {
	
	public static void main(String[] args) {
		
		BufferdTest bt = new BufferdTest();
//		bt.fileSave();
//		bt.fileOpen();
	
		ObjectTest ot = new ObjectTest();
		ot.fileSave();
		ot.fileOpen();
		
		Objects_Test objTest = new Objects_Test();
		objTest.fileSave();
		objTest.fileOpen();
		
		DataTest dt = new DataTest();
//		dt.fileSaveOpen();
	}
	
	
	
}
