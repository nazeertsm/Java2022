package sep24;

public class Launch2 {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		System.out.println(i1); //i1.toString() -> 10
		
		//Note: equals() method is also overriden in all Wrapper class to compare the content.
		System.out.println(i1.equals(i2));//true
		
	}

}
