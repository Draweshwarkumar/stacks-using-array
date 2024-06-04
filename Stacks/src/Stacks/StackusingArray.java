package Stacks;

public class StackusingArray {

	private int data[];
	private int top;
	
	public StackusingArray() {
		data = new int[10];
		 top = -1;
	}
	
	public StackusingArray(int capacity) {
		data = new int[capacity];
		 top = -1;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() throws Stackemptyexception{
		if(size() == 0) {
			Stackemptyexception e = new Stackemptyexception();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) {
		if(size() == data.length) {
			doublecapacity();
		}
		top++;
		data[top] = elem;
	}
	
	private void doublecapacity() {
		int temp[] = data;
		data = new int[2* temp.length];
		for(int i=0; i<= top;i++) {
			data[i] = temp[i];
		}
	}
	
	public int  pop()throws Stackemptyexception {
		if(size() == 0) {
			Stackemptyexception e = new Stackemptyexception();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
}
