/* ---------------- Bit Wise Operator ------------------ 
 * &&(AND) ||(OR) ~(NOT) ^(EXOR) <<(Left shift) >>(Right Shift) >>> (Right shift zero fill)*/
public class BitwiseOperator {

	public static void main(String[] args) {
		// AND Operator it's checking the both the value true then it's return true.
		
	    byte a = 5, b = 3;
	    byte c = 1;
	    boolean d = true;
	    boolean e = false;
		
	    System.out.println("AND Operation " + (a & b));
		
		// OR operator it's checking the both value and any one become's true it's return true.
	    
	    System.out.println("OR operation " + (a | b));
		
		// NOT operator it's providing the opposite of the given value 0 -> 1 ,1 -> 0 .
	    
	    System.out.println("NOT operation " + (~c));
		
		/* EXOR operator it's strictly provide true when the any one in both the value become true and not a both value 
		 * become one nor both the value become zero */
	    
	    System.out.println("EXOR Operation " + (a^b));	
	    
	    // Short circuit operator
	    /* Here the difference between normal AND operator and short circuit AND operator is it's checking the 
	     * initial value and if it's true then only it's checking the second value or else the first value is 
	     * false it doesn't check the second value it directly return false */
	    
	    System.out.println(d && e);
	    System.out.println(d || e);
	}

}
