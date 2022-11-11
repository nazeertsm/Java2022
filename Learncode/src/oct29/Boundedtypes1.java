package oct29;

public class Boundedtypes1 {
	
	
	class Test<T>
	{
		
	}
	Test <Integer> t1=new Test< Integer>();//valid
	Test <String> t2=new Test < String>();//valid
	
	/*Here as the type parameter we can pass any type and there are no restrictions hence
	it is unbounded type.*/

	public static void main(String[] args) {
	

	}

}



/*Bounded types
--------------------
We can bound the type parameter for a particular range by using extends keyword
such types are called bounded types.*/