
class Node {
	int data;
	Node nextNode;
}

class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.nextNode != null) {
				n = n.nextNode;
			}
			n.nextNode = node;
		}
	}

	public void show() {
		Node node = head;
		if (head == null) {
			System.out.println("is Empty");
		} else {
			while (node.nextNode != null) {
				System.out.print(node.data + " ");
				node = node.nextNode;
			}
			System.out.println(node.data);
		}
	}
}

public class SingleLinkedList { // LIFO
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(1);
		list.insert(2);
		list.insert(9);

		list.show();
	}
}
