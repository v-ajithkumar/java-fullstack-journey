package ProbSolve;

public class Prob3 {
    public static void main(String[] args) {
        //remove duplicates
        String str = "banana";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
           for (int j=0 ; j < res.length() ; j++){
               if(res.charAt(j) == ch){
                   found = true;
                   break;
               }
           }
           if (!found){
               res = res + ch;
           }

        }
        System.out.println(res);
    }
}
