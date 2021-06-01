package Stack;

class Stack { // LIFO

	int arr[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (top == 5) { // check whether stack is full or not
			System.out.println("Stack overflow!");
		} else {
			arr[top] = data; // After inserting element in stack increment the index no
			top++; // incrementing index of stack
		}
	}

	public void pop() {
		if (top == 0) {	//check whether stack is underflow condition
			System.out.println("Stack underflow");
		} else {
			int data;
			top--;
			data = arr[top];
			arr[top] = 0; // removed element set as 0
		}
	}

	public int peek() {
		int data;
		data = arr[top - 1];
		return data;
	}

	public int size() {
		int size = arr.length;
		return size;
	}

	public void show() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public int insertAt(int index, int push) {
		int insert;
		//top = index;
		insert = arr[index];
		arr[top] = push;
		top++;
		return insert;
	}

	public void isEmpty() { // method 1
		if (top <= 0) {
			System.out.println("Empty stack.");
		} else {
			show();
		}
	}

	public boolean ISEMPTY() { // method 2
		return top <= 0;
	}
}

public class StackConcep { // LIFO
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.print("Before inserting checking isEmpty(): ");
		s.isEmpty();

		System.out.println("Size of stack is: " + s.size());
		s.push(68);
		s.push(7);
		s.push(1);
		s.push(6);
		s.push(5);
		System.out.print("Pushed element are: ");
		s.show();

		s.pop();
		System.out.print("After poping: ");
		s.show();

		System.out.print("After insering checking isEmpty(): ");
		s.isEmpty();

		System.out.println("Last element inserted is: " + s.peek());

		s.insertAt(1, 89);
		System.out.print("After inserting at specified index: ");
		s.show();

		System.out.println(s.ISEMPTY());
	}
}