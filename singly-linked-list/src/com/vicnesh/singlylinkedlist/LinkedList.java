package com.vicnesh.singlylinkedlist;




public class LinkedList {
	
	protected Node head;
	protected Node tail;
	public int size;
	
	
	/*
	 * Constructor 
	 * @parameter
	 * @return
	 */
	public LinkedList() {
		this.head= null;
		this.tail = null;
		this.size = 0;
	}
	
	
	/*
	 * Get size of linked list
	 * @parameter
	 * @return - size of linked list
	 */
	public int getSize() {
		return this.size;
	}
	
	
	/*
	 * Check if linked list is empty
	 * @parameter
	 * @return - true if linked list is empty, false if not empty
	 */
	public boolean checkIfEmpty() {
		if (this.size == 0) {
			return true;
		}
		else {
			return false;
		}
		
		//return this.head == null;
	}
	
	
	/* 
	 * Increment linked list size
	 * @parameter
	 * @return
	 */
	public void incrementSize() {
		this.size++;
	}
	
	
	/* 
	 * Decrement linked list size
	 * @parameter
	 * @return
	 */
	public void decrementSize() {
		this.size--;
	}
	
	
	/*
	 * Insert element at start
	 * @parameter
	 * @return
	 */
	public void insertAtHead(int element) {
		
		Node newNode = new Node(null, element);

		//check is head is null
		if (this.head == null) {
			this.head = newNode;
			this.tail = this.head;
		}
		else {
			Node temp = this.head;
			this.head = newNode;
			this.head.nextNode = temp;
		}
		this.incrementSize();
		
	}
	
	
	/*
	 * Insert at tail
	 * Create new node, assign next node reference to null
	 * Store current tail into temp, 
	 * @parameter
	 * @return
	 */
	public void insertAtTail(int element) {
		//create new node, store reference to element
		Node newNode = new Node(null, element);
		
		//set new node next to reference the none object
		newNode.nextNode = null;
		 
		//make old tail node point to new node
		this.tail.nextNode = newNode;
		
		//set tail node to reference new node
		this.tail = newNode;
		
		this.incrementSize();
	}
	
	
	/*
	 * Delete head
	 * Check if head is not null, remove head 
	 * @parameter
	 * @return
	 */
	public void deleteHead() {
		if (this.getSize() == 0) {
			System.out.println("List is empty");
		}
		else {
			this.head = this.head.getnextNode();
			this.decrementSize();
		}

	}
	
	
	/*
	 * Delete tail
	 * @parameter
	 * @return
	 */
	public void deleteTail() {
		if (this.getSize() == 0) {
			System.out.println("List is empty");
		}
		else {
			Node currentNode = new Node();
			currentNode = this.head;
			for (int i = 0; i < size-2; i++) {
				currentNode = currentNode.getnextNode();
			}
			
			//Node nodeToRemove = this.tail;
			currentNode.setnextNode(null);
			this.tail = currentNode;
			this.decrementSize();
		}
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
