package oct29;

import java.util.ArrayList;

public class Collections1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("NavinReddy");
		al.add("Haider");
		al.add(new Integer(10));
		//;
		//;
		
		String name1 = (String) al.get(0);
		String name2 = (String) al.get(1);
		String name3 = (String) al.get(2);
		/*
		 * Exception in thread "main" ::java.lang.ClassCastException java.lang.Integer
		 * cannotbe cast to java.lang.String Hence we can't provide guarantee for the
		 * type of elements present inside collections that is collections are not safe
		 * to use with respect to type.
		 */

	}

}

/*
 * But collections are not type safe that is we can't provide any guarantee for
 * the type of elements present inside collection. For example if our
 * programming requirement is to hold only string type of objects it is never
 * recommended to go for ArrayList. By mistake if we are trying to add any other
 * type we won't get any compile time error but the program may fail at runtime
 */