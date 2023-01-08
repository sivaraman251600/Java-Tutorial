import java.util.Scanner;
/*----------------- If and Else conditional operators ------------------ */

public class IfElseStatement {

	public static void main(String[] args) {
		
		// getting Input from Scanner
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value One");
		a = scan.nextInt();
		
		System.out.println("Enter a value two");
		b = scan.nextInt();
		
		if(a > b) {
			System.out.println("A is greate than B");
		}
		
		else if(a < b) {
			System.out.println("A is less than B");
		}
		
		else if(a == b) {
			System.out.println("A is equal to B");
		}
		
		System.out.println("Enetr a Name one");
		String name_1 = scan.next();
		
		System.out.println("Enter a Name Two");
		String name_2 = scan.next();
		
		scan.close();
		
		if(name_1.length() > name_2.length()) {
			System.out.println("Name One length is greater than name two");
		}
		
		else if(name_1.length() == name_2.length()) {
			System.out.println("Name one and Name Two is Equal");
		}
		else if(name_1.length() < name_2.length()) {
		System.out.println("Name one length is less than name two");
		}
	}

}
