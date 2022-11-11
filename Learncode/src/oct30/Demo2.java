package oct30;

import java.util.ArrayList;
import java.util.Collections;

// to compare students, implements interface comparable for sorting
//<> what type of value working type student
class Student implements Comparable<Student>{
	int age;
	String name;
	String tech;
	
	public Student(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	//Instead of print hash code print the value using hash code
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	 public int compareTo(Student that) {
	
		 //	return this.age-that.age;
		 //	return that.age-this.age; to reverse the logic
		
		return this.name.compareTo(that.name);//compare string
		
	}
	
}
public class Demo2 {

	public static void main(String[] args) {

		//create array list using type student
		/*
		Student s1 = new Student(21, "Nagesh", "Java");
		
		ArrayList<Student> nums = new ArrayList<>();
		nums.add(s1);* or*/
		//passing object
		ArrayList<Student> s1 = new ArrayList<>();
		s1.add(new Student(21, "Nagesh", "Java"));
		s1.add(new Student(17, "Ashwini", "JS"));
		s1.add(new Student(18, "Souvik", "Blockchain"));
		System.out.println(s1);
		Collections.sort(s1);
		//21 17 18
		//17 21 18
		//17 18 21
		
		// 17 18 21
		System.out.println(s1);
		 

	}

}
