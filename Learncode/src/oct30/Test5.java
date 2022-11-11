package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {

		List<Integer> nums5 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				if (n % 2 == 1)
					return true;
				else
					return false;
				//or	return n%2==1;
			}
		};

		Stream<Integer> stream5 = nums5.stream();

		// stream5_new, since stream5 we cannot reuse it
		Stream<Integer> stream5_new = stream5.filter(predicate);

		stream5_new.forEach(i -> System.out.println(i));

	}

}
