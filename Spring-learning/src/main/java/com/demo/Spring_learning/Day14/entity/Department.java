package com.demo.Spring_learning.Day14.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    private int id;

    @Column
    private String name;

    @OneToMany(
            mappedBy = "department",
            cascade = CascadeType.PERSIST
    )
    private List<Employee> employees;

    public Department(){}

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
