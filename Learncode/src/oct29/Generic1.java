package oct29;

import java.util.ArrayList;

/*To hold only string type of objects we can create a generic version of ArrayList as follows.
 * */
public class Generic1 {

	public static void main(String[] args) {

		ArrayList<String> al =new ArrayList<String>();
		al.add("NavinReddy");
		//al.add(10);//CE: can't find symbol	incompatible type: required java.lang.String found:	int
		
		
		ArrayList<String> al2 =new ArrayList<String>();
		al2.add("NavinReddy");
		;;;;
		;;;;
		String name =al2.get(0);//type casting is not required as it is an TypeSafe
		//That is through generic syntax we can resolve type casting problems

	}

}


/*That is in collections type casting is bigger headache.
To overcome the above problems of collections(type-safety, type casting)sun people
introduced generics concept in 1.5v
hence the main objectives of generics are:
1. To provide type safety to the collections.
2. To resolve type casting problems.

For this ArrayList we can add only string type of objects by mistake if we are
trying to add any other type we will get compile time error
that is through generics we are getting type safety.
At the time of retrieval it is not required to perform any type casting we can
assign elements directly to string type variables.

*/