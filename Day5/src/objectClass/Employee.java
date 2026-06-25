package objectClass;

import java.util.Objects;

public class Employee{
	int id;
	String name;
	int sal;
	
	Employee(int id, String name, int sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employee [id: " + id + ", name : " + name + ", sal : " + sal  + " ]";
	}
	
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		return this.id == e.id && this.name.equals(e.name) && this.sal==e.sal;
	}
	
	public int hashCode() {
		return Objects.hash(id,name,sal);
	}
	
}
