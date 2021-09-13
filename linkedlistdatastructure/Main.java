package com.linkedlistdatastructure;


public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(70);
		linkedList.addFirst(30);
		linkedList.addFirst(56);
		
		int pos = linkedList.search(30);
		if(pos != 0)
		{
			System.out.println("found at Position : "+pos);
		}
		else {
			System.out.println("not found");
		}
		
		linkedList.print();
		
	}
}
