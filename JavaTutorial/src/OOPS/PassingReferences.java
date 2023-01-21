package OOPS;

class IncrementValue{
	int length;
	
	IncrementValue(int l){
		length = l;
	}
	
	boolean isEqual(IncrementValue a){
		a.length++;
		return length == a.length ? true : false;
	}
}

public class PassingReferences {
	
	static void increment(int a) {
		a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Passing the value to one method for increment the value, so once the increment done we are console those
		 * values but we are not getting the incremented value, due to the we are just passing the values only 
		 * not a reference so Java was deallocate the memory space once the work is done. 
		 * 
		 * 1. Methods --> variables and other values what ever it's there these are all store in STACK Memory portion 
		 * 2. Object  --> variables and other values what ever it's there these are all store in HEAP Memory portion */
		
		// Call By Value
		
		int a = 10;
		increment(a);
		System.out.println(a);
		
		// Call By Reference
		
		IncrementValue a1 = new IncrementValue(10);
		IncrementValue a2 = new IncrementValue(10);
		
		System.out.println(a1.isEqual(a2));
		System.out.println(a2.length);

	}

}
