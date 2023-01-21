package OOPS;

class DoubleBox{
	int length;
	
	DoubleBox(int l){
		length = l;
	}
	
	DoubleBox makeDoubleTheValue() {
		DoubleBox b2 = new DoubleBox(2*length);
		return b2;
	}
}

public class ReturningObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleBox b1 = new DoubleBox(15);
		
		DoubleBox b3 = b1.makeDoubleTheValue();
		
		System.out.println(b3.length);

	}

}
