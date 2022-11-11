package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test7 {

	public static void main(String[] args) {

		List<Integer> nums7 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Predicate<Integer> predicate7;
			

		Stream<Integer> stream7= nums7.stream();

		// passing the value to n7-> n7%2==1 checking condition
		Stream<Integer> stream7_new = stream7.filter( n7-> n7%2==1); // replace predicate7

		stream7_new.forEach(i -> System.out.println(i));

	}

}
