package oct16;

import java.util.*;

class Test2 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		//Creating a key
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
//Adding the data to HashMap
		h.put(i1, "sachin");
		h.put(i2, "Messi");
		System.out.println(h);// {10=Messi}
	}
}