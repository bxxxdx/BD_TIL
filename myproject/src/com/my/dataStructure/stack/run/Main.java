package com.my.dataStructure.stack.run;

import com.my.dataStructure.stack.controller.Stack;
import com.my.dataStructure.stack.controller.Stack2;

public class Main {

	public static void main(String[] args) {
//		//BinarySearch
////		BinarySearch bSearch = new BinarySearch();
////		int arr[] = new int[100];
////		for(int i=0;i<arr.length;i++) {
////			arr[i] = i+1;
////		}
////		bSearch.search(arr, arr.length, 101);
//		
//		//Recursion
//		Recursion recur = new Recursion();
////		System.out.println("5! = " + recur.factorial(5));
////		System.out.println("0부터 10까지의 합은 : " + recur.sum(10));
//		
//		//유클리드의 호제법(최대공약수 구하기)
//		System.out.println(recur.gcd(22, 8));
		//연결리스트로 구현해봄
//		Stack stack = new Stack();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		
		Stack2 stack2 = new Stack2(10);
		System.out.println(stack2.push(10));
		System.out.println(stack2.push(20));
		System.out.println(stack2.push(30));
		System.out.println(stack2.push(40));
		
		
		System.out.println(stack2.peek());
		
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.peek());
		
		
		

	}

}
