package OOPS;

class Box{
	
	int length; // Instance Variable
	int width;
	int height;
	
	// What ever the method you created in the class file that method name as same as to the class name
	// we called as constructor. or else it's just an method.
	
	// If you want to invoke the method you can always use the new keyword convert the class into object and use a dot
	// to access or invoke the method inside of the other class.
	
	Box(int l, int b, int c){ // constructor
		length = l;
		width = b;
		height = c;
	}
	
	// We are using the this pointer for we denote which object is used to invoke this method, that Object length
	// Width, Height.
	
	void setDimension(int l, int w, int h) { // This Pointer
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
	int FindArea() { // Method To Find Area of the given value's
		return length * width * height;
	}
	
//	void protected finalize() {
//		Box.FindArea();
//	}
	
}

public class MethodsCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// converting the class file into Object;
		
		Box b1 = new Box(5, 6, 4); // Object Creation
		
		int result = b1.FindArea();
		
		System.out.println("Result for B1 = " + result + " Sqrt mtr ");
		
		Box b2 = new Box(1,1,1);
		
		b2.setDimension(4, 5, 6);
		
		result = b2.FindArea();
		
		System.out.println("Result for B2 = " + result + " Sqrt mtr ");

}
}
