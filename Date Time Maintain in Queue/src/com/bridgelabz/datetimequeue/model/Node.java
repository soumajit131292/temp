package com.bridgelabz.datetimequeue.model;

public class Node<T> {

	
	T data;
	Node<T> next;
	
	public Node(T data)
	{
		this.data=data;
	}
	
	public Node<T> getNext()/*to get the current node.next address*/
	{
		return next;
	}
	public T getData()/*to get the current node data*/
	{
		return data;
	}
	
	
	
	
	
}
