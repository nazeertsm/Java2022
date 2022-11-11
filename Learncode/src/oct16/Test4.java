package oct16;

import java.util.*;

class Test4 {
	public static void main(String[] args) throws Exception {
		WeakHashMap hm = new WeakHashMap();
		Temp2 t = new Temp2();
		hm.put(t, "shri");
		System.out.println(hm);// {temp=shri}
		t = null;// Making eligible for Garbage Collection
		System.gc();// Triggering garbage collector thread to clean 't'
		Thread.sleep(5000);
		System.out.println(hm);// {}
	}
}

class Temp2 {
	@Override
	public String toString() {
		return "temp";
	}

	@Override
	public void finalize() {
		System.out.println("cleaning temp object");
	}
}