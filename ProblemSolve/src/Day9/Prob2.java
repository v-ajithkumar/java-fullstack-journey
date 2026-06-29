package Day9;

public class Prob2 {
    public static void main(String[] args) {
        //String Count
        String str = "aaaabbccdd";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean alreadyCounted = false;

            for (int k=0 ; k<i; k++){
                if(ch == str.charAt(k)){
                    alreadyCounted =true;
                    break;
                }
            }
            if(alreadyCounted){
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length() ; j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + ": " + count);



        }
    }
}
