package eulersolutions;

public class ProjectEuler010 {

	public static void main(String[] args) {

		int limit = 2000000;
		boolean[] isPrime = new boolean[limit + 1];

		for (int i = 0; i < limit; i++) {
			if (i % 2 != 0) {
				isPrime[i] = true;
			}
		}

		for (int i = 2; i * i < limit; i++) {

			if (isPrime[i]) {
				for (int j = i; i * j < limit; j++) {
					isPrime[i * j] = false;
				}
			}

		}
		double sum = 0;

		for (int i = 1; i < limit; i++) {
			if (isPrime[i]) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
