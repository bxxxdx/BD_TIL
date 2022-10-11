package com.my.swExpertArcademy;
import java.util.Scanner;
public class Practice_2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String msg = "";
		for(int i=0;i<testCase;i++) {
			int sum=0;
			int arr[] = new int[10];
			for(int j=0;j<10;j++) {
				arr[j] = sc.nextInt();
			}
			for(int j=0;j<10;j++) {
				if(arr[j]%2!=0) {
					sum+=arr[j];
				}
			}
			msg += "#"+(i+1)+" "+sum+"\n";
		}
		System.out.println(msg);
	}
}


