package MysteryFunction;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysteryFunctionTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test1() {
		assertEquals(1, function(1));
	}

	@Test
	public void test2() {
		assertEquals(2, function(2));
	}

	@Test
	public void test10() {
		assertEquals(3628800, function(10));
	}

	@Test
	public void test11() {
		System.out.println(function(11));
	}

	@Test
	public void test12() {
		System.out.println(function(12));
	}

	@Test
	public void test13() {
		System.out.println(function(13));
	}

	@Test
	public void test0() {
		assertEquals(1, function(0));
	}

	@Test
	public void testnegative() {
		thrown.expect(IllegalArgumentException.class);
		function(-1);
	}

	public long function(int num) {
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		long output = 1;
		if (num == 0 || num == 1) {
			return output;
		} else if (num > 1)
			for (int i = num; i >= num; i--) {
				output *= i;
		}
			return output;
	}

}
