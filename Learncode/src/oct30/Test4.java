package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {

		List<Integer> nums4 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Stream<Integer> stream4 = nums4.stream();

		stream4.forEach(i -> System.out.println(i));
		//Once we use stream we cannot reuse it
		//stream4.forEach(i -> System.out.println(i)); //exception

	}

}
