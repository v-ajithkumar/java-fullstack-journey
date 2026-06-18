package collectionFramework;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1,"Sam");
		h1.put(null, null);
		h1.put(3,null);
		System.out.println(h1);
		System.out.println(h1.containsKey(3));
		System.out.println(h1.values());
	}
}
