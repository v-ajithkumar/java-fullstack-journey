package collectionFramework;

import java.util.HashMap;

//count frequency using HashMap
public class Prob1 {
	public static void main(String[] args) {
		String str = "programming";
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (h1.containsKey(ch)) {
				h1.put(ch, h1.get(ch)+1);
			}else {
				h1.put(ch, 1);
			}
		}
		System.out.println(h1);
		
	}
}
