package stackQueue.controller;

import java.util.LinkedList;
import java.util.Stack;

import stackQueue.model.Customer;

public class SQController
{
	private LinkedList<Customer> customerQueue;
	private Stack<Customer> customerStack;

	public SQController()
	{
		customerQueue = new LinkedList<Customer>();
		customerStack = new Stack<Customer>();

	}

	public void start()
	{
		int rand = (int) (Math.random() * 10) + 1;
		for (int index = 0; index < rand; index++)
		{
			customerQueue.add(new Customer("Bob" + index, (4 * index / 3) + rand, index % 2 == 0));
		}
		rand = (int) (Math.random() * 10) + 1;
		for (int index = 0; index < rand; index++)
		{
			customerStack.push(new Customer("Bob" + index, (4 * index / 3) + rand, index % 2 == 0));
		}
		while (customerQueue.size() > 0)
		{
			System.out.println(customerQueue.remove());
		}
		while (customerStack.size() > 0)
		{
			System.out.println(customerStack.pop());
		}
	}
}
