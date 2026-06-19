package java8;

@FunctionalInterface
interface A{
	void show(int a);
}

@FunctionalInterface
interface B{
	int add(int a,int b);
}

public class functionalInterface {
	public static void main(String[] args) {
//		A obj = new A() {
//			public void show() {
//				System.out.println("in show");
//			}
//		};
		
		A obj = (a) -> { //curly braces dont't need when it doesn't have many lines
			System.out.println("in show " + a);
		};
		
		obj.show(4);
		
//		B obj1 = (a,b) -> {
//			return a+b;
//		};
		
		B obj1 = (a,b) ->  a+b;
		
		int res = obj1.add(10, 20);
		
		System.out.println(res);
		
		
	}
}
