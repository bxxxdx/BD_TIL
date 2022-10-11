package com.my.dataStructure.recursion;

public class Recursion {
	public int factorial(int input) {
		if(input>0) {
			return input * factorial(input-1);
		}
		else {
			return 1;
		}
	}
	public int sum(int input) {
		if(input > 0) {
			return input + sum(input-1);
		}
		else {
			return 0;
		}
	}
	//유클리드의 호제법 : 두 정수의 최대공약수를 재귀적으로 구하는 방법
	public int gcd(int x, int y) {
		if(y==0) {
			return x;
		}
		else{
			return gcd(y, x%y);
		}		
	}
	
	
	
	
	
	
}
