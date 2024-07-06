package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class IsEverywhereTest {

	@Test
	public void isEverywhereTrueCase() {
		Assertions.assertTrue(
				ArrayUtil.isEverywhere(
						new int[] {1, 4, 6, 4, 4, 5}, 4));
	}
	
	@Test
	public void isEverywhereFalseCase() {
		Assertions.assertFalse(
				ArrayUtil.isEverywhere(
						new int[] {1, 4, 6, 4, 4, 5}, 5));
	}
	
	
	@Test
	public void isEverywhereReturnsFalseIfArrLengthisLessThanTwo() {
		Assertions.assertFalse(
				ArrayUtil.isEverywhere(
						new int[1], 2));
	}
	
	@Test
	public void isEverywhereReturnsFalseIfArrisNull() {
		Assertions.assertFalse(
				ArrayUtil.isEverywhere(
						null, 2));
	}
}
