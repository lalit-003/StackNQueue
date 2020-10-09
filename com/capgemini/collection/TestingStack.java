package com.capgemini.collection;

import org.junit.Assert;
import org.junit.Test;

public class TestingStack {
	MyStack<Integer> stack = new MyStack<>();

	// simply adding elements to stack
	@Test
	public void WhenAddedToStack_ShouldBeAddedAtTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		MyNode<Integer> topElement = stack.peak();
		Assert.assertEquals(thirdNode, topElement);
	}
}
//
//