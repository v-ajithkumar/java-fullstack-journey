package Day8;

public class Move_Zeros_to_End {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZero(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static void moveZero(int[] arr) {
        int j=0;
        for (int i=0; i< arr.length ; i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

    }
}
