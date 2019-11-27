package com.BridgeLabz.Programming.DataStrecture.anagramlinkedlistqueue;
import java.util.logging.Logger;
/*
 * 
 * 
 * Queue implementation using Doubly Linkedlist
 * 
 * 
 * 
 * */

public class Linkedlistqueue <T>{

	
	private static final Logger logger = Logger.getLogger(Linkedlistqueue.class.getName());
	private Node<T> front;
	private Node<T> rear;

	public void enqueue(T data) {/*to insert data in queue*/
		Node<T> node = new Node<T>(data);
		if (front == null) {
			front = node;
		} else {
			Node<T> temp = front;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
			rear = node;
		}
	}

	public void show() {/*to show data*/
			Node<T> temp = front;
			while (temp != null) {
				System.out.print(temp.data.toString()+",");
				temp = temp.next;
			}
		}

	public void showReverse() {/*to reverse show data*/
		Node<T> temp = rear;
		while (temp != null) {
			System.out.print(temp.data.toString() + ",");
			temp = temp.prev;
		}
	}

	public T peek() {/*to peek and show the value*/
		return rear.getData();
	}

	public void deque()/*to delete the value*/

	{
		if (size() == 1) {
			rear = null;
			front = null;
		} else {
			rear = rear.getPrev();
			rear.next = null;
		}

	}

	public Node<T> isEmpty() {/*to check whether it is empty or not*/
		return rear;
	}
	public int size() {/*to check the size*/
		int check = 0;
		Node<T> temp = front;
		while (temp != null) {
			temp = temp.next;
			check++;
		}
		return check;
	}

}