package ProbSolve;

public class Prob1 {
    public static void main(String[] args) {
        //count vowels in a string
        String str = "aom";
        int count = 0 ;
        String vowels = "";
        System.out.println(str);
        for (int i =0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowels = vowels + ch;
                count++;
            }
        }
        System.out.println("vowels are : "+ vowels);
        System.out.println(count);
    }
}
