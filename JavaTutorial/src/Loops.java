import java.util.Scanner;
public class Loops {
	
	public static void main(String[] args) {
		
		// while loop, do-while loop, for loop;
		
 /*		System.out.println("Enter a Number of Stars Required");
		
		Scanner scan = new Scanner(System.in);
		
		int i=1, n;
		
		n = scan.nextInt();	 	 	   	
		
		// while loop
		while(i <= n){
			System.out.print("*");
			i++;
		} 
		
		scan.close();
		*/
		
		// Do-While Loop
		
		/* System.out.println("Enter a Number of Stars Required");
		Scanner scan = new Scanner(System.in);
		
		int i = 1, n;
		
		n = scan.nextInt();
		
		do {
			System.out.print("*");
			i++;
		}while(i <= n);
		
		scan.close(); */
		
		// For Loop
		
	/*	System.out.println("Enter a Number of Stars Required");
		Scanner scan = new Scanner(System.in);
		
		int i,n;
		
		n = scan.nextInt();
		
		for(i = 1; i <= n; i++) {
			System.out.print("*");
		}
		
		scan.close(); */
		
		// when You using the break statement to break the loop but it's always come out from the where this break should
		// be present and also if you need to come out from the parent loop or from nested loop you can use the 
		// Labeled break.
		
		// And continue statement is used to skip the particular value and continue with the rest of the values;
		
		int i, j;
		
		parentLoop: // This is we called us labeled loop and this is used for to break the the loop up-to which point;
		for(i = 1; i <= 5; i++) {
			childLoop:
			for(j = 1; j <= 5; j++) {
				if(i == 3 && j == 3) break parentLoop;
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}

}
