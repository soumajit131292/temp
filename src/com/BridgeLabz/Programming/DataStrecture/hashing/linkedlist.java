package com.BridgeLabz.Programming.DataStrecture.hashing;

import java.util.Comparator;

//import com.BridgeLabz.Programming.DataStrecture.orderedlist.Node;

/**
 * @author soumajit
 *
 *
 *
 *
 */
public class linkedlist<T> {

	Node<T> head;

	public void insert(T data) {

		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;

		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public void search(T keyword) {
		Node<T> temp = head;
		int pos = 0;
	
		int flag = 0;
		while (temp != null) {
			pos++;
			if (temp.data == keyword) {
	
				flag = 1;
				break;
			}
			temp = temp.next;
		}
		
		if (flag == 0)
			insert(keyword);
		else
			delet(pos);
	}

public int numberofelement() {
		int count = 0;

		Node<T> temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;

		}
		return count;
	}

/*   Comparator<Integer> comp=new Comparator<Integer>()
		   {
	   public int compare(Integer t1,Integer t2)
		{
			Integer int1=t1;
			Integer int2=t2;
			if(int1>int2)
				return 1;
			else
				return 0;
		}
		   };
	public void sort() {
		Node<T> temp;
		int element = numberofelement();

		for (int j = 0; j < element; j++) {
			temp = head;
			for (int i = 0; i < element - 1; i++) {
				if (temp.data < temp.next.data) {
					int tem = temp.data;
					temp.data = temp.next.data;
					temp.next.data = tem;

				}
				temp = temp.next;

			}
		}
	}*/

	public void delet(int position) {
		Node<T> temp = head;
	
		if (position == 1)
			head = temp.next;
		else {
			while (position - 2 > 0) {
				temp = temp.next;
				position--;
			}
			temp.next= temp.next.next;
		}

	}

	public void show() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}