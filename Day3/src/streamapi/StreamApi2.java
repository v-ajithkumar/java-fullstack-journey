package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person {" +
				", name =" + name + ", age = " + age;
	}
	
	

}

public class StreamApi2 {
	public static void main(String[] args) {

		// collect()
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Apple");
		List<String> list = fruits.stream().collect(Collectors.toList());
		System.out.println(list);

		Set<String> set = fruits.stream().collect(Collectors.toSet());
		System.out.println(set);

		//joining()
		String s1 = fruits.stream().collect(Collectors.joining(","));
		System.out.println(s1);

		// groupingBy()
		List<Person> person = Arrays.asList(new Person("john", 30), new Person("jane", 30), new Person("alisha", 25),
				new Person("tom", 25));

		Map<Integer, List<Person>> peopleByAge= person.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(peopleByAge);
		
		//max
		List<Integer> l2 = Arrays.asList(1,2,3,4,5);
		int ans = l2.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(ans);
		
		//min
		List<Integer> l3 = Arrays.asList(1,2,3,4,5);
		int ans2 = l2.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(ans2);
	}
}
