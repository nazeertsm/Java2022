package oct30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {

		List<Integer> nums8 = Arrays.asList(6, 5, 2, 8, 1, 9);

		Function<Integer, Integer> func =  n-> n*2;
					
		Stream<Integer> stream8= nums8.stream();

		
		Stream<Integer> stream8_new = stream8.filter( n8-> n8 % 2==1);

		// this case map change the value, take the value and give the value
		//map returns stream, for each returns nothing
		//create new stream value, original value not updated
		Stream<Integer> stream9= stream8_new.map(func);
		//Stream<Integer> stream9= stream8_new.map(n-> n*2);
		
		stream9.forEach(n -> System.out.println(n));

	}

}
