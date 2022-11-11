package oct16;

import java.util.*;

class Test5 {
	public static void main(String[] args) {
		Hashtable hm = new Hashtable();// Default capacity is 11
		hm.put(new Temp3(5), "A");
		hm.put(new Temp3(2), "B");
		hm.put(new Temp3(6), "C");
		hm.put(new Temp3(15), "D");
		hm.put(new Temp3(23), "E");
		hm.put(new Temp3(16), "f");
		System.out.println(hm);
	}
}

class Temp3 {
	int i;

	Temp3(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i;
	}

	public String toString() {
		return i + " ";
	}
}


