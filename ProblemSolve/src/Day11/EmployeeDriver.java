package Day11;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
    public static void main(String[] args) {
        ArrayList<Employee2> emp = new ArrayList<>(List.of(
                new Employee2(101, "Rahul","IT",500),
                new Employee2(102,"Priya","HR",450),
                new Employee2(103,"John","IT",250),
                new Employee2(104,"Arthur","Finance",600)
        ));
        findEmployeesByDepartment(emp,"IT");
        findHighestSalaryEmployee(emp);
        increaseSalary("Finance",10 , emp);
        printEmployees(emp);
    }

    private static void printEmployees(ArrayList<Employee2> employess) {
        for (Employee2 emp : employess ){
            System.out.println(emp);
        }
    }

    private static void increaseSalary(String dept, int perc, ArrayList<Employee2> employees) {
        for (Employee2 emp : employees){
            double oldSal = emp.getSalary();
            double newSal = oldSal + (oldSal * perc/100);
            emp.setSalary(newSal);
        }
    }


    private static void findEmployeesByDepartment(ArrayList<Employee2> employees,String dept) {
        for(Employee2 em : employees){
            if(em.getDepartment().equals(dept)){
                System.out.println(em.getName());
            }
        }
    }

    private static void findHighestSalaryEmployee(ArrayList<Employee2> employees){
        double highestSal = 0;
        for(Employee2 emp : employees){
            if(emp.getSalary() > highestSal){
                highestSal = emp.getSalary();
            }
        }
        System.out.println(highestSal);
    }


}
