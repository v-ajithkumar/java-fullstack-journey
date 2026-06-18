package collectionFramework;

public class Treemap {
	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> t1 = new java.util.TreeMap<Integer, String>();
		t1.put(1, "Sam");
		System.out.println(t1);
		t1.put(2,"arun" );
		t1.put(3,null);
		System.out.println(t1);
	}
}
