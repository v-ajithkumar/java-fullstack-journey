package Day8;

public class Reverse_an_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        reverseArr(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void reverseArr(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
