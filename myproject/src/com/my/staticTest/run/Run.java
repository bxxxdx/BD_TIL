package com.my.staticTest.run;

import com.my.staticTest.controller.StaticTest;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticTest.staticNum);
		StaticTest st1 = new StaticTest();
		System.out.println(StaticTest.staticNum);
		StaticTest st2 = new StaticTest();
		System.out.println(StaticTest.staticNum);
	}

}
