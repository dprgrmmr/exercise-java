package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxNumTest {

	@Test
	public void maxNumHappyCase() {
		Assertions.assertEquals(
				82, 
				ArrayUtil.max(
						new int[] {1, 55, 24, 82, 67}));
	}
}
