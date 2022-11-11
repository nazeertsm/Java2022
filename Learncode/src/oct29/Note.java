package oct29;

public class Note {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



/*
Conclusions
=========
1. Polymorphism concept is applicable only for the base type but not for parameter type
[usage of parent reference to hold child object is called polymorphism].
|-> basetype
eg: ArrayList<String> al =new ArrayList<String>();
							|=> parameter type
List<String> al =new ArrayList<String>();
Collection<String> al =new ArrayList<String>();
Collection<Object> al =new ArrayList<String>();//CE: incompatible types

2.
Collections concept applicable only for objects , Hence for the parameter type we
can use any class or interface name but not primitive
value(type).Otherwise we will get compile time error.
eg: ArrayList<int> al =new ArrayList<int>();//CE: unexcpected type found:primitive required: reference*/