package com.BridgeLabz.Programming.DataStrecture.orderedlist;

import java.io.FileWriter;

/*
 * 
 * implemented singly linked with T type generics
 * 
 * 
 * 
 * */
public class Orderedlinklist<T extends Comparable<T>> {

	public Node<T> head;

	public void creation(T word) {/*it will insert value T type in linked list*/

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

	public int numberofelement() {/*to find the number of elements*/
		Node<T> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;

	}

	public  void sort() {/*to sort all the elements*/
		Node<T> temp;
		int element = numberofelement();

		for (int j = 0; j < element; j++) {
			temp = head;
			for (int i = 0; i < element - 1; i++) {
				if (temp.data.compareTo(temp.next.data) > 0) {
					T tem = temp.data;
					temp.data = temp.next.data;
					temp.next.data = tem;

				}
				temp = temp.next;

			}
		}
	}
public void readFile()
{
	 
}
	public int intsearch(T keyword) {/*to search  a keyword*/
		Node<T> temp = head;
		int found = 0;
		int positionofword = 0;
		while (temp != null) {
			positionofword++;
			if (temp.data == keyword) {

				found = 1;
				break;
			}
			temp = temp.next;
		}
		if (found == 0)
			insertEnd(keyword);
		else {
			delet(positionofword);
			return -1;
		}
		return 0;

	}

	public void writeToFile(FileWriter fw) {/*write element in file*/
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

	public void insertEnd(T searchword) {/*to insert in the end*/
		Node<T> temp = head;
		Node<T> node = new Node<>();
		node.data = searchword;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		view();
	}

	public void delet(int positionofword) {/*to delet a element in specific position*/

		Node<T> temp = head;
		if (positionofword == 1) {
			temp = temp.next;
			head = temp;
		} else {

			while (positionofword - 2 > 0) {
				temp = temp.next;
				positionofword--;
			}
			temp.next = temp.next.next;

		}
		view();

	}

	public void view() {/*to print the element of the linked lsit */
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

}
