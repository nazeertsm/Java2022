package oct30.sam;

public class Student2 {
	int age;
	String name;
	String tech;

	public Student2(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	// Instead of print hash code print the value using hash code
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int compareTo(Student2 that) {

		// return this.age-that.age;
		// return that.age-this.age; to reverse the logic

		return this.name.compareTo(that.name);// compare string

	}

}
