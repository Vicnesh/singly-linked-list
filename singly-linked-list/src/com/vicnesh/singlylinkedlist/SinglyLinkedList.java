package com.vicnesh.singlylinkedlist;


/*
 * Singly Linked List
 * Collection of nodes that form a linear sequence
 * 
 * Each node stores 2 references:
 * 1) An object that is the element of the sequence
 * 2) To the next node of the list
 *
 * First and last node in the sequence is called a head and tail respectively
 * Traversal (Link hopping/Pointer hopping) of a linked list is done linearly starting from the head node,
 * then following the reference pointing to the next node up to the tail node.
 * The Tail node will not reference a next node (null/none)
 * 
 * Each node is a unique object instantiated storing a reference to its element
 * and a reference to the next node or none
 * 
 * Linked lists does not have a predetermined fixed size, the space is proportional to the its current element
 *  
 */


public class SinglyLinkedList {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		System.out.println(linkedList.checkIfEmpty());
		
		System.out.println(linkedList.getSize());
		
		linkedList.insertAtHead(5);
		linkedList.insertAtTail(10);
		System.out.println(linkedList.head.getnextNode().getElement());
		linkedList.insertAtTail(20);
		System.out.println(linkedList.head.getnextNode().getnextNode().getElement());
		
		System.out.println(linkedList.getSize());
		
		
	}

}
