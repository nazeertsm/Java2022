package oct29;
/*Case 2: Type-Casting
In the case of array at the time of retrieval it is not required to perform any
type casting */

import java.util.ArrayList;

public class TypeCasting {

	public static void main(String[] args) {

		String name[] =new String[500];
		name[0] = "Navin Reddy";
		name[1] = "Haider";
		;;;;
		;;;;
		String data =name[0];//here type casting is not required.
		
		/*But in the case of collection at the time of retrieval compulsory we should perform
		type casting otherwise we will get compile time error. */
		
		ArrayList al =new ArrayList();
		al.add("NavinReddy");
		al.add("Haider");
		//String name1= al.get(0);//CE: incompatible types : found : java.lang.Object	required:	java.lang.String
		String name1=(String) al.get(0);//At the time of retrieval type casting is		madantory

	}

}

