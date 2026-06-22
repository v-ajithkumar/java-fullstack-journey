package probSolve;

import java.util.LinkedHashMap;
import java.util.Map;

public class probSolve1 {
	public static void main(String[] args) {
		
		//first non repeated character
		String str = "swiss";
		Map<Character,Integer> m1 = new LinkedHashMap<Character,Integer>();
		
		for(char ch : str.toCharArray()) {
			m1.put(ch, m1.getOrDefault(ch, 0)+1);
		}
		
		for(var entry: m1.entrySet()) {
			if (entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
}
