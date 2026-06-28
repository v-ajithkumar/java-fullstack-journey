package com.demo.Spring_learning;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getEmployee(){
       return  "Employee fetched in Db......." ;
    }
}
