package com.BridgeLabz.Programming.DataStrecture.anagramlinkedlistqueue;

public class Node<T> {

	T data;
	Node<T> next;
	Node<T> prev;
	public Node(T data)
	{
		this.data=data;
	}
	public Node<T> getPrev()
	{
		return prev;
	}
	public Node<T> getNext()
	{
		return next;
	}
	public T getData()
	{
		return data;
	}
}
