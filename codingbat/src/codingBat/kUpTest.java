package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class kUpTest {

	@Test
	public void kUpHappyCase() {
		Assertions.assertEquals(
				true, 
				ArrayUtil.kUp(
						new int[] {2, 4, 5, 6, 7, 3}, 
						4));
	}
	
	@Test
	public void kUpNullArrayReturnsFalse() {
		Assertions.assertEquals(
				false, 
				ArrayUtil.kUp(
						null, 
						4));
	}
	
	@Test
	public void kUpArrayLengthLessThanKReturnsFalse() {
		Assertions.assertEquals(
				false, 
				ArrayUtil.kUp(
						new int[] {1, 6, 3}, 
						4));
	}
}
