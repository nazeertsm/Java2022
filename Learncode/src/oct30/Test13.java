package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test13 {

	public static void main(String[] args) {

		List<Integer> nums13 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer n) {
				System.out.println(n);
				return n * 2;

			}

		};
//for multiple thread, parellel sreeam we can use
			int result =nums13.parallelStream()
		.filter(n8 -> n8 % 2 == 1)
		.map(fun)
		.reduce(0, (s, e)->s+e);

		System.out.println(result);

	}

}
