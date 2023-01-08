/* ------------ Type Casting ----------------- 
 * ------------- Implicit type casting if you assign one data type format to store in another data
 *   type format some times the java take a responsible to convert internally it's called Implicit type casting
 *   ------------ Explicit type casting if you assign the integer value into byte the Java doesn't take the internal 
 *   type casting due to Integer is a big value and Byte is small value so it's not possible for Implicit type conversion
 *   so we go to the Explicit Type conversion ----------------------------------------------
 *   if you try to assign the big value to byte using explicit it's shows the wrong value -------------- */
public class TypeCastingDemo {
	public static void main(String[] args) {
		// Implicit Type Casting
		
		byte byteValueImplicit = 10;
		int integerValueImplicit = 1000;
		
		integerValueImplicit = byteValueImplicit;
		
		System.out.println(integerValueImplicit);
		
		// Explicit type Conversion
		
		byte byteExplicit = 10;
		int integerExplicit = 1000;
		
		byteExplicit = (byte)integerExplicit;
		
		System.out.println(byteExplicit);
		
	}

}
