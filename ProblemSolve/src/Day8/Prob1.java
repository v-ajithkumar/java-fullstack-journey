package Day8;

import java.util.Arrays;

public class Prob1 {
    public static void main(String[] args) {
//        Check Whether Two Strings are Anagrams
        String str = "code";
        String str2 = "deco";
        boolean anagram;

        if (str.length() != str2.length()) {
            anagram = false;
            return;
        }

        int[] countArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            countArr[ch- 'a']++;
        }
        for (int j = 0; j < str2.length(); j++) {
            char ch1 = str2.charAt(j);
            countArr[ch1 -'a']--;
        }
        anagram = true;

        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i] !=0){
                anagram = false;
                break;
            }
        }
        if(anagram) {
            System.out.println("anagram");
        }else{
            System.out.println("not angram");
        }
    }
}
