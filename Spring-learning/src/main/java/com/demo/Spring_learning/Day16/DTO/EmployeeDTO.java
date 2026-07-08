package com.demo.Spring_learning.Day16.DTO;


import jakarta.validation.constraints.*;

public class EmployeeDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 3 , max = 30)
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;

    @Positive(message = "Salary must be positive")
    private double salary;

    @Min(18)
    @Max(60)
    private int age;

    public EmployeeDTO(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
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
