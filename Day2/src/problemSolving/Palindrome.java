package problemSolving;

public class Palindrome {
	public static void main(String[] args) {
		String str = "mom";
		isPalindrome(str);
	}

	public static void isPalindrome(String str) {
		String rev= "";
		for (int i = str.length()-1; i >= 0 ; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("Not a plaindrome");
		}
	}
}
