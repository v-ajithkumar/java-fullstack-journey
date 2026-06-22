package probSolve;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class probsolve2 {
	//second highest number using streams
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10,5,20,8,15);
		
		Integer secondHighest = l1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secondHighest);
	}
}
