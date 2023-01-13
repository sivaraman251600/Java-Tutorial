package OOPS;

public class Stack {

	// Here we are creating the push and pop method to get the data from stack.
	// based on each method performance.

	int[] stack = new int[10];
	int tos = -1;
	int initialShift = 0;

	Stack() {
		tos = -1;
	};

	void push(int item) {
		if (tos != 10)
			stack[++tos] = item;
		else
			System.out.println("Stack Memory Is Full");
	}

	int pop() {
		if (tos >= 0)
			return stack[tos--];
		else
			System.out.println("The pop Methos doesn't have any value to return");
		return -1;
	}

	void unShift(int item) {
		for (int i = 0, k = 0; i < stack.length; i++) {
			if (i == 0)
				stack[0] = item;
			else
				stack[++k] = stack[i];
		}
	}

}
