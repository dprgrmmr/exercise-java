package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class countEvensTest {

	@Test
	public void countEvensHappyCase() {
		Assertions.assertEquals(
				3, 
				ArrayUtil.countEvens(
						new int[] { 2, 3, 2, 4, 7, 5 }));
	}

	@Test
	public void countEvensNoEvensInArrayReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.countEvens(
						new int[] { 1, 3, 9, 3, 7, 5 }));
	}

	@Test
	public void countEvensNullArrayReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.countEvens(
						null));
	}

	@Test
	public void countEvensEmptyArrayReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.countEvens(
						new int[0]));
	}
}
