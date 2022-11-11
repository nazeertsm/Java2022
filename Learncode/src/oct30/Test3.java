package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> nums3 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Stream<Integer> stream3 = nums3.stream();

		//Consumer<Integer> consumer3 = (Integer i) -> {
		Consumer<Integer> consumer3 = i -> {

			System.out.println(i);

		};

		stream3.forEach(consumer3);
		//stream3.forEach(i->System.out.println(i));
		
		;

	}

}
