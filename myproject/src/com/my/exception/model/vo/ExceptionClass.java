package com.my.exception.model.vo;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionClass {
	private int[] arr = new int[3];
	private static int index = 0;
	
	public void sum() throws Exception{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("수 입력 : " );
			int input = sc.nextInt();
			try {
				arr[index++] = input;
				System.out.println("저장한 수 : " + arr[index-1] + " index : " + index);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("오버오버플로~~");

				throw new Exception("예외예외~~");
			}			
		}while(true);
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
}
