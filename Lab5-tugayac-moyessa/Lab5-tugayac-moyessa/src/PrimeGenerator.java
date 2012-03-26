import java.util.ArrayList;

/**
 * 
 * @author tugayac and moyessa. Created Mar 23, 2012.
 */
public class PrimeGenerator {
	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int i = 2; i < n; i++) {
			if (checkIfPrime(i)) {
				ret.add(i);
			}
		}

		return ret;
	}

	private static boolean checkIfPrime(int n) {
		int dividers = 0;
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				dividers++;
			}
			if (dividers > 2) {
				return false;
			}
		}

		return true;
	}
}
