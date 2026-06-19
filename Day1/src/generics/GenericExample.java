package generics;

public class GenericExample {
	public static void main(String[] args) {
		Container<Integer> c1 = new Container<Integer>(10);
		c1.print();
		
		Container<Double> c2 = new Container<>(3.3);
		c2.print();
	}
}
