package Day9;

import java.util.LinkedHashSet;

public class Remove_duplicate_characters_from_String {
    public static void main(String[] args) {
        String s1 = "banana";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : s1.toCharArray()){
            set.add(ch);
        }

        for(char ch : set){
            System.out.print(ch);
        }

    }
}
