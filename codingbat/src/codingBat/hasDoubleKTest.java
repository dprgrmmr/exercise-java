package codingBat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class hasDoubleKTest {

	@Test
	public void hasDoubleKHappyCase() {
		Assertions.assertEquals(false, ArrayUtil.hasDoubleK(new int[] {1, 2, 3, 4}, 1));
		Assertions.assertEquals(true, ArrayUtil.hasDoubleK(new int[] {1, 2, 3, 4}, 1));
	}

	@Test
	public void hasDoubleKArrIsNull() {
		Assertions.assertEquals(false, ArrayUtil.hasDoubleK(new int[] {1, 2, 3, 4}, 1));
	}
	
	@Test 
	public void hasDoubleKArrLengthisLessThan2() {
		Assertions.assertEquals(false, ArrayUtil.hasDoubleK(new int[] {1, 2, 3, 4}, 1));
	}
}
