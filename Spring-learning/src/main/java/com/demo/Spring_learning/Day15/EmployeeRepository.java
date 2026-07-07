package com.demo.Spring_learning.Day15;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //derived query
     Employee findByName(String name);
     List<Employee> findByNameAndDepartment(String name, String Department);
     List<Employee> findByDepartmentOrAge(String department,int age);
     List<Employee> findBySalaryBetween(int min,int max);
     List<Employee> findBySalaryLessThan(int salary);
     List<Employee> findByNameLike(String pattern);
     List<Employee> findByNameContaining(String word);
     List<Employee> findByDepartmentIn(List<String> dept);
     List<Employee> findByDepartmentOrderBySalary(String dept);

    //JPQL query
    @Query("Select e from Employee e")
     List<Employee> getAllEmployee();

    @Query("Select e from Employee e where e.department = :dept")
     List<Employee> getEmployeeByDept(String dept);

    @Query("Select e from Employee e where e.salary > :sal and e.department = :dept")
    List<Employee> findEmployee(String dept,int sal);

    //Native Query
    @Query(value = "Select * from Employee", nativeQuery = true)
    List<Employee> getAllEmployeeByNativeQuery();

    //Pagination
    Page<Employee> findAll(Pageable pageable);
}
