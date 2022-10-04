package sep24;
/*Note:
Immutable Object -> String,all wrapper classes (if we try to make a change, then with the change new object will be created)
 * */
public class ImmutableObject {

	public static void main(String[] args) {
	
		Integer x=10;
		Integer y=x;
		x++;
		System.out.println(x);//11
		System.out.println(y);//10
		System.out.println(x==y);//false
		
		
		//Snippets
		
		Integer a=new Integer(10);//new object
		Integer b=new Integer(10);//new object
		System.out.println(a==b);//false
		
		Integer c=new Integer(10);
		Integer d=10;
		System.out.println(c==d);//false
		
		Integer e=new Integer(10);
		Integer f=e;
		System.out.println(e==f);//true
		
		Integer g=10;
		Integer h=10;
		System.out.println(g==h);//true
		
		Integer j=100;
		Integer k=100;
		System.out.println(j==k);//true
		
		Integer m=1000;
		Integer n=1000;
		System.out.println(m==n);//false
		
		
		
		/*
		Note:
		byte,short,int,long,float,double the buffer concpet which internally jvm
		maintains is "byte range only".
		character -> 0 to 127
		Boolean -> always(true or false)*/
		
	}

}
