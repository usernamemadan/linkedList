package com.linkedlistdatastructure;


public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(70);
		linkedList.addFirst(30);
		linkedList.addFirst(56);
		linkedList.print();
		
		int pos = linkedList.search(30);
		if(pos != 0)
		{
			System.out.println("\n 30 found at Position : "+pos);
		}
		else {
			System.out.println(" not found");
		}
		
		linkedList.insertAtpos(pos+1, 40);
		linkedList.print();
		
		System.out.println("\n after deleteting \n");
		linkedList.deleteAtValue(40);
		linkedList.print();
		
		int size = linkedList.size();
		System.out.println("\n size after deleting is : " + size);
		
		SortedLinkedList list = new SortedLinkedList();
		list.add(56);
		list.add(30);
		list.add(40);
		list.add(70);
		System.out.println("after adding elements to sorted linked list");
		list.print();
		
	}
}
