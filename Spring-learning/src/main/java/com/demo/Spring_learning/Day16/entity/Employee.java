package com.demo.Spring_learning.Day16.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee2")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private double salary;

    public Employee(){

    }
    public Employee(int eid, String name, String email, double salary) {
        this.eid = eid;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
