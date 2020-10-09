package com.capgemini.collection;


public class List_HeadNTail<K> {

	public MyNode<K> head;
	public MyNode<K> tail;

	public List_HeadNTail() {
		this.head = null;
		this.tail = null;
	}

	public void add(MyNode<K> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			MyNode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}
	public void append(MyNode<K> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}

	}
	
	
	// inserting between node1 and node next to node1 
	public void insertAfter(MyNode<K> node1,MyNode<K> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = node1;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			MyNode<K> tempNode = node1.getNext() ;
			node1.setNext(newNode);
			newNode.setNext(tempNode);


		}
	}
	//
	//delete first element/node and deleted element
	public MyNode<K>  pop() {
		// TODO Auto-generated method stub

		MyNode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;

		}
	

public MyNode<K>  lastPop() {
	// TODO Auto-generated method stub

	
	MyNode<K> tempNode = (MyNode<K>) this.head;
	while(!tempNode.getNext().equals(tail))
	{
		tempNode = tempNode.getNext();
	}
	this.tail = tempNode;
	tempNode = tempNode.getNext();
	return tempNode;

	}

public boolean  search(MyNode<K> searchElement) {
	// TODO Auto-generated method stub

	

	boolean flag =false;
	int position =0;
	
	MyNode<K> tempNode = this.head;
	while(true)
	{
		
		position++;
		if(tempNode.equals(searchElement))
		{
			flag = true;
			System.out.println("element found at position : "+position);
			break;
			
		}
		tempNode = tempNode.getNext();

	}
		return flag;

	}

}




	
	





