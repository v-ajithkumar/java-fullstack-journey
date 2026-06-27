package ProbSolve;

public class Employee {
    public static void main(String[] args) {
        //Employee salary report
        int[] salary = {25000, 45000, 18000, 52000, 30000};
        int count = 0;
        int salAbove30k =0 ;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > 30000){
                System.out.println(salary[i]);
                count++;
                salAbove30k = salAbove30k + salary[i];
            }
        }
        int avg = salAbove30k / count;
        System.out.println("count : " + count);
        System.out.println("avg sal : " + avg);
    }
}
