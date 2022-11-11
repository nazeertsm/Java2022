package oct29;

//public class Note3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}


/*
Generic methods with wildcard pattern
=================================
? => it is a wild chard symbol to indicate any type i can collect.
methodOne(ArrayList<String> l):
This method is applicable for ArrayList of only String type.
Example:
l.add("A");
l.add(null);
l.add(10);//(invalid)
Within the method we can add only String type of objects and null to the List.
methodOne(ArrayList<?> l):
We can use this method for ArrayList of any type but within the method we can't add
anything to the List except null.
Example:
l.add(null);//(valid)
l.add("A");//(invalid)
l.add(10);//(invalid)
This method is useful whenever we are performing only read operation.
methodOne(ArrayList<? Extends x> l):
If x is a class then this method is applicable for ArrayList of either x type or
its child classes.
If x is an interface then this method is applicable for ArrayList of either x type
or its implementation classes.
In this case also within the method we can't add anything to the List except null.
methodOne(ArrayList<? super x> l):
If x is a class then this method is applicable for ArrayList of either x type or
its super classes.
If x is an interface then this method is applicable for ArrayList of either x type
or super classes of implementation class of x.
But within the method we can add x type objects and null to the List.
eg: Runnable
|
Thread<==super class====== Object
Which of the following declarations are allowed?
1. ArrayList<String> l1=new ArrayList<String>();//valid
2. ArrayList<?> l2=new ArrayList<String>();//valid
3. ArrayList<?> l3=new ArrayList<Integer>();/valid
4. ArrayList<? extends Number> l4=new ArrayList<Integer>();//valid
5. ArrayList<? extends Number> l5=new ArrayList<String>();//invalid(String and
Number no relationship)
6. ArrayList<?> l6=new ArrayList<? extends Number>(); //invalid becoz of <? extends
Number is right hand side>
7. ArrayList<?> l7=new ArrayList<?>(); //invalid
Declaring type parameter at class level
================================
class Test<T>{
We can use anywhere this 'T'.
}
Declaring type parameter at method level
===================================
We have to declare just before return type.
Which of the following declarations are allowed?
public<T> void methodOne1(T t){} //valid
public<T extends Number> void methodOne2(T t){}//valid
public<T extends Number&Comparable> void methodOne3(T t){}//valid
public<T extends Number&Comparable&Runnable> void methodOne4(T t){}//valid
public<T extends Number&Thread> void methodOne(T t){}//invalid(2 classes extends
not possible)
public<T extends Runnable&Number> void methodOne(T t){}//invalid(first interface
not possible)
public<T extends Number&Runnable> void methodOne(T t){}//valid
 * 
 * 
 * */
