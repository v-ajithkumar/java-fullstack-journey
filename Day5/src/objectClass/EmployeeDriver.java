package objectClass;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Xavier", 100);
//		System.out.println(e1);
		Employee e2 = new Employee(3, "Arthur", 200);
		Employee e3 = e1;
		Employee e4 = new Employee(1, "Xavier", 100);
		
//		System.out.println(e3 == e4);
		System.out.println(e3.equals(e4));
//		
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
//		System.out.println(e1.getClass());
		
		
	}
}
