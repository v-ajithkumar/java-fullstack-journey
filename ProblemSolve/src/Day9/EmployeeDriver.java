package Day9;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];

        emp[0] = new Employee(1,"arun",100);
        emp[1] = new Employee(1,"zack",200);
        emp[2]  = new Employee(1,"arthur",300);
        emp[3] = new Employee(1,"john",400);
        emp[4] = new Employee(1,"marston",500);

        printAllEmployee(emp);
        HighestSalary(emp);
        avgSalary(emp);
        countEmployee(emp);

    }
    static void printAllEmployee(Employee[] emp){
        System.out.println("Employee Details");
        for(Employee e : emp ){
            System.out.println(
                   "id : " + e.id + " name : " + e.name + " sal : " + e.salary
            );
        }
    }

    static void HighestSalary(Employee[] emp){
        Employee highest = emp[0];

        for (int i=1 ; i < emp.length ; i++){
            if(emp[i].salary > highest.salary){
                highest = emp[i];
            }
        }
        System.out.println("\nHighest Salary Employee");
        System.out.println(highest.id + " " + highest.name + " " + highest.salary);
    }

    static void avgSalary(Employee[] emp){
        double sum = 0;
        for(Employee e : emp){
            sum = sum + e.salary;
        }

        double avgSal = sum / emp.length;

        System.out.println("\nAvg salary of Employee is :");
        System.out.println(avgSal);
    }

    static void countEmployee(Employee[] emp){
        int count = 0;

        for(Employee e : emp){
            if(e.salary > 300){
                count++;
            }
        }

        System.out.println("\nCount of Employee Whose Salary is above 300");
        System.out.println(count);
    }
}
