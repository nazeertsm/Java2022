package sep24;

public class Launch1 {

	public static void main(String[] args) {
		
/*
Wrapper class
==========
The need of wrapper class is to wrap primtives into objects,so that we can handle
primitives also
just like Objects.
Constructor summary
===============
	byte -> Byte(byte,String)
	short-> Short(short,String)
	int -> Integer(int,String)
	long -> Long(long,String)
	float -> Float(float,String,Double)
	double->Double(double,String)
	----------------------------------------
char-> Character(char)
boolean->Boolean(boolean,String)
Note: In all wrapper class toString() is overriden to return the content
Object class method
===============
		public class Object{
		public String toString(){
		//return the reference of the Object
		}
public boolean equals(Object o){
//compares the reference
}
}
	public final class String{
	@Override
	public String toString(){
	//returns the content of the Object
	}
@Override
public boolean equals(Object o){
//compares the content of the String
}
}
Note: equals() method is also overriden in all Wrapper class to compare the
content.
	public final class Integer{
	@Override
	public String toString(){
	//returns the content of the Object
	}
	@Override
	public boolean equals(Object o){
	//compares the content.
	}
}
eg#1.
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i1); //i1.toString() -> 10
		System.out.println(i1.equals(i2));//true
		Setter methods and Getter Methods
==========================
public void setXXXX(XXXX data){
}
public XXXX getXXXX(){
}
Usage of Wrapper class
---------------------------
utility method(helper methods/static methods)
	1.valueOf()
	2.XXXXValue()
	3.parseXXX()
	4.toString()
	1.valueOf()
signature: public static wrapper valueOf(primtive data)
		public static wrapper valueOf(String data)
		It is used to create wrapper object for the given primtive or String type of
		data.
		It is alternative to constructor,but good practise is to use valueOf() only.
eg#1.
//constructor usage of Wrapper class to create Wrapper Object
		Integer i1= new Integer(10);
		Integer i2= new Integer("10");
		//usage of utility methods to create Wrapper Objet
		Integer i3= Integer.valueOf(10);
		Integer i4= Integer.valueOf("10");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println();
		System.out.println(i3);
		System.out.println(i4);
output
10
10
10
10
Note: valueOf() is also a part of Character class.
eg#2.
	Integer i1=Integer.valueOf(10);
	Double d1= Double.valueOf(10.5);
	Boolean b1=Boolean.valueOf("Nitin");
	Character c1=Character.valueOf('a');
	System.out.println(i1);//10
	System.out.println(d1);//10.5
	System.out.println(b1);//false
	System.out.println(c1);//a
	2.xxxxValue()
	We can use xxxxValue() to convert wrapper to prmitive type.
	Every Number type wrapper class(Byte,Short,Integer,Long,Float,Double)
	contains the
following 6 xxxxValue() method to convert the wrapper object to primitive
type.
Number
Byte
Short
Integer
Long
Float
Double
Character
Boolean
	eg#1.
	Integer i=new Integer(130);
	System.out.println(i.byteValue());//-126
	System.out.println(i.shortValue());//130
	System.out.println(i.intValue());//130
	System.out.println(i.longValue());//130
	System.out.println(i.floatValue());//130.0
	System.out.println(i.doubleValue());//130.0
	Note: 130 is not in the range of byte so jvm will perform operation in the
	following manner
	range = -128 to 127
	result = -128,-127,-126
	last value will be stored.
	eg#2.
	Character c1=new Character('c');
	char c2= c1.charValue();
	System.out.println(c2);//c
	Boolean b1=new Boolean("nitin");
	Boolean b2=b1.booleanValue();
	System.out.println(b2);//false
3.parseXXX()
Every wrapper class except Character class Contains parseXXXX() to
convert String to
Corresponding primtive type.
signature: public static xxxx parseXXX(String data)
eg#1.
	int i1= Integer.parseInt("10");
	System.out.println(i1);//10
	boolean b1=Boolean.parseBoolean("TrUE");
	System.out.println(b1);//true
	short s1=Short.parseShort("Ten");
	System.out.println(s1);//NumberFormatException
	4. toString()
	We can use toString() to convert wrapper object/primitve data to
	String.
	signature: public static String toString(XXXX data)
	public static String toString(xxxx data)
eg#1.
	Integer i=Integer.valueOf("10");
	System.out.println(i);//10(in String format)
	System.out.println(i.toString());//10(in String format)
	System.out.println();
	String s1=Integer.toString(10);
	String s2= Boolean.toString(true);
	String s3= Character.toString('a');
	System.out.println(s1);//10(in string format)
	System.out.println(s2);//true(in string format)
	System.out.println(s3);//a(in string format)
	refer :diagram for conversion chart
	AutoBoxing and AutoUnBoxing(JDK1.5V)
================================
valueOf() -> To convert String/primitive to Wrapper Object
xxxxValue() -> To convert Wrapper to primitive type.
Integer i = 10;
|
|compiler will make the following change
|
Integer i = Integer.valueOf(10);
Automatic conversion of primitive type to wrapper type done by the compiler is
called "AutoBoxing".
Integer i1= new Integer(10);
int i2 = i1;
|
|Compiler will do the following change
|
int i2= i1.intValue();
Automatic conversion of wrapper type to primtive type done by the compiler is
called "AutoUnBoxing".
Autoboxing and UnBoxing
===================
	eg#1.
	class TestApp
	{
	static Integer I=10;//AutoBoxing(valueOf())
	public static void main(String[] args)
	{
	int i=I;//AutoUnBoxing(intValue())
	System.out.println(i);//10
	}
	}
eg#2.
class TestApp
{
static Integer I=0;//AutoBoxing(valueOf())
public static void main(String[] args)
{
int i=I;//AutoUnBoxing(intValue())
System.out.println(i);//0
}
}
	eg#3.
	class TestApp
	{
	static Integer I=null;//AutoBoxing(valueOf())
	public static void main(String[] args)
	{
	int i=I;//AutoUnBoxing(intValue())//NullPointer Exception
	System.out.println(i);//
}
}
a. null
b. 0
c. CE
d. NumberFormatException
e. NullPointerException
f. None of the above
	Note:
	Immutable Object -> String,all wrapper classes
	(if we try to make a change, then with the
	change new object will be created)
	Integer x=10;
	Integer y=x;
	x++;
	System.out.println(x);//11
	System.out.println(y);//10
	System.out.println(x==y);//false
Snippets
======
	Integer x=new Integer(10);//new object
	Integer y=new Integer(10);//new object
	System.out.println(x==y);//false
	Integer x=new Integer(10);
	Integer y=10;
	System.out.println(x==y);//false
	Integer x=new Integer(10);
	Integer y=x;
	System.out.println(x==y);//true
	Integer x=10;
	Integer y=10;
	System.out.println(x==y);//true
	Integer x=100;
	Integer y=100;
	System.out.println(x==y);//true
	Integer x=1000;
	Integer y=1000;
	System.out.println(x==y);//false
Note:
byte,short,int,long,float,double the buffer concpet which internally jvm
maintains is "byte range only".
character -> 0 to 127
Boolean -> always(true or false)

==============================
for INTEGER buffer is -127to 127
For other data types also same Range sir?
For all Wrapper classes buffer range is of byte only.
Character -> 0 to 127
Boolean -> true, false
sir, diff. b/w buffer and array r they same?
Array -> objects which we should create
buffer-> programmer won't create rather jvm will create for performance.
sir u said that wrapper classes are immutable but how value of x is changed in code
snippet that u explained
Integer x= 10;(immutable)
Integer y =x;(immutable)
x++;//x = x+1(since it is immutable change won't happen in the same object
rather change will happen and new object will be
created)
for boolean type, in a java class when we write boolean/Boolean, both are
considered same,
which is not the same with other datatypes, why?
That is the convention Oracle team /SunMicroSystem team had followed.
one interview qst i got..
wap to get only integer number if any other number or char it should throw error...
in short only integer is allowed
logical question through if else.
in string you have SCP like we have for Wrapper classes also
String => SCP
Wrapper class -> Buffer of range byte
sir can u explain about capacity method in StringBuffer class
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());//16(it indicates the no of characters
which can be stored)
StringBuffer sb=new StringBuffer("sachin");
System.out.println(sb.capacity());// capacity = 16 + length of String
16 + 6
= 22
StringBuffer sb=new StringBuffer(10);
System.out.println(sb.capacity());//capacity = 10
If we use value of method explicitly buffer won't be created right?
Integer i1 =new Integer(10);
Integer i2 =new Integer(10);
System.out.println(i1==i2);//false
vs
Integer i1=10;//Autoboxing(valueOf())
Integer i2=10;//Autoboxing(valueOf())
System.out.println(i1==i2);//true
Sir buffer which jvm is creating and the StringBuffer class which we used in
Mutable concept are same or different?
Buffer -> Wrapper class and StringBuffer Class buffer are different.
what are different ways to create objects?
a. new
b. instanceOf()
c. Using Factory methods like valueOf()
d. using clone()
Integer i1=10; will this create any object?
First time it will use the object already available in Buffer.
sir for string we have same value it will refer same object but in wrapper class
if we have same value using new keyword is different?
String s1=new String("sachin");
String s2=new String("sachin");
vs
Integer i1=new Integer(10);
Integer i2=new Integer(10);
Question
sir interface methods implemented in class those methods by default public or
default in class..
and interface methods implemented in abstract class those methods are by default
public or
default in abstract class becoz in abstract class all the methods are public by
default
abstract class Bank{'
// it is default
abstract void depositAmount();
abstract long withDrawAmount();
abstract String giveCheque();
void giveNotification(){
//implementation
}
}
vs
interface Bank{
//abstract and public
void depositAmount();
long withDrawAmount();
String giveCheque();
}
Will the valueOf() create an object in buffer ?
it will use the Object, but can't create an object inside buffer
Double c=2.0;//not in range of byte
Double cc=2.0;//not in range of byte
System.out.println(c==cc); It's giving false
Sir,In Eclipse can we run the program in .class file without .java file?
yes possible using war/jar file approach using maven tools..
Integer i1=10 by default it is valueof(10) to convert primitive to wrapper class or
by default it is
Integer i1=new Integer(10)?
Integer i1=10;
compiler will make
Integer i1=Integer.valueOf(10);
is there any way to increase the size of buffer like we have ensureCapacity in
strings
Not possible
String is immutable how can you explain with Memomery also?
String s=new String("sachin");
s.concat("tendulkar");
System.out.println(s);// sachin
when auto unboxing comes into picture?
Integer i1=new Integer(10);
int i2=i1;
or
public void m1(int i){//AutounBoxing
System.out.println(i);
}
Integer i=10;//autoboxing
m1(i);
Question
string is an type of object and wrapper is also used to wrap string or primitive to
an object,
then both things are quite similar,can u please explain me
String firstInput = "10";//String
String secondInput = "20";//String
String result = Integer.value(firstInput)+ Integer.valueOf(secondInput);
System.out.println(result);//30
wrapper buffer is part of stack or heap?
heap.
How to print address of object?
Integer i = new Integer(10);
System.out.println(i);//i.toString() prints data
String s1= new String("sachin");
String s2=s1.concat("tendulkar");
System.out.println(s1);//sachin
System.out.println(s2);//sachintendulkar
Question
String str1="10";
String str2="20";
String res1 = Integer.valueOf(str1) + Integer.valueOf(str2);//CE
Yesterday you come with 2 interface class with same signature implementing class
had override function with super class could you explain it once again again sir?.
because i missed it some where
interface Right{
default void m1(){
System.out.println("hiee");
}
}
interfae Left{
default void m1(){
System.out.println("hello");
}
}
class TestImpl implements Left,Right{
@Override
public void m1(){
System.out.println("byee");
Left.super.m1();//hello
Right.super.m1();//hiee
}
	public static void main(String[] args){
	Left l =null;
	l.m1();//CE
	TestImpl t = new TestImpl();
	t.m1();//byee
	Left l =new TestImpl();
	l.m1();//byee
	}
	}
interface Right{
default void m1(){
System.out.println("hiee");
}
}
interfae Left{
default void m1(){
System.out.println("hello");
}
}
class TestImpl implements Left,Right{}//Compile Time Error
can u explain casting between wrappers..?
Casting to happen we need to have parent child relationship, but wrapper
classes are siblings for Number class.
interface Left{
public void m1();
}
interface Right{
public void m1();
}
public class TestImpl implments Left,Right{
@Override
public void m1(){
}
}
public final class Integer extends Number
Integer is extending Number class then how they are siblings
Number
|-> Byte
|-> Short
|-> Integer

=========================================


			
			
 */
	}

}
