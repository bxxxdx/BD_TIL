package com.my.exception.controller;

import com.my.exception.model.vo.ExceptionClass;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExceptionClass ec = new ExceptionClass();
		try {
			ec.sum();
			System.out.println("트라이!!");
		} catch (Exception e) {
			System.out.println("익셉션 캐취!!");
		}

		ec.print();
	}

}
