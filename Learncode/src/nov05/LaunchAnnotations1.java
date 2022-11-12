package nov05;


@FunctionalInterface
interface Addition
{
	void add();
	//int add(int a);
}

class Demo
{
	void getInfo()
	{
		System.out.println("Infor in parent");
	}
}

class Demo2 extends Demo
{
	@Override
	void getInfo()
	{
		System.out.println("Overided succesfully");
	}
}


public class LaunchAnnotations1 {

	public static void main(String[] args) {
		
		
		//Below code is adding two number 
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		//
		
		Demo2 d=new Demo2();
		d.getInfo();

	}

}



