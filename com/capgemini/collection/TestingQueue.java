package com.capgemini.collection;

import org.junit.Assert;
import org.junit.Test;

public class TestingQueue {

	MyQueue<Integer> queue = new MyQueue();

	// simply adding elements to queue
	@Test
	public void WhenAddedToqueue_ShouldBeAddedAtBottom() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		queue.push(firstNode);
		queue.push(secondNode);
		queue.push(thirdNode);
		MyNode<Integer> topElement = queue.peak();
		Assert.assertEquals(firstNode, topElement);
	}

	@Test
	public void ApplyingPeakNpopMethod_UntilqueueIsEmpty() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		queue.push(firstNode);
		queue.push(secondNode);
		queue.push(thirdNode);
		MyNode<Integer> firstpop = queue.pop();
		Assert.assertEquals(thirdNode, firstpop);
		MyNode<Integer> secondPop = queue.pop();
		Assert.assertEquals(secondNode, secondPop);
		MyNode<Integer> thirdPop = queue.pop();
		Assert.assertEquals(firstNode, thirdPop);
	}

}
