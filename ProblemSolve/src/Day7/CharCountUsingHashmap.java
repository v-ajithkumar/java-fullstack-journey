package Day7;

import java.util.HashMap;
import java.util.Map;

public class CharCountUsingHashmap {
    public static void main(String[] args) {
        String s1 = "banana";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
