package SingleLinkedList;

class Node { // Creating Node
	int data; // Node consists of data and reference of nextNode
	Node nextNode;
}

class LinkedList<E> {
	Node head; // refer to 1st Node

	public void insert(int data) { // insert method inserts at end of the list
		Node node = new Node(); // creating new node
		node.data = data; // user data is added to node.
		node.nextNode = null;
		if (head == null) { // if it is 1st object then check head == null
			head = node; // 1st node is head
		} else { // if not
			Node n = head; // temporary node.
			while (n.nextNode != null) { // traverse in LinkedList
				n = n.nextNode; // jumping between nodes
			}
			n.nextNode = node; // value of nextNode is node
		}
	}

	public void show() { // printing LinkedList
		Node node = head; // pointing to head
		if (head == null) {
			System.out.println("is Empty");
		} else {
			while (node.nextNode != null) { // Traverse in LinkedList
				System.out.print(node.data + " ");
				node = node.nextNode; // Shifting to nextNode
			}
			System.out.println(node.data); // printing last node as last node is null
		}
	}

	public void insertAtStart(int data) { // insert elements at start
		Node node = new Node(); // creating new node
		node.data = data; // user data is added to node.
		node.nextNode = null;

		node.nextNode = head; // node.nextNode is previous Node
		head = node; // head is pointing to 1st node.
	}

	public void insertAt(int index, int data) { // insert element at given index number
		Node node = new Node(); // creating new node
		node.data = data; // user data is added to node.
		node.nextNode = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.nextNode;
			}
			node.nextNode = n.nextNode;
			n.nextNode = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.nextNode; // changing head to nextNode
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.nextNode;
			}
			n1 = n.nextNode;
			n.nextNode = n1.nextNode;
			n1 = null; // garbage collection
		}
	}

	public void deleteHead() {
		head = head.nextNode; // delete element
	}
}

public class SingleLinkedList { // LIFO
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(29);
		list.insert(65);
		list.insert(71);
		list.insert(95);
		list.insert(15);
		list.show();
		list.deleteHead();
		list.show();
		list.deleteAt(2);
		list.show();
		list.insertAt(2, 56);
		list.show();
	}
}
