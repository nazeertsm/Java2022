package oct29;

//public class Note3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}


/*
Keypoints about bounded types
------------------------------------------
=> We can't define bounded types by using implements and super keyword
=> But implements keyword purpose we can replace with extends keyword.
eg: class Test<T implements Runnable>{}//invalid
class Test<T super String>{}//invalid
=> As the type parameter we can use any valid java identifier but it convention to
use T always.
eg: class Test<T>{}
class Test<iNeuron>{}
=> We can pass any no of type parameters need not be one.
eg: class HashMap<K,V>{}
HashMap<Integer,String> h=new HashMap<Integer,String>();
Which of the following are valid?Usage of Compartor will be discussed to work with "Descending order".
class Test <T extends Number&Runnable> {}//valid(first class and then interface)
class Test<T extends Number&Runnable&Comparable> {} //valid(first class and then
multiple interfaces)
class Test<T extends Number&String> {} //invalid(both are classes becoz multiple
inheritance through class is not supported)
class Test<T extends Runnable&Comparable> {}//valid (both are interfaces)
class Test<T extends Runnable&Number> {}//invalid(first class then interface)
 * 
 * 
 * */
