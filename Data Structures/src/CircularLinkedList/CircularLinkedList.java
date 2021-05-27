package CircularLinkedList;

public class CircularLinkedList {
	class Node {	// represent node of list
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;	//declaring head and tail as null
	Node tail = null;

	public void add(int data) { // function will add the new node at the end of the list
		Node newNode = new Node(data);	// create new node
		if (head == null) {				// check if list is empty or not
			head = newNode;				// if list is empty both head and tail will ponit to new node
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;		// tail will point to new node
			tail = newNode;				// new node will become new tail
			tail.next = head;			// since it is circular tail will point to head 
		}
	}

	public void display() {				//display all the nodes in the list
		Node current = head;
		if (head == null) {
			System.out.println("Empty List");
		} else {
			System.out.println("Nodes of circular Linked List");
			do {						// print each node by incrementing pointer
				System.out.println(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkedList c = new CircularLinkedList();
		c.add(95);						// add data to list
		c.add(49);
		c.add(45);
		c.add(35);
		c.add(65);

		c.display();					// display data of the list

	}
}
