package Stack;

class DynamiccStack { // LIFO

	int capacity = 2;
	int arr1[] = new int[capacity];
	int top = 0;

	public boolean isEmptyy() { // method 1
		if (top <= 0) {
			System.out.println("Empty stack.");
		} else {
			show();
		}
		return false;
	}

	public void push(int data) {
		if (size() == capacity)
			expand();
		arr1[top] = data; // After inserting element in stack increment the index no
		top++; // incrementing index of stack
	}

	private void expand() {
		int length = size();
		int arr2[] = new int[capacity * 2]; // creating new stack

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // initalize data to arr2 from arr1
		}

		// System.arraycopy(arr1, 0, arr2, 0, length);
		arr1 = arr2;
		capacity *= 2;
	}

	public int pop() {
		int data = 0;
		if (top >= 0) { // check whether stack is underflow condition
			System.out.println("Stack underflow");
		} else {
			top--;
			data = arr1[top];
			arr1[top] = 0; // removed element set as 0
			shrink();
		}
		return data;
	}

	private void shrink() {
		int length = size();
		if(length <= (capacity/2)/2)
			capacity = capacity /2;
		int arr2[] = new int[capacity];
		System.arraycopy(arr1, 0, arr2, 0, length);
		arr1 = arr2;
				
	}

	public int peek() {
		int data;
		data = arr1[top - 1];
		return data;
	}

	public int size() {
		int size = arr1.length;
		return size;
	}

	public void show() {
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

public class DynamicStack {
	public static void main(String[] args) {
		DynamiccStack ds = new DynamiccStack();
		ds.push(5);
		ds.show();
		ds.push(9);
		ds.show();
		ds.push(4);
		ds.show();
		ds.push(9);
		ds.show();
		ds.push(4);
		
		ds.pop();
		ds.show();
		
	}
}