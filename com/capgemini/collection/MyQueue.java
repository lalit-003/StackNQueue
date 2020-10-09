package com.capgemini.collection;

public class MyQueue<K> {

	private final List_HeadNTail<K> linkedListQueue ;

	public MyQueue()
	{
		linkedListQueue = new List_HeadNTail<>();
	}
	
	public void push(MyNode<K> element )
	{
		linkedListQueue.append(element);
	}
	
	public MyNode<K> peak()
	{
		return linkedListQueue.head;
	}
	
	public MyNode<K> pop()
	{
		return linkedListQueue.pop();
	}

}
