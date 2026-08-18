package Day10;

public class FindAll_Pairs_in_an_array_whose_sum_equals_given_target {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 1};
        int target = 9;

        for (int i=0; i< arr.length; i++){
            for (int j=0 ; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " + " + arr[j] + " -> " + target);
                }
            }
        }

    }
}
