package Day11;



public class Employee2 {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee2(int id,String name,String department,double salary){
        this.department=department;
        this.id=id;
        this.name=name;
        this.salary=salary;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "emp id : " + id + ",name : " + name + ", dept : " + department + ", sal : " + salary;
    }
}
