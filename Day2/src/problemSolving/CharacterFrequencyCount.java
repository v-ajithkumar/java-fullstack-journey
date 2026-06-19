package problemSolving;

import java.util.Arrays;

public class CharacterFrequencyCount {
	public static void main(String[] args) {
		String str = "programming";
		countCharacter(str);
	}

	public static void countCharacter(String str) {
		boolean[] visited = new boolean[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (visited[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
					visited[j]=true;
				}
			}
			char ch = str.charAt(i);
			System.out.println(ch + " " + count);
		}
		
//		System.out.println(Arrays.toString(visited));
	}
}
