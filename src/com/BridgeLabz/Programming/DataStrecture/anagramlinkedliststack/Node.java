package com.BridgeLabz.Programming.DataStrecture.anagramlinkedliststack;

public class Node<T> {

	
	T data;
	Node<T> next;
	Node<T> prev;
	public Node(T data)
	{
		this.data=data;
	}
	public Node<T> getPrev()/*to get the current node.prev address*/
	{
		return prev;
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
