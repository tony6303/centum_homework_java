package com.uni.section3.run;

import com.uni.section3.thread.InterruptSample;

public class Application {
	public static void main(String[] args) {
		InterruptSample its = new InterruptSample();
		its.sleepInterrupt();
	}
}
