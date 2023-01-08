/* ------------- Getting Data From User ----------------- */
import java.util.Scanner;
public class GettingInputFromUser {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter Your Name ");
		
		String name = scan.next();
		
		System.out.println("Enter Your Rating From 1 to 5 ? ");
		
		int rating = scan.nextInt();
		
		System.out.println("Enter Your Email Address ");
		
		String emailAddress = scan.next();
		
		// Print the getting Values
		
		System.out.println("Hello " + name);
		System.out.println("Your Rating is " + rating);
		System.out.println("And Your Email Address is " + emailAddress);
		
		scan.close();
		
	}
}
