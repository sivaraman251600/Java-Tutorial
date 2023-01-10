package OOPS;

public class StackDemo {

	public static void main(String[] args) {
		// PUSH, POP, SHIFT, UNSHIFT Methods
		
		Stack stack = new Stack();
		
		stack.push(11);
		stack.push(12);
		stack.push(13);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push(10);
		
		System.out.println(stack.pop());

	}

}
