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
		
		linkedList.insertAtpos(pos+1, 40);
		linkedList.print();
		
		System.out.println("\nafter deleteting \n");
		linkedList.deleteAtValue(40);
		linkedList.print();
		
		int size = linkedList.size();
		System.out.println("\nsize after deleting is : " + size);
		
	}
}
