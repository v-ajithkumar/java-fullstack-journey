package Day11;

public class first_repeated_element_in_an_integer_array {
    public static void main(String[] args) {
        int[] arr = {5,2,2,3,1};
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0 ; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}