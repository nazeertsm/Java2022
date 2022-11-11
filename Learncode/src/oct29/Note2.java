package oct29;

//public class Note2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}


/*
 method can take object as the argument and hence we can add any type of object to the ArrayList.
Due to this we are not getting type safety.
The return type of get() method is object hence at the time of retrieval compulsory
we should perform type casting.
But in 1.5v a generic version of ArrayList class is declared as follows.
                   |=> Type parameter
class ArrayList<T>{
add(T t);
T get(int index)
}
Based on our requirement T will be replaced with our provided type.
For Example to hold only string type of objects we can create ArrayList object as
follows.
Example:
ArrayList<String> l=new ArrayList<String>();
For this requirement compiler considered ArrayList class is
Example:
class ArrayList<String>{
add(String s);
String get(int index);
}
add() method can take only string type as argument hence we can add only string
type of objects to the List.
By mistake if we are trying to add any other type we will get compile time error.
 * 
 * 
 * */
