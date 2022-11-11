package oct29;

public class Launch1 {

	public static void main(String[] args) {
		String name[] =new String[500];
		name[0] = "Navin Reddy";
		name[1] = "Haider";
		//name[2] = new Integer(100); //CE: incompatbile types found: java.lang.Integer
		//required: java.lang.String

	}

}


/*Case 1: Type-Safety
Arrays are always type safe that is we can give the guarantee for the type of
elements present inside array.
For example if our programming requirement is to hold String type of objects it is
recommended to use String array.
In the case of string array we can add only string type of objects by mistake if we
are trying to add any other type we will get
compile time error. */