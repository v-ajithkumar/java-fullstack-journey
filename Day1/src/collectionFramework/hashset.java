package collectionFramework;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<Integer>() ;
		s1.add(10);
		s1.add(1);
		s1.add(10);
		s1.add(2);
		s1.add(5);
		System.out.println(s1);
	}	
}
