package com.my.dataStructure.queue.run;

import com.my.dataStructure.queue.controller.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(10);
		q.enque(10);
		q.print();
		q.enque(20);
		q.print();
		q.enque(30);
		q.print();
		q.enque(40);
		q.print();
		q.deque(); // 10 out
		q.print();
		q.deque(); // 20 out
		q.print();
		q.deque(); // 30 out
		q.print();
		q.deque(); // 40 out 
		System.out.println(q.getLength());
	}

}
