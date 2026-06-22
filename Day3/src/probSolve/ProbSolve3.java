package probSolve;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String dept;
	
	Employee(String name,String dept){
		this.name=name;
		this.dept=dept;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDept() {
		return this.dept;
	}

	@Override
	public String toString() {
	    return name;
	}
	
}
public class ProbSolve3 {
	public static void main(String[] args) {
		
		//group employee by dept
		List<Employee> l1 = Arrays.asList(
				new Employee("Sam","101"),
				new Employee("Ram","102"),
				new Employee("Arun","103")
				);
		
		 Map<String, List<Employee>> res= 	l1.stream().collect(Collectors.groupingBy(Employee::getDept));
		 
		System.out.println(res);
	}
}
