package problemSolving;

public class LargestElementsArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int lar = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>lar) {
				lar = arr[i];
			}
		}
		System.out.println(lar);
	}
}