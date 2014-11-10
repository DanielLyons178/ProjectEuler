package eulersolutions;

public class ProjectEuler004 {

	public static void main(String[] args) {
		int max = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (isPalindrome(i * j) && i * j > max) {
					max = i * j;
				}
			}
		}

		System.out.println(max);
	}

	public static boolean isPalindrome(int n) {
		String numString = Integer.toString(n);
		String revString = "";

		for (int i = numString.length() - 1; i >= 0; i--) {
			revString = revString + numString.charAt(i);
		}

		if (numString.equals(revString)) {
			return true;

		}
		return false;

	}

}
