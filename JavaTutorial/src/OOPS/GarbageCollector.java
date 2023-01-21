package OOPS;

public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Garbage collection was already build inside in JVM this was used for the dereferencing the object when it's
		// not in use like.
		
		/* 1. when we create the class and we convert into an object and then we using the reference variable to access
		 * the object but if you are giving the null value to the reference variable, the garbage collector in JVM
		 * automatically deallocate the memory space for the which reference variable pointing the which object memory 
		 * 
		 * 2. you having the Two Object but it's pointing the same class, suppose the if you assign any one object
		 * another object it automatically deallocate the memory.
		 * 
		 * 3. if you are not assign the created object to the reference variable this one is also automatically 
		 * deallocated by the Garbage collector.
		 * 
		 * 4. If you want to finish any task before the garbage collector deallocate the memory space
		 * you need to put those methods in the protected format
		 * Ex: void protected finalize(){
		 *     ---- your methods before garbage collector deallocate the memory ---
		 *  } */
		
		Box b3 = new Box(2, 3, 5);
		Box b4 = new Box(7, 8, 9);
		
		//1. First dereference method
		b3 = null;
		
		//2. Second dereference method
		b4 = b3;
		
		//3. Third dereference method
		new Box(1, 1, 1);

	}

}
