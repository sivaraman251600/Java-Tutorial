import java.lang.Math;
import java.util.Scanner;

//Problem : To Find out the nearest perfect square number for user given;

public class LoopsExercise {

	public static void main(String[] args) {
		// Exercise One;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pleas Enter a Number To Check It's a Square Root");
		
		double n,i,j;
		
		n = scan.nextDouble();
		
		while(n > 0) {
			i = Math.sqrt(n);
			j = Math.floor(i);
			
			if(j*j == n) {
				System.out.println("given number nearest Square Root is : " + j);
				System.out.println("Square Value : "+ n);
				break;
			}
			n++;
		}
		
		scan.close();
	}

}
