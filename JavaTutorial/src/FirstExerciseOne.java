/* ------------------- First Exercise <==Pattern Printing===> ---------------------- */
import java.util.Scanner;
public class FirstExerciseOne {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number to Print like Pryamid");
		
		int printingValue = scanner.nextInt();
		
		int spaceAllocation = 1;
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 != 0) {
				
				for(int k = 1; k <= 5+spaceAllocation-i; k++) {
					System.out.print(" ");
				}
				
				
				for(int l = 1; l <= i; l++) {
					System.out.print(printingValue);
				}
				
				spaceAllocation++;
				
			}
			
			System.out.println();
		}
		scanner.close();
	}
}
