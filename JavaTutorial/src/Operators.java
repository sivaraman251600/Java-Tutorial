/* ---------------- Arithmetic Operators in Java ------------------------ */
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operation.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Eneter a Numer 1");
		
		int numberOne = scan.nextInt();
		
		System.out.println("Eneter a Number 2");
		
		int numberTwo = scan.nextInt();
		
		
		
		int addition = numberOne + numberTwo;
		
		int subtraction = numberOne - numberTwo;
		
		int multiplication = numberOne * numberTwo;
		
		int divison = numberOne / numberTwo;
		
		int modulas = numberOne % numberTwo;
		
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(divison);
		System.out.println(modulas);
		
		// Getting Input From User and Add the two inputs.
		
		scan.nextLine();
		
		String name, email, concardination;
		
		System.out.println("Enter Your Name");
		
		name = scan.nextLine();
						
		System.out.println("Enter Your Email");
		
		email = scan.nextLine();
		
		concardination = name + email ;
		
		System.out.println(concardination);
		scan.close();
	}

}
