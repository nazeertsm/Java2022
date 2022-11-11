package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> nums2 = Arrays.asList(6, 5, 2, 8, 1, 7);

		Stream<Integer> stream = nums2.stream();
		Consumer<Integer> consumer = new Consumer<Integer>() {
			// i value coming from stream one by one
			public void accept(Integer i) {

				System.out.println(i);

			}

		};

		stream.forEach(consumer);
		;

	}

}
