package com.my.dataStructure.binarySearch;
//import java.util.Arrays;

public class BinarySearch {
	public int search(int[] a, int length, int key) {
		int ans = -1;
		int start = 0;
		int finish = length-1;
		int center = (length-1)/2;
		int count = 0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("\n"+a.toString());
		
		
		while(start<finish) {
			if(a[center] == key) {
				ans = center;
				return ans;
			}
			if(a[center] < key) {
				start = center+1;
				center = (center+finish)/2;
			}
			else {
				finish = center-1;
				center = (start+center)/2;
			}
			System.out.println((count+1)+"번째 연산 / a[center] = "+a[center] + " / key = " + key);
			count++;
		}
		if(a[center] == key) {
			System.out.println(key + "는 배열의 "+center+"번째 항에 있고, " + count+"번 연산 했음");
		}
		else {
			System.out.println(key+"는 없다. "+count+"번 연산함.");
		}
		
		return -1;
	}

}
