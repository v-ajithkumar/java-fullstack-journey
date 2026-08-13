package Day6;

//rev the String
public class Prob1 {
   public static void main(String[] args) {

        String s1 = "ajith";
        StringBuilder res = new StringBuilder();

        for (int i=s1.length() -1 ; i>=0 ; i--){
            res.append(s1.charAt(i));
        }

        System.out.println(res);
    }
}
