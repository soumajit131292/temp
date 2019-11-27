package com.bridgelabz.transactiondetails.model;

public class Singlylinkliststack<T> {

	 Node<T> top;

	public void insert(T data) {/*insert value to linkedlist*/
		Node<T> node = new Node<>(data);

		if (top == null) {
			top = node;
		} else {
			Node<T> temp=top;
			node.next=temp;
			top=node;
			
			
			
		}
	}
	public void show() {/*to show the data*/
		Node<T> temp = top;
		while (temp != null) {
			System.out.println(" " + temp.data);
			temp = temp.next;
		}

	}

	public int size() {/*size of the list*/
		int check = 0;
		Node<T> temp = top;
		while (temp != null) {
			check++;
			temp = temp.next;
		}
		return check;
	}

	public void delet() {/*delet a element*/

		if (size() == 1) {
			top = null;
		} else {
			top =top.next;
		}
	}


	
	
	
	
	
}
