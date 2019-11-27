package com.BridgeLabz.Programming.DataStrecture.balancedparentheses;

/*
 * Implementation of stack using array
 * 
 * 
 * */

public class Stack {
	public static int top = -1;
	public static char[] parenthesis = new char[100];

	public void push(char element) {/*push the elements */

		if (top == 100) {
			System.out.println("stack overflow");
		} else {
			top++;
			parenthesis[top] = element;

		}
	}

	public void pop() {/*pop the elements*/
		if (top == -1) {
			System.out.println("Stack uderflow");
		} else {

			top--;
		}

	}

	public boolean isEmpty() {/*if array is empty or not*/
		return top == -1;

	}

	public int size() {/*if array size is empty or not*/
		return top + 1;
	}

	public char peek() {/*peek the top value and shows the result*/
		return parenthesis[top];
	}
}
