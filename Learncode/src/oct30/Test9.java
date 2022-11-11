package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {

		List<Integer> nums9 = Arrays.asList(6, 5, 2, 8, 1, 9);
		BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer s, Integer e) {

				System.out.println(s + "+" + e);
				return s + e;
			}
		};
		Stream<Integer> stream9 = nums9.stream();

		Stream<Integer> stream9_new = stream9.filter(n8 -> n8 % 2 == 1);

		Stream<Integer> stream10 = stream9_new.map(n -> n * 2);
		stream10.reduce(0, bi);

		// stream10.forEach(n -> System.out.println(n));

	}

}
