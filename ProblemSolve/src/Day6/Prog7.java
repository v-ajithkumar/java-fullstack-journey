package Day6;

//count frequency
public class Prog7 {
    public static void main(String[] args) {
        String s1 = "Java is fun";
        boolean[] check = new boolean[s1.length()];
        for (int i=0 ; i<s1.length() ; i++){
            if(check[i]){
                continue;
            }
            int count = 0;
            for (int j=0 ; j < s1.length() ; j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    count++;
                    check[j] = true;
                }
            }
            if(s1.charAt(i) != ' '){
                System.out.println(s1.charAt(i) + " " + count);
            }

        }
    }
}
