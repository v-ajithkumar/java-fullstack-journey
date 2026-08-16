package Day9;

public class Reverse_the_words_sentence {
    public static void main(String[] args) {
        String s1 = "Java is fun";
        String[] arr = s1.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i=arr.length-1 ; i>=0 ; i--){
            res.append(arr[i]).append(" ");
        }
        System.out.println(res);
    }
}
