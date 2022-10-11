package com.my.soloPlay;

public class StudyString {
	//String 클래스는 char[]와 메서드(기능)을 결합한 것
	//String 클래스는 내용을 변경할 수 없다(read only)
	//주요 메서드
	//char charAt(int index) 알지?
	//int length() : 문자열의 길이 반환
	//str.substring(1,4) : 1부터 4까지의 문자열을 반환
	//str.Equals(str2) : 문자열의 내용이 같은지
	//str.
	public void studyString() {
		String str = "ABCDEFG";
		char ch = str.charAt(6);
		System.out.println(ch);
		System.out.println(str.substring(1,6));
		System.out.println(str.length());
		
	
	
	}
}
