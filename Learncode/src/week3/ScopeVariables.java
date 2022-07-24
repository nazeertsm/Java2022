package week3;

public class ScopeVariables {

	// age is instance variable, ( with in class), Not mandatory to initialize the
	// value;
	int age = 20; //if any object created for ScopeVariables, age memory allocated in Heap area

	void display() {

		// rollNo --local variable, Mandatory to initialize, if not initialize error
		// will thrown
		// during compile
		int rollNo = 12; //Memory allocated at the in stack at the time of stack record creation
		System.out.println(rollNo);
	}

	public static void main(String[] args) {

		/*
		 * ref---> obj[Heap] reference variable , referring to object( ref pointed to
		 * heap area memory location), "if no reference is pointed to heap area, garbage
		 * collection look in to heap and delete the memory",
		 * "object of class ,instance of class are same"-
		 * "create a object, instantiation of the object are same"
		 */
		ScopeVariables ref = new ScopeVariables(); // Memory will be allocated to heap area
		
		//"display Method record will be created in stack, once method executed completely, if control return to main method,
		// or method executed completely, display record will will be deleted from stack" 
			
		// "Garbage collection responsible for Heap area, Not stack area"
		ref.display();
	}

}
