package com.BridgeLabz.Programming.DataStrecture.unorderlist;

import java.io.FileWriter;

public class UnorderedLinkedList<T extends Comparable> {

	public Node<T> head = null;

	public void creation(T word) {

		Node<T> node = new Node<>();
		if (head == null) {
			node.data = word;
			head = node;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			node.data = word;
			temp.next = node;

		}
	}

	public int search(T searchword) {
		Node<T> temp = head;
		int found = 0;
		int positionofword = 0;
		while (temp != null) {
			positionofword++;
			if (temp.data.equals(searchword)) {
				if (temp.data == searchword) {
					found = 1;
					break;
				}
				temp = temp.next;
			}
			if (found == 0)
				insertEnd(searchword);
			else {
				delet(positionofword);
				return -1;
			}
		}
		return 0;

	}

	public void writeToFile(FileWriter fw) {
		try {

			Node<T> temp = head;
			String s = "";
			while (temp != null) {
				s = s + temp.data + ",";
				temp = temp.next;
			}
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void insertEnd(T searchword) {
		Node<T> temp = head;
		Node<T> node = new Node<>();
		node.data = searchword;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		view();
	}

	public T delet(int positionofword) {

		Node<T> temp = head;
		T value = null;
		if (positionofword == 1) {
			temp = temp.next;
			value = head.data;
			head = temp;
		} else {

			while (positionofword - 2 > 0) {
				temp = temp.next;
				positionofword--;

			}
			value = temp.next.data;
			temp.next = temp.next.next;

		}

		return value;
	}

	public void view() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data.toString()+ "   ");
			temp = temp.next;
		}

	}
	
	public String toString() { Node<T> temp=head;
	  
	  return temp.data.toString();
	  
	  }
	 

}