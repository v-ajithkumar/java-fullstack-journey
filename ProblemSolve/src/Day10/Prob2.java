package Day10;

import java.util.Arrays;

public class Prob2 {
    public static void main(String[] args) {
        String str = "Java Spring Boot Microservices";
        String[] res =  str.split(" ");
        String longest = res[0];
        for (int i = 0; i <res.length ; i++) {
            if(res[i].length() > longest.length()){
                longest = res[i];
            }
        }
        System.out.println(longest);
    }
}
