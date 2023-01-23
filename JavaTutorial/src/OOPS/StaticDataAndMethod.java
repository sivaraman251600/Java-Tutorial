package OOPS;

class BoxStatic{
	static int boxCount;
	
	BoxStatic(){
		boxCount++;
	}
	
	static void boxCount() {
		System.out.println("Number of Object created " + boxCount);
	}
}

public class StaticDataAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* The Static Data and Static Method's 
		 * 
		 * The static Data was not created when ever the object called for the particular class 
		 * usually when ever the class data's and methods was accessed by the that class Object at the 
		 * time Java was created the separate memory space for each Object for the particular class 
		 * 
		 * But if you give the keyword called static before the Data type as well as Method it was globally 
		 * created the memory not for the each Object called so what are the data type you want create only one
		 * time that class was created through Object you can use static 
		 * 
		 *  And you are not able to access the class data except static data type from static methods
		 *  
		 *  And from another class you want to access the static class or static Data types you want 
		 *  to use the {className.<static method name> or <static data variable name >}. */
		
		BoxStatic b1 = new BoxStatic();
		BoxStatic b2 = new BoxStatic();
		BoxStatic b3 = new BoxStatic();
		BoxStatic b4 = new BoxStatic();
		
		BoxStatic.boxCount();
	}

}
