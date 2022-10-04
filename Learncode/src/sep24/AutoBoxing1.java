package sep24;

/*Automatic conversion of primitive type to wrapper type done by the compiler is
called "AutoBoxing".*/
public class AutoBoxing1 {

	public static void main(String[] args) {
		
		Integer i1= new Integer(10);
		int i2 = i1;
		/*
		|
		|Compiler will do the following change
		|
		int i2= i1.intValue();
		/*Automatic conversion of wrapper type to primtive type done by the compiler is
		called "AutoUnBoxing"*/

		//**************************************
		
	
		
		
	}
	

}

/*
================================
valueOf() -> To convert String/primitive to Wrapper Object
xxxxValue() -> To convert Wrapper to primitive type.
Integer i = 10;
|
|compiler will make the following change
|
Integer i = Integer.valueOf(10);
*/