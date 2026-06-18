package exceptionHandling;

public class Voting {
	public static void main(String[] args) {
        int age = 17;
        ageVerify(age);
    }

   public static void ageVerify(int age){
        if (age < 18){
            try {
                throw new NotEligibleException();
            } catch (NotEligibleException ne) {
                System.out.println("You are not eligible for vote");
            }
        }

        else{
            try {
                throw new EligibleException();
            } catch (EligibleException e) {
                System.out.println("You are elible for voting");
            }
        }
    }
}
