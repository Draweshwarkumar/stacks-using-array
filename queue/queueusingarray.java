package queue;

public class queueusingarray {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public queueusingarray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public queueusingarray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
		
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	int front() throws queueemptyexception {
		if(size == 0) {
			throw new queueemptyexception();
		}
		return data[front];
	}
	
	void enqueue(int elem) throws queuefullexception {
		if(size == data.length) {
			throw  new queuefullexception();
		}
		if(size == 0) {
			front = 0;
		}
		size++;
		rear++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = elem;
	}
	
	int dequeue() throws queueemptyexception {
		if(size == 0) {
			throw new queueemptyexception();
		}
		int temp = data[front];
		front++;
		if(front== data.length) {
			front = 0;
		}
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
	
	
	

}
