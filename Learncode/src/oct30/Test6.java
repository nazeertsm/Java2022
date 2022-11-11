package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {

		List<Integer> nums6 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Predicate<Integer> predicate6 = n6-> n6%2==1;
			

		Stream<Integer> stream6 = nums6.stream();

	
		Stream<Integer> stream6_new = stream6.filter(predicate6);

		stream6_new.forEach(i -> System.out.println(i));

	}

}
