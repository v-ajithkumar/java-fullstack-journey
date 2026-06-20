package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProbSolve {
	public static void main(String[] args) {
		//Print even number
		List<Integer> l1 = Arrays.asList(5,4,3,2,1,5,4,3);
//		l1.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		
		//odd number
//		l1.stream().filter(n -> n%2==1).forEach(n -> System.out.println(n));
		
		//distinct element
//		l1.stream().distinct().forEach(n -> System.out.println(n));
		
		//sort ascending
//		l1.stream().distinct().sorted().forEach(n -> System.out.println(n));
		
		//sort descending
//		l1.stream().distinct().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
		
	}
}
