package com.BridgeLabz.Programming.DataStrecture.palindrome;

public class Deque {

	private static Node front;
	private static Node rear;

	public void addrear(char ch) {
		Node node = new Node(ch);
		if (rear == null) {
			rear = node;
			front = rear;
		} else {
			node.prev = rear;
			rear.next = node;
			rear = node;

		}

	}
	public int size()
	{
		Node temp=front;
		int size=0;
		while(temp!=null)
		{
			temp=temp.next;
			size++;
		}
		return size;
	}
	public boolean isEmpty()
	{
		return rear==null;
	}

	public char removeFront() {
		char ch = front.data;
		front = front.next;
		return ch;
	}

	public char removeRear() {
		char ch = rear.data;
		rear = rear.prev;
		return ch;
	}

	public void show() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/*public static void main(String[] args) {
		Deque d = new Deque();
		d.addrear('a');
		d.addrear('b');
		d.addrear('c');
		d.addrear('d');
		d.show();
	}*/

}
