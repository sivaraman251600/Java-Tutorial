package OOPS;

class BlackBox{
	
	int length;
	int width;
	int height;
	
	BlackBox(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
	
	boolean isEqual(BlackBox a) {
		if(length == a.length && width == a.width && height == a.height) {
			return true;
		}
		
		return false;
	}
}

public class PassingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* When you are creating the objects you can pass this objects into another invoked object method 
		 * is called as Passing Objects */
		
		BlackBox box1 = new BlackBox(2, 3, 4);
		BlackBox box2 = new BlackBox(5, 6, 7);
		BlackBox box3 = new BlackBox(2, 3, 4);
		
		System.out.println(box1.isEqual(box2));
		System.out.println(box1.isEqual(box3));

	}

}
