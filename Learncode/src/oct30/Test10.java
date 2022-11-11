package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test10 {

	public static void main(String[] args) {

		List<Integer> nums10 = Arrays.asList(6, 5, 2, 8, 1, 9);
		
		//BinaryOperator<Integer> bi =(s, e)->s+e; 
				
		Stream<Integer> stream10 = nums10.stream();

		Stream<Integer> stream10_new = stream10.filter(n8 -> n8 % 2 == 1);

		Stream<Integer> stream11 = stream10_new.map(n -> n * 2);
		int result = stream11.reduce(0, (s, e)->s+e);
		
		System.out.println(result);


	}

}
