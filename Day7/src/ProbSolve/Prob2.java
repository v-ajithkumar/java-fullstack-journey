package ProbSolve;

public class Prob2 {
    public static void main(String[] args) {
//        Second-Largest Number
        int[] arr = {1,2,3,4,5};
        int firstLargeNo = arr[0];
        int secondLargeNo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstLargeNo ) {
                secondLargeNo = firstLargeNo;
                firstLargeNo = arr[i];
            }else if(arr[i] > secondLargeNo && arr[i]!=firstLargeNo){
                secondLargeNo = arr[i];
            }
        }
        System.out.println("First largest : " + firstLargeNo);
        System.out.println("Second Largest No : " + secondLargeNo);
    }
}
