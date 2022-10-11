package com.my.jungsukOfJava.run;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.my.jungsukOfJava.controller.Point3D;

public class Main {

	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		
		String s1 = "하하하";
		String s2 = "하하하";
		System.out.println(s1==s2);
		s1 = new String("하하하");
		System.out.println(s1==s2);
		
		String animals = "dogs,cat,bear";
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		System.out.println(list.toString());
		
		//Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
	
		System.out.println(thisYear);
		
		ArrayList list1 = new ArrayList(10);
		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(70);
		list1.add(5);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
//		int[] arr = new int[10];
//		System.out.println(System.identityHashCode(arr));
//		System.out.println(System.identityHashCode(arr[0]));
//		System.out.println(System.identityHashCode(arr[1]));
//		System.out.println(System.identityHashCode(arr[2]));
		
		ArrayList arr = new ArrayList();
		System.out.println(arr);
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		System.out.println(arr);
		for(int i=arr.size()-1;i>=0;i--) {
			arr.remove(i);
		}
		System.out.println(arr);
		
		System.out.println("===== 9월21일수요일 =====");
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		
		System.out.println("===stack===");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("===queue===");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		HashSet l = new HashSet();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		
	}
	
}
