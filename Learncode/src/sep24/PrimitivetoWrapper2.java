package sep24;
/*
1.valueOf()
signature: public static wrapper valueOf(primtive data)
			public static wrapper valueOf(String data)
It is used to create wrapper object for the given primtive or String type of

data.
It is alternative to constructor,but good practise is to use valueOf() only
*/

public class PrimitivetoWrapper2 {

	public static void main(String[] args) {

		Integer i1 = Integer.valueOf(10);
		Double d1 = Double.valueOf(10.5);
		Boolean b1 = Boolean.valueOf("Nitin");//Apart from true, all result-false
		Character c1 = Character.valueOf('a');
		
		System.out.println(i1);// 10
		System.out.println(d1);// 10.5
		System.out.println(b1);// false
		System.out.println(c1);//a

	}
}