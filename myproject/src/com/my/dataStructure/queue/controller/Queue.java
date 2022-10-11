package com.my.dataStructure.queue.controller;

public class Queue {
	int[] arr;
	int length;
	int max;
	int front;
	int rear;

	// 실행시 예외 : 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public Queue(int capacity) {
		super();
		try {
			this.arr = new int[capacity];
			this.length = this.front = this.rear = 0;
			this.max = capacity;
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int enque(int input) throws OverflowIntQueueException {
		if (length >= max) {
			throw new OverflowIntQueueException();
		} 
		
		arr[rear++] = input;
		length++;

		if (rear == max) {
			rear = 0;
		}
		
		return input;
	}

	public int deque() throws EmptyIntQueueException{
		if(length <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int x = arr[front++];
		length--;
		
		if(front == max) {
			front = 0;
		}
		
		return x;
	}

	public int peek() throws EmptyIntQueueException{
		if(length <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = arr[front];
		
		return x;
	}
	
	public int indexOf(int input) {
		for(int i=0;i<length;i++) {
			int idx = (front + length) % max;
			if(arr[idx] == input) {
				return idx;
			}
		}
		return -1;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}
	
	public void print() {
		System.out.println("front : " + front + " / rear : " + rear + " / length : " + length + " / peek : " + peek());
	}
}
