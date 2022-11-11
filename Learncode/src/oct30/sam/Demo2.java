package oct30.sam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparatorImpl implements Comparator<Student2>{
	
	public int compare(Student2 m1,  Student2 m2) {
		return m1.age-m2.age;
		
		
	}
}
public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Student2> s2 = new ArrayList<>();
		s2.add(new Student2(21, "Nagesh", "Java"));
		s2.add(new Student2(17, "Ashwini", "JS"));
		s2.add(new Student2(18, "Souvik", "Blockchain"));
		System.out.println(s2);
		
		Comparator<Student2> com = new ComparatorImpl();
		Collections.sort(s2, com);

		System.out.println(s2);

	}

}
