package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IsEverywhereTest {

	@Test
	public void isEverywhereHappyCase() {
		Assertions.assertEquals(false, ArrayUtil.isEverywhere(new int[4], 2));
	}
	
	@Test
	public void isEverywhereArrLengthisLessThanTwo() {
		Assertions.assertEquals(false, ArrayUtil.isEverywhere(new int[1], 2));
	}
	
	@Test
	public void isEverywhereArrisNull() {
		Assertions.assertEquals(false, ArrayUtil.isEverywhere(null, 2));
	}
}
