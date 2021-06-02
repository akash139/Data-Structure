package Queue;

class Queue {
	int size;
	int front;
	int rear;
	int queue[] = new int[5];

	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		} else {
			System.out.println("Queue is full!");
		}
	}

	public int deQueue() {
		int data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size--;
		} else {
			System.out.println("Queue is empty!!");
		}
		return data;
	}

	public void show() {
		System.out.print("Queue elements using for loop: ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
		System.out.println();
		System.out.print("Queue elements using for-each: ");
		for (int z : queue) {
			System.out.print(z + " ");
		}
		System.out.println();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		// OR return size == 0;
		// if (front != rear)
		//	return false;
		// return true;
		return getSize() ==5;
	}

	public boolean isFull() {
		if (size > queue.length)
			return true;
		return false;
	}

}

public class QueueMain { // follow FIFO

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		q.enQueue(9);
		q.enQueue(1);
		System.out.println("Checking queue is full or not: "+q.isFull());
		System.out.println("Size is queue: "+q.getSize());
		q.show();
	}
}