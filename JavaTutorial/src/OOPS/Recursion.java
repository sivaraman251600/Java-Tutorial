package OOPS;

public class Recursion {
	
	static int factorial(int n) {
		if(n == 0) 
			return 1;
		return n*factorial(n-1);
	}
	
	static int fibonacci(int n) {
		if(n <= 1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* When a method called by it-self it's called Recursion */
		
		int n = 9;
		
		System.out.println(factorial(n));
		System.out.println(fibonacci(n));

	}

}
