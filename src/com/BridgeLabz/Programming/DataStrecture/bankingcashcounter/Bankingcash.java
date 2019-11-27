package com.BridgeLabz.Programming.DataStrecture.bankingcashcounter;

import com.BridgeLabz.Programming.function.InputUtility;

public class Bankingcash {

	public static void main(String[] args) {
		Queue queue = new Queue();
		System.out.println("Enter the total number of people ");
		int people = InputUtility.inputInteger();
		queue.enqueue(people);
		while (people > 0) {
			System.out.println("Enter yor choice");
			System.out.println("1.deposit");
			System.out.println("2.withdraw");
			System.out.println("3.size of queue");
			System.out.println("4.whether queue is empty or not");
			int choice = InputUtility.inputInteger();
			switch (choice) {
			case 1: {
				queue.dequeue();
				System.out.println("enter cash amount");
				int cash = InputUtility.inputInteger();
				queue.deposit(cash);

				break;
			}
			case 2: {
				queue.dequeue();
				System.out.println("enter cash amount");
				int cash = InputUtility.inputInteger();
				queue.withdraw(cash);
				break;

			}
			case 3: {
				System.out.println(queue.size());
				break;
			}
			case 4: {
				System.out.println(queue.isEmpty());
				break;

			}
			default:
				System.out.println("end");
				System.exit(0);
				break;
			}
			people--;
		
		}
	}
}