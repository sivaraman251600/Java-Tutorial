/*---------- Relational Operator 
 * ----- <   <=   >   >=  == != -----------*/
import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		int numberOne, numberTwo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number One");
		
		numberOne = scan.nextInt();
		
		System.out.println("Enter Number Two");
		
		numberTwo = scan.nextInt();
		
		if(numberOne > numberTwo) {
			System.out.println("1 is greater then 2");
			System.out.println("Number's are also not equal");
		}
		
		else if(numberOne < numberTwo){
			System.out.println("2 is greater then 1");
			System.out.println("Number's are also not equal");
		}
		
		else if(numberOne == numberTwo) {
			System.out.println("Both 1 and 2 are Equal");
		}
		
		scan.close();
	}
}
