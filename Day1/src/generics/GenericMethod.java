package generics;

public class GenericMethod {
	public static void main(String[] args) {
		printData(10);
		printData("String");
	}
	
	public static <T> void printData(T data) {
		System.out.println(data);
	}
}
