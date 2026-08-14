package Day8;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7};
        int largest = arr[0];
        for (int i=0 ; i< arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
