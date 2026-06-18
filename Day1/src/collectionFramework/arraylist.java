package collectionFramework;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ram");
		a1.add("Sham");
		a1.add("Cool");
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
	}
}
