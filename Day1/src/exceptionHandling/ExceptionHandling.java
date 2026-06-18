package exceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args){

        int a = 0;
        int b = 10;
        try{
            System.out.println(b/a); // ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
    }
}
