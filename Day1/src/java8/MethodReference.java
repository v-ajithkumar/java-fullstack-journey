package java8;

interface Test{
	void abc();
}

class Demo{
	static void func() {
		System.out.println("func method in demoClass");
	}
}

class Demo1{
	void func() {
		System.out.println("func method inside demo1");
	}
}
public class MethodReference {
	
	public static void main(String[] args) {
		Test obj = Demo::func;
		obj.abc();
		Test obj1 = new Demo1()::func;
		obj1.abc();
	}

	
}
