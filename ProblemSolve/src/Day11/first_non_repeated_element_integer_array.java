package Day11;

public class first_non_repeated_element_integer_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1};
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0 ; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
           if(count == 1){
               System.out.println(arr[i]);
               break;
           }
        }
    }
}
