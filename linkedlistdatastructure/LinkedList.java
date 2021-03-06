package com.linkedlistdatastructure;


public class LinkedList {

	private Node head;
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public boolean add(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			isAdded = true;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		
		return isAdded;
	}
	
	public void print() {
		Node temp = head;
		System.out.print("LinkedList : ");
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	} 
	
	public void insertAtpos(int pos, int data) {
		if(pos< 1) {
			System.out.println("Invalid pos");
			return;
		}
		else if(pos == 1) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		else {
		    int count = 2;
			Node newNode = new Node(data);
			Node temp = head;
			while (temp.next != null) {
				if(pos == count) {
					break;
				}
				temp = temp.next;
				count++;
			}
			Node nextNode = temp.next;
			temp.next = newNode;
			newNode.next = nextNode;
		}
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("linked list is already null");
		}
		else {
		  head = head.next;
		}
	}
	
	public void popLast() {
		if(head == null) {
			System.out.println("Linkedlist is already null");
		}
		else {
			Node curNode = head;
			Node temp = head;
			while(temp.next != null) {
				curNode = temp;
				temp = temp.next;
			}
			curNode.next = null;
		}
	}
	
	public int search(int data) {
		int pos = 0;
		int found = 0;
		Node temp = head;
		
		while(temp != null) {
			pos++;
			if(temp.data == data) {
				found = 1;
				break;
			}
			temp = temp.next;
		}
		if(found == 0) {
			return 0;
		}
		return pos;
	}
	
	public void deleteAtValue(int value) {
		if(head.next != null ) {
			if(head.data == value) {
				head = head.next;
				return;
			}
		}
		if(head == null) {
			return;
		}
		else {
			Node temp = head;
			Node prev = head;
			while(temp != null) {
				if(temp.data == value) {
					prev.next = temp.next;
					return;
				}
				prev = temp;
				temp = temp.next;
			}
		}
		System.out.println("value not found to delete");
	}
	
	public int size() {
		int size =0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
}
