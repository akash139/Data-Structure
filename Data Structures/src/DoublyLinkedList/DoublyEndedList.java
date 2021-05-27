package DoublyLinkedList;

class Node11 {
	private int data;
	private Node11 nextNode11;

	public Node11(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public Node11 getNextNode11() {
		return this.nextNode11;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNextNode11(Node11 nextNode11) {
		this.nextNode11 = nextNode11;
	}

	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}

public class DoublyEndedList {
	private Node11 head;
	private Node11 tail;

	public void insertAtTail(int data) {
		Node11 newNode11 = new Node11(data);
		if (this.head == null) {
			this.head = newNode11;
		}
		if (this.tail != null)
			this.tail.setNextNode11(newNode11);
		this.tail = newNode11;
	}

	@Override
	public String toString() {
		String result = "{";
		Node11 current = this.head;

		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode11();
		}
		result += "}";
		return result;
	}

	public static void main(String[] args) {
		DoublyEndedList d = new DoublyEndedList();
		d.insertAtTail(6);
		d.insertAtTail(4);
		d.insertAtTail(5);
		d.insertAtTail(1);

		System.out.println(d);
	}

}
