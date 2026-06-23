package comparatorAndComparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2(1, "Arun", 25);
		Employee2 e2 = new Employee2(4, "Kavin", 30);
		Employee2 e3 = new Employee2(3, "Selvin", 29);
		Employee2 e4 = new Employee2(2, "Arjun", 22);
		Employee2 e5 = new Employee2(5, "Kumar", 21);
		
		List<Employee2> employee = new ArrayList<Employee2>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		//comparable interface sort by id by using compareTo by override the method
//		List<Employee> emp = Arrays.asList(
//				new Employee(1,"Arun",25),
//				new Employee(4, "Kavin", 30),
//				new Employee(3, "Selvin", 29)
//				);
//		Collections.sort(employee)		
//		printEmp(emp);
		
		
		
		//comparator interface sort by id by using compare() override using lambda expression
		Collections.sort(employee, (o1, o2) -> {
		    if (o1.getId() > o2.getId()) {
		        return 1;
		    } else if (o1.getId() < o2.getId()) {
		        return -1;
		    } else {
		        return 0;
		    }
		});
		print(employee);
		
		//if we want we can also provide another implementation sort by age
		Collections.sort(employee, (o1, o2) -> {
		    if (o1.getAge() > o2.getAge()) {
		        return -1;
		    } else if (o1.getAge() < o2.getAge()) {
		        return 1;
		    } else {
		        return 0;
		    }
		});
		print(employee);
	
	}
	
	public static void printEmp(List<Employee> employeeList1) {
		for (Employee employee : employeeList1) {
			System.out.println("id : " + employee.getId() + " Name : " + employee.getName() 
			+ " age : " + employee.getAge() );
		}
	}
	public static void print(List<Employee2> employeeList2) {
		for (Employee2 employee : employeeList2) {
			System.out.println("id : " + employee.getId() + " Name : " + employee.getName() 
			+ " age : " + employee.getAge() );
		}
	}
}

