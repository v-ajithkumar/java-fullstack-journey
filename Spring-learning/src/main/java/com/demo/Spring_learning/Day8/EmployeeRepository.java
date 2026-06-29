package com.demo.Spring_learning.Day8;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getEmployee(){
       return  "Employee fetched in Db......." ;
    }
}
