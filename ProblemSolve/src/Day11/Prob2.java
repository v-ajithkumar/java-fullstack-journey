package Day11;

import java.util.ArrayList;
import java.util.List;

public class Prob2 {
    public static void main(String[] args) {
        //remove duplicate element
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 20, 10, 40, 30, 50));
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(list);
        for(int ele : list){
            if(!res.contains(ele)){
                res.add(ele);
            }
        }
        System.out.println(res);
    }
}
