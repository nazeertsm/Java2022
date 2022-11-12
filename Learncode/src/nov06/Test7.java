package nov06;

//1. Anonymous inner class that extends a class.
class PopCorn {
	public void taste() {
		System.out.println("spicy");
	}
}

class Test7 {
	public static void main(String[] args) {
		PopCorn p = new PopCorn() {
			public void taste() {
				System.out.println("salty");
			}
		};
		p.taste();// salty
		PopCorn p1 = new PopCorn();
		p1.taste();// spicy
	}
}
/*
Analysis:
1. PopCorn p=new PopCorn();
We are just creating a PopCorn object.
2. PopCorn p=new PopCorn(){
};
We are creating child class without name for the PopCorn class and for that
child class we are creating an object
with Parent PopCorn reference.
2. PopCorn p=new PopCorn()
{
@Override
public void taste(){
System.out.println("salty");
}
};
1. We are creating child class for PopCorn without name.
2. We are overriding taste() method.
3. We are creating object for that child class with parent reference.
Note:
Inside Anonymous inner classes we can take or declare new methods but outside of
anonymous inner classes we can't call these methods directly because we are
depending on parent reference.[parent reference can be used to hold child class
object but by using that reference we can't call child specific methods]. These
methods just for internal purpose only.*/