package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prob2 {
    //Sort Employees by Salary
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("arun",500),
                new Employee("arthur",200)
                );

        list.sort(Comparator.comparing(Employee::getSal));
        list.forEach(n-> System.out.println("Name is : " + n.getName() + " sal is : " + n.getSal()));

    }
}
