package com.my.soloPlay;

import java.util.Arrays;

public class StudyArray {

	public void arrayInt() {
		//int arr[] = new int[5];
		int arr1[];
		arr1 = new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = (i+1)*2;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println("\n배열의 길이 : "+arr1.length);
		
		int arr2[] = {10, 20, 30, 40};
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+"\t");
		}
		System.out.println("\n배열의 길이 : "+arr2.length);
		System.out.println("Arrays.toString()함수 사용하기"); //import java.util.Arrays; 를 해줘야 사용할 수 있음
		System.out.println("Array.toString(arr1) : " + Arrays.toString(arr1));
		System.out.println("Array.toString(arr2) : " + Arrays.toString(arr2));
	}
	public void arrayString() {
		String arr[] = new String[]{"가위", "바위", "보"};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<10;i++) {
			int temp = (int)(Math.random()*3);
			System.out.println(arr[temp]);
		}
	}
	public void arrayClass() {
		
	}
}
