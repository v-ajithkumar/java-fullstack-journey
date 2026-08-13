package Day6;

public class Prob5 {
    public static void main(String[] args) {
        String s1 = "Java is fun";
        String[] words = s1.split(" ");
        for (int i = words.length-1 ; i>=0 ; i--){
            System.out.print(words[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}
