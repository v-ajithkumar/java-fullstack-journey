package Day11;

import java.util.HashSet;

public class duplicate_elements_using_HashSet {
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,40,40};
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            if(!set.add(num)){
                System.out.println("Duplicate: " + num);
            }
        }
        System.out.println(set);
    }
}
