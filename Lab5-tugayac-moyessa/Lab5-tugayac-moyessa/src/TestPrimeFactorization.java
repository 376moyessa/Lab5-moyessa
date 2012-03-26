import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * @author tugayac and moyessa. Created Mar 22, 2012.
 */
public class TestPrimeFactorization {

	@Test
	public void testOne() {
		assertEquals(new ArrayList<Integer>(),
				PrimeFactorization.generateFactors(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeFactorization.generateFactors(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(3), PrimeFactorization.generateFactors(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeFactorization.generateFactors(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2, 3), PrimeFactorization.generateFactors(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(2, 2, 2), PrimeFactorization.generateFactors(8));
	}
	
	@Test
	public void testNine() {
		assertEquals(list(3, 3), PrimeFactorization.generateFactors(9));
	}
	
	@Test
	public void testBig() {
		assertEquals(list(5, 7, 7, 1327), PrimeFactorization.generateFactors(325115));
	}

	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints) {
			ret.add(i);
		}
		return ret;
	}
}
