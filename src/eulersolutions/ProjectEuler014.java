package eulersolutions;

public class ProjectEuler014 {

	double n;
	int count = 1;
	int maxN = 0;
	int max = 0;

	public static void main(String[] args) {

		double n;
		int count = 1;
		int maxN = 0;
		int max = 0;

		for (int i = 1; i < 1000000; i++) {
			n = i;

			count = 1;
			while (n != 1) {

				if (isEven(n)) {
					n = n / 2;
				} else {
					n = (n * 3) + 1;
				}
				count++;

				if (n == 1) {
					break;
				}

			}
			if (max < count) {
				max = count;
				maxN = i;
			}

		}
		System.out.println(max + " " + maxN);

	}

	public static boolean isEven(double n) {

		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
