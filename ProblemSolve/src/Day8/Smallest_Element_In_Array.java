package Day8;

public class Smallest_Element_In_Array {
    public static void main(String[] args) {
        int[] arr = {8,2,4,5,6};
        int smallest = arr[0];
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
