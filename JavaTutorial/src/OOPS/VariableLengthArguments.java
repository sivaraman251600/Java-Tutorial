package OOPS;

public class VariableLengthArguments {
	
	static int minNumber(int... minimum) {
		
		int min = Integer.MAX_VALUE;
		
		for(int j:minimum) {
			 if(j < min)
				 min = j;
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* And you can send the data as an argument's to the main method using the command line */
		
		for(int i =0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		/* If you want to give the infinity no.of.arguments to one method you can use the varArgs methodology 
		 * here you can create the one method and that method receive the args like this 
		 * methodName(int... variableName) and here the Java was automatically convert the data into an 
		 * Array of data so it's easy to find out the min and max number's. */
		
		System.out.println(minNumber(1,5,7,8,4));
		System.out.println(minNumber(1,5,7,-8,-4));

	}

}
