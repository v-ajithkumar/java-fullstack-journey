package Day8;

public class Find_Second_Largest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        for (int i=0; i< arr.length ; i++){
            if(arr[i] > firstLargest && arr[i]!=secondLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(firstLargest);
        System.out.println(secondLargest);
    }
}
