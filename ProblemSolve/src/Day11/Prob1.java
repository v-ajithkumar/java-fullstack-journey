package Day11;

import java.util.HashMap;

public class Prob1 {
    //first non-repeating character
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String str = "aabbcdde";
        for (int i = 0; i < str.length(); i++) {
            char letter =str.charAt(i);
            map.put(letter, map.getOrDefault(letter, 0)+1);
        }

        System.out.println(map);
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
