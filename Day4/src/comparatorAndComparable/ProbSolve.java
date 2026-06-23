package comparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Emp{
	private String name;
	private int sal;
	private String dept;
	
	Emp(String name, int sal, String dept){
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
public class ProbSolve {
	public static void main(String[] args) {
		
		List<Emp> l1 = Arrays.asList(new Emp("Arun",400,"IT"),new Emp("Kavin",200,"QA"),new Emp("Zack",300,"HR"),new Emp("Han",100,"HR"));
		
		//Salary descending
		l1.sort(Comparator.comparing(Emp::getSal).reversed());
		l1.forEach(n -> System.out.println("name : " + n.getName() + " sal : " + n.getSal() + " dept : " + n.getDept()));
		
//		Name ascending
		System.out.println("--------------------------");
		l1.sort(Comparator.comparing(Emp::getName));
		l1.forEach(n -> System.out.println("name : " + n.getName() + " sal : " + n.getSal() + " dept : " + n.getDept()));
		
//		Department then Salary
		System.out.println("--------------------------");
		l1.sort(Comparator.comparing(Emp::getDept).thenComparing(Emp::getSal));
		l1.forEach(n -> System.out.println("name : " + n.getName() + " sal : " + n.getSal() + " dept : " + n.getDept()));
		
		
//		Top 3 Highest Salaries
		System.out.println("--------------------------");
		l1.stream().sorted( Comparator.comparing(Emp::getSal).reversed()).limit(3).forEach(n -> System.out.println("name : " + n.getName() + " sal : " + n.getSal() + " dept : " + n.getDept()));
	}
}

