package Stream.IntermidiateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class distinct {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 5);
		list.stream()
				.distinct().forEach(System.out::println);
	}
}
