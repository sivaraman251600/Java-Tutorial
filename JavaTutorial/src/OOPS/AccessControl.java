package OOPS;

public class AccessControl {
	
	private static void privatetest() {
		System.out.println("Called Private Method");
	}
	
	public static void publictest() {
		System.out.println("Called Public Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Access specifier or Access controller is nothing but we need to protect the access of the method's or 
		 * data or classes from public 
		 * 
		 *  you need to use these keyword which method or data you want to protect or Access control from user
		 *  1. private
		 *  2. public
		 *  3. protected these are all called access specifier's 
		 *  
		 *  so if you doesn't give any value like private or public the java take an as default in this default method
		 *  you can access these methods inside of the owned package only, not from outside of the package 
		 *  you're not able to access 
		 *  
		 *  So this is the reason the main method was always given as the public class then only we are able to access
		 *  it from any where
		 *  
		 *  And if you give it in private you are not able to access from other classes only inside of that class
		 *  we able to access it */
		
		
		privatetest();
		publictest();

	}

}
