package stackusingLL;

import Stacks.Stackemptyexception;

public class stackusingLL<T> {
	
	
	node<T> head;
	private int size;
	
	public stackusingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public T top() {
		if(head == null) {
			return null;
		}
		else {
			return head.data;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push (T element) {
		node<T> newnode = new node<T>(element);
		newnode.next = head;
		head = newnode;
		size++;
	}
	
		public T pop() throws Stackemptyexception {
			if(isEmpty()) {
				throw new Stackemptyexception();
			}
			else {
				T top = head.data;
				head = head.next;
				size--;
				return top;
			}
		}
	

}
