package Day6;

//count spaces
public class Prob4 {
    public static void main(String[] args) {
        String s1 = "Java is fun";
        int count = 0;

        for (int i=0; i < s1.length() ; i++){
            if(s1.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
