import java.util.Scanner;
/*------------------ Switch Statement Alter for if and else condition --------------------- */

public class SwitchStatement {

	public static void main(String[] args) {
		// Getting content from user
		
		Scanner scanner = new Scanner(System.in);
		
		// Declaring variables
		
		String days;
		String noon;
		int a,b;
		char c;
		
//		System.out.println("Enter a Days");
//		days = scanner.next();
		
		// we are not able to use the shortcut operator or logical operators in any Switch cases;
		
//		switch(days) {
//		case "Monday" : System.out.println("Happy Monday");
//		break;
//		case "Tuesday": System.out.println("Happy Tuesday");
//		break;
//		case "Wednesday" : System.out.println("Happy wednesday");
//		break;
//		case "Thursday" : System.out.println("Happy Thursday");
//		break ;
//		case "Friday" : System.out.println("Happy Friday");
//		break;
//		
//		default: System.out.println("Happy weekend");
//		}
		
		System.out.println("Enter a number_1 for mathematical operation");
		a = scanner.nextInt();
		
		System.out.println("Enter a number_2 for mathematical operation");
		b = scanner.nextInt();
		
		/* here we doesn't have the method for getting the char from user so we can use the 
		 * next() method of string reader to read the data from user and we use the charAt() method to get
		 * the first character of the user entered string */
		
		System.out.println("Enter a operator for logic");
		c = scanner.next().charAt(0);
		
		switch(c) {
		case '+' : System.out.println(a + "+" + b + "=" + (a+b));
		break;
		case '-' : System.out.println(a + "-" + b + "=" + (a-b));
		break;
		case '*' : System.out.println(a + "*" + b + "=" + (a*b));
		break;
		case '/' : System.out.println(a + "/" + b + "=" + (a/b));
		break;
		case '%' : System.out.println(a + "%" + b + "=" + (a%b));
		break;
		
		default: System.out.println("Please enter a correct operator");
		}
		
		scanner.close();

	}

}
