package sep24;

public class AutoBoxing3 {
	
	
	static Integer I=null;//AutoBoxing(valueOf())
	//Integer I = Integer.valueOf(null);
	public static void main(String[] args) {
		
		//int i = I.intValue();	
		int i=I;//AutoUnBoxing(intValue())//NullPointer Exception

		System.out.println(i);//
		
	}
	

}
