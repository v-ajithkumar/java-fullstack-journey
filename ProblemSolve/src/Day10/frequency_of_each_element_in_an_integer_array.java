package Day10;

import java.util.HashMap;

public class frequency_of_each_element_in_an_integer_array {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num , map.getOrDefault(num, 0 ) + 1);
        }

        System.out.println(map);
    }
}
