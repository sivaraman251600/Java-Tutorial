/*----------- Operator Precedence ---------*/
public class OperatorPrecedence {
	public static void main(String[] args) {
		// BODMASS concept if you do the math operation 
		
		int a = 10, b = 15;
		
		System.out.println("Output of Operator precedence " + ((a/b)-1));
		
		// For prefix and post-fix
		
		System.out.println("Answer " + (a++ + ++a));
		
		/* if you use 11++ this will generate an error in your console page we are not able to directly use the increment 
		 * in numbers, we only able to use in variables 
		 * (a ^ b) ^ b = a 
		 * (a ^ b) ^ a = b */
		
		// Swapping variables using the above operation
		
		int c = 10, d = 20;
		
		c = (c ^ d) ^ c ;
		d = ((c ^ d) ^ d);
		
		System.out.println("Swapped Value C = " + c );
		System.out.println("Swapped Value D = " + d );
		
	}
}
