/*------------- Variables Declaration and usage ----------------   
 *------------- Totally 8 data Types are there in Java --------- 
 *---------- Variable declaration syntax {<Data-Type><Variable name>}
 *--------- you can able to store the decimal value as well as Hexadecimal
 *--------- if you store decimal value just put the 0 (Zero) in front the integer value
 *--------- if you store the Hexadecimal value you just put the (0x) in front of the Integer value */
public class VariablesDemo {
	public static void main(String args[]) {
		byte singleValue = 10; // 010;(Decimal Value) & 0xA; (HexaDecimal value)
		int ticketPrice = 900;
		short shortValue = 126;
		float floatValue = 10.876f;
		double doubleValue = 1000.12345678;
		char charValue = 'A';
		boolean boolValue = true;
		long longValue = 12345678910119l;
		
		System.out.println("Byte Value " + singleValue);
		System.out.println("Int Value " + ticketPrice);
		System.out.println("Short Value " + shortValue);
		System.out.println("Float Value " + floatValue);
		System.out.println("Double Value " + doubleValue);
		System.out.println("Character Value " + charValue);
		System.out.println("Boolean Value " + boolValue);
		System.out.println("Long Int Value " + longValue);
	}

}
