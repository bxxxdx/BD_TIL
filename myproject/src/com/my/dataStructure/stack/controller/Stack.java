package com.my.dataStructure.stack.controller;

public class Stack {
	public Node node;

	public Stack() {
		this.node = null;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
	
	public void push(int data) {
		Node node;
		if(this.node == null) {
			this.node = new Node(data);
		}
		else if(this.node != null){
			node = this.node;
			while(node != null && node.next!=null) {
				node = node.next;
			}
			Node a = new Node(data);
			node.next = a;
		}
	}
	public int pop() {
		Node node = this.node;
		int data = -1;
		if(node != null){
			Node privious = node;
			while(node != null && node.next != null) {
				privious = node;
				node = node.next;
			}
			data = node.data;
			privious.next = null;
			
		}
		return data;
	}
	
	public int peek() {
		Node node = this.node.next;
		int data;
		
		while(this.node.next != null) {
			node = node.next;
		}
		data = node.data;
		return data;
	}
}
