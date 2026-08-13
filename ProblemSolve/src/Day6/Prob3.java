package Day6;

//count digit
public class Prob3 {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        while (num > 0){
           int lastDigit = num % 10;
           count++;
           num = num  / 10;
        }
        System.out.println(count);
    }
}
