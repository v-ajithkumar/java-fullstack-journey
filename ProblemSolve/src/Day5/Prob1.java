package Day5;

import java.util.HashMap;
import java.util.Map;

public class Prob1 {
    public static void main(String[] args) {
        //print all duplicate numbers.
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        for (int n : map.keySet()){
            if(map.get(n) > 1){
                System.out.println(n);
            }
        }
    }
}
