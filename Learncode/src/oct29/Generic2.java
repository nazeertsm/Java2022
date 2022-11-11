package oct29;

import java.util.ArrayList;

public class Generic2 {

	public static void main(String[] args) {

		ArrayList<String> al =new ArrayList<String>();
		al.add("NavinReddy");
		//al.add(10);//CE: can't find symbol symbol: method add(int)location : classjava.util.ArrayList<java.lang.String>
		

		
		ArrayList<String> al3 =new ArrayList<String>();
		al3.add("NavinReddy");
		String name = al3.get(0);//type casting is not requried
		
		/*Hence through generics we are getting type safety.
At the time of retrieval it is not required to perform any type casting we can
assign its values directly to string variables.*/
		
	}

}


/*add() method can take only string type as argument hence we can add only string
type of objects to the List.
By mistake if we are trying to add any other type we will get compile time error.*/


/*
But in 1.5v a generic version of ArrayList class is declared as follows.
				|=> Type parameter

class ArrayList<T>{
add(T t);
T get(int index)
}


Based on our requirement T will be replaced with our provided type.
For Example to hold only string type of objects we can create ArrayList object as
follows.

Example:
ArrayList<String> l=new ArrayList<String>();
For this requirement compiler considered ArrayList class is
Example:
class ArrayList<String>{
add(String s);
String get(int index);

}
*/