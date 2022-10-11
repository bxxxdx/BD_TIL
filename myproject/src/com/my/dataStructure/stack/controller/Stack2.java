package com.my.dataStructure.stack.controller;

public class Stack2 {
	//배열 이용
	int[] arr;
	int index;
	int max;
	
	public Stack2() {
		// TODO Auto-generated constructor stub
	}

	public Stack2(int max) {
		super();
		this.arr = new int[max];
		this.index = 0;
		this.max = max;
		try {
			this.max = max;
		}catch (OutOfMemoryError e) {
			this.max = 0;
		}
	}
	
	public int push(int data) {

		return arr[++index] = data;
	}
	
	public int pop() {
		return arr[--index];
	}
	
	public int peek() {
		return arr[index];
	}
	
	public boolean isEmpty(){
		if(index > -1) {
			return true;
		}
		else {
			return false;
		}		
	}
	

}
