import java.util.ArrayList;

/**
 * 
 * @author tugayac and moyessa. Created Mar 22, 2012.
 */
public class PrimeFactorization {

	public static ArrayList<Integer> generateFactors(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candidate = 2; n > 1; candidate++) {
			for (; n % candidate == 0; n /= candidate) {
				ret.add(candidate);
			}
		}

		return ret;
	}
}
