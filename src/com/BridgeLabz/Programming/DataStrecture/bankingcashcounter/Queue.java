package com.BridgeLabz.Programming.DataStrecture.bankingcashcounter;
/*
 * 
 * this program maintan a cash balance in bak
 * 
 * 
 * */
public class Queue {


	private static int rear ;
	private static int cash = 0;

	public void enqueue(int data)/*entering the data*/

	{
		rear=data;

	}

	public void dequeue() {/*deleting the data*/

		
		rear--;

	}

	public boolean isEmpty() {/*to check if it is empty*/
		return rear == -1;
	}

	public int size() {/*checking of size*/
		
		return rear+1;
	}

	public int deposit(int cash) {/*how much cash is deposited*/

		return Queue.cash + cash;
	}

	public int withdraw(int cash) {/*cash wiithdrawn*/
		try {
		if(Queue.cash-cash<0)
			throw new myException("don't have enough balance");
		
		}
		catch(myException e)
		{
			System.out.println(e.getMessage());
		}
		return Queue.cash - cash;
	}

}