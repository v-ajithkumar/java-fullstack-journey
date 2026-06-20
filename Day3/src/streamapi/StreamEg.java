package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEg {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,1,2,2,3,3,4,5,4,3);
//		System.out.println(l1);
		
//		Stream<Integer> myData = l1.stream();
//		myData.forEach(n -> System.out.println(n));
		
		//sort the values in the list
//		Stream<Integer> sorted=myData.sorted();
//		sorted.forEach(n -> System.out.println(n));
		
		//count how many values
//		long res = myData.count();
//		System.out.println(res);
		
		//map
//		Stream<Integer> data = l1.stream();
//		Stream<Integer> doubledData = data.map(n -> n*2);
//		doubledData.forEach(n -> System.out.println(n));
		
		//filter and sort and map (for double the value)
//		l1.stream()
//			.filter(n -> n%2==0)
//			.sorted()
//			.map(n -> n*2)
//			.forEach(n -> System.out.println(n));
		
		//reduce the values to one 
//		int res = l1.stream()
//			.filter(n -> n%2==0)
//			.sorted()
//			.map(n -> n*2)
//			.reduce(0,(c,e)->c+e);
//		System.out.println(res);
		
		//distinct
//		Stream<Integer> distincValues = l1.stream().distinct();
//		distincValues.forEach(n -> System.out.println(n));
		
		//distinct
//		Stream<Integer> distincValues = l1.stream().distinct().limit(3);
//		distincValues.forEach(n -> System.out.println(n));
	}
}
