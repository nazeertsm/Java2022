package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test12 {

	public static void main(String[] args) {

		List<Integer> nums12 = Arrays.asList(6, 5, 2, 8, 1, 9);
		
		BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer s, Integer e) {
				System.out.println(s);
				
				return s+e;
			}
		};

		int result = nums12.stream()
				.filter(n8 -> n8 % 2 == 1)
				.map(n -> n * 2)
				.reduce(0, bi);

		System.out.println(result);

	}

}
