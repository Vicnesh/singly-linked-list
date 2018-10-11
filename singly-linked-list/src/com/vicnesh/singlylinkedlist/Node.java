package com.vicnesh.singlylinkedlist;

public class Node {
	
	
	protected int element;
	protected Node nextNode;
	
	
	/*
	 * Default Constructor
	 * @parameter
	 * @return
	 */
	public Node() {
		this.element = 0;
		this.nextNode = null;
	}
	
	
	/*
	 * Parameterized Constructor
	 * @parameter
	 * @return
	 */
	public Node(Node node, int element) {
		this.nextNode = node;
		this.element = element;
	}
	
	/*
	 * Set nextNode to next node
	 * @parameter - 
	 * @return - 
	 */
	public void setnextNode(Node node) {
		this.nextNode = node;
	}
	
	
	/*
	 * Set element current node
	 * @parameter - 
	 * @return - 
	 */
	public void setElement(int element) {
		this.element = element;
	}
	
	
	/*
	 * Get nextNode to next node
	 * @parameter - 
	 * @return - 
	 */
	public Node getnextNode() {
		return this.nextNode;
	}
	
	
	/*
	 * Set element to next node
	 * @parameter - 
	 * @return - 
	 */
	public int getElement() {
		return this.element;
	}
	
}
