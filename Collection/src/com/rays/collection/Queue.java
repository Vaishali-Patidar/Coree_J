package com.rays.collection;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q.remove(20));
		System.out.println(q);
	}

}
