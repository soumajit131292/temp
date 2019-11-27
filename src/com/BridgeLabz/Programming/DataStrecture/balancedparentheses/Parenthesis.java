package com.BridgeLabz.Programming.DataStrecture.balancedparentheses;

/*
 * checks whether brackets are balanced or not in an expression 
 * 
 * */
import com.BridgeLabz.Programming.function.InputUtility;

public class Parenthesis {
	public static boolean balancecheck(char ch1, char ch2) {
		return (ch1 == '(' && ch2 == ')' || ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}');

	}

	public static boolean balanced(char[] expression) {
		Stack stack = new Stack();
		char bracket;

		for (int i = 0; i < expression.length; i++) {
			if (expression[i] == '(' || expression[i] == '{' || expression[i] == '[') {
				stack.push(expression[i]);
			}

			if (expression[i] == ')' || expression[i] == '}' || expression[i] == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				bracket = stack.peek();
				stack.pop();
				if (!balancecheck(bracket, expression[i])) {
					return false;
				}
			}

		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {

		try {
			String input = InputUtility.inputString();

			char[] expression = input.toCharArray();
			boolean value = balanced(expression);
			if (value)

				System.out.println("Balanced parentheses");

			else
				System.out.println("Unbalanced parentheses");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
