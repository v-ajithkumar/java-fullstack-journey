package Day9;

import java.util.LinkedHashMap;

public class first_non_repeated_character_in_a_String {
    public static void main(String[] args) {
        String s1 = "banana";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : s1.toCharArray()){
            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
