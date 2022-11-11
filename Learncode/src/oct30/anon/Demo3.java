package oct30.anon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
class ComparatorImpl implements Comparator<Student3>{
	public int compare(Student3 n1,  Student3 n2) {
		return n1.age-n2.age;
					

}*/
public class Demo3 {

	public static void main(String[] args) {

		ArrayList<Student3> s3 = new ArrayList<>();
		s3.add(new Student3(21, "Nagesh", "Java"));
		s3.add(new Student3(17, "Ashwini", "JS"));
		s3.add(new Student3(18, "Souvik", "Blockchain"));
		System.out.println(s3);
		//anonymous class, Lambda expression	
		//Comparator<Student3> com2 = (Student3 n1,  Student3 n2) ->n1.age-n2.age;
		//Comparator<Student3> com2 = (n1,  n2) ->n1.tech.length()-n2.tech.length();
		Comparator<Student3> com2 = (n1,  n2) ->n1.age-n2.age;
					
		;
		Collections.sort(s3, com2);
		//Collections.sort(s3, Comparator<Student3> com2 = (n1,  n2) ->n1.age-n2.age);

		System.out.println(s3);

	}

}
