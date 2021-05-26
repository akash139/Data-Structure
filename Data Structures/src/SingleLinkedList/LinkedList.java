package SingleLinkedList;

public class LinkedList {
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
		while (node.nextNode != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;
		}
		System.out.println(node.data);
	}
}
