package OOPS;

public class MethodOverLoading {
	
	static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	static double max(double a, double b) {
		return a > b ? a : b;
	}
	
	static char max(char a, char b) {
		return a > b ? a : b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* The method overloading, when you create the too many methods on the same name with different type of 
		 * Arguments (or) with different type of data types we called method overloading
		 * so the java automatically find out the perfect method based on the data type and arguments 
		 * difference between above same named methods 
		 * so we created the three methods with same name here java was automatically find out the perfect method
		 * but this feature was not available in C. */
		
		/* With out creating the object you can access the methods using static keyword on methods. */
		
		System.out.println(max(1,2));
		System.out.println(max(2.4, 5.6));
		System.out.println(max('a','b'));

	}

}
