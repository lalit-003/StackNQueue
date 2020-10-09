package com.capgemini.collection;

public class MyStack<K> {

	private final List_HeadNTail<K> linkedList ;

	public MyStack()
	{
		linkedList = new List_HeadNTail<>();
	}
	
	public void push(MyNode<K> element )
	{
		linkedList.add(element);
	}
	
	public MyNode<K> peak()
	{
		return linkedList.head;
	}
	
	public MyNode<K> pop()
	{
		return linkedList.pop();
	}

}
