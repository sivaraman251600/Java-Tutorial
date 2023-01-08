/*------ One dimensional array and Two dimensional array ---------------*/
public class Arrays {

	public static void main(String[] args) {
		/* One Dimensional Array int a[] = new int[50]; or int[] a = new int[50]; int[] a,b,d; */
		int a[] = {1,2,3,4,5};
		
		System.out.println(a[2]);
		
		// Two Dimensional Array;
		
		int b[][] = new int[2][4];
		
		b[1][3] = 36;
		b[0][0] = 84;
		
		System.out.println(b[1][3]);

	}

}
