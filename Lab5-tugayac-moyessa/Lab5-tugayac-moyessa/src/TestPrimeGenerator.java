import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * @author tugayac and moyessa. Created Mar 23, 2012.
 */
public class TestPrimeGenerator {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeGenerator.generatePrimes(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(), PrimeGenerator.generatePrimes(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(2), PrimeGenerator.generatePrimes(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 3), PrimeGenerator.generatePrimes(4));
	}

	@Test
	public void testFive() {
		assertEquals(list(2, 3), PrimeGenerator.generatePrimes(5));
	}

	@Test
	public void testSix() {
		assertEquals(list(2, 3, 5), PrimeGenerator.generatePrimes(6));
	}

	@Test
	public void testEight() {
		assertEquals(list(2, 3, 5, 7), PrimeGenerator.generatePrimes(8));
	}

	@Test
	public void testEleven() {
		assertEquals(list(2, 3, 5, 7), PrimeGenerator.generatePrimes(11));
	}

	@Test
	public void testBig() {
		assertTrue(PrimeGenerator.generatePrimes(34219).contains(19)
				&& PrimeGenerator.generatePrimes(34219).contains(1801));
	}

	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints) {
			ret.add(i);
		}
		return ret;
	}
}
