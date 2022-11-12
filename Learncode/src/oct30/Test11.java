package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test11 {

	public static void main(String[] args) {

		List<Integer> nums11 = Arrays.asList(6, 5, 2, 8, 1, 9);

		int result = nums11.stream()
				.filter(n8 -> n8 % 2 == 1)
				.map(n -> n * 2)
				.reduce(0, (s, e) -> s + e);

		System.out.println(result);

	}

}
