package com.BridgeLabz.Programming.DataStrecture.anagramlinkedliststack;
/*
 * this a stack implementation using single Linkedlist
 * <T> is used to allow type to be a parameter
 * */

public class Linkedlist<T> {

	private Node<T> top;

	public void insert(T data) {/*insert value to linkedlist*/
		Node<T> node = new Node<>(data);

		if (top == null) {
			top = node;
		} else {
			top.next = node;
			node.prev = top;
			top = node;
		}
	}

	public void show() {/*to show the data*/
		Node<T> temp = top;
		while (temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.prev;
		}

	}

	public int size() {/*size of the list*/
		int check = 0;
		Node<T> temp = top;
		while (temp != null) {
			check++;
			temp = temp.prev;
		}
		return check;
	}

	public void delet() {/*delet a element*/

		if (size() == 1) {
			top = null;
		} else {
			top = top.getPrev();
			top.next = null;
		}
	}

}