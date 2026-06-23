package comparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorMethods {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(1, "Zun", 25), new Employee(4, "Kavin", 30),
				new Employee(3, "Selvin", 29),new Employee(4, "Selvin", 36));
		
		emp.sort(Comparator.comparing(Employee::getName).reversed());
		emp.forEach(n-> System.out.println("id : "+ n.getId() + " name : " + n.getName() + " age : " + n.getAge() ) );
		
		System.out.println("------------------");
		emp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
		emp.forEach(n-> System.out.println("id : "+ n.getId() + " name : " + n.getName() + " age : " + n.getAge() ) );
		
		System.out.println("------------------");
		emp.sort(Comparator.comparing(Employee::getAge));
		emp.forEach(n-> System.out.println("id : "+ n.getId() + " name : " + n.getName() + " age : " + n.getAge() ) );
	}
}
