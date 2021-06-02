package Queue;

class Queue {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;

	public void enQueue(int data) {
		if (isEmpty()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		} else {
			isFull();
		}
	}

	public int deQueue() {
		int data;
		data = queue[front];
		front = (front + 1) % 5;
		size--;
		return data;

	}

	public void show() {
		System.out.print("Queue elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
		System.out.println();
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
		if (front != rear)
			return false;
		return true;
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
		System.out.println(q.isEmpty());
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);

		q.deQueue();
		q.deQueue();

		q.enQueue(9);
		q.enQueue(1);

		System.out.println("Checking full or not: " + q.isFull());

		System.out.println("Size: " + q.getSize());
		q.show();
		System.out.println(q.isEmpty());
	}
}