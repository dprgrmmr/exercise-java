package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class modKTest {

	@Test
	public void modKHappyCaseReturnTrue() {
		Assertions.assertEquals(
				true, 
				ArrayUtil.modK(
						new int[] {1, 4, 2, 6, 7, 6}, 
						3));
	}
	
	@Test
	public void modKReturnFalse() {
		Assertions.assertEquals(
				false, 
				ArrayUtil.modK(
						new int[] {0, 3, 6, 5, 8, 6}, 
						2));
	}
	
	@Test
	public void modKNullReturnsFalse() {
		Assertions.assertEquals(
				false, 
				ArrayUtil.modK(
						null, 
						2));
	}
	
	@Test
	public void modKArrayLengthLessThanKReturnsFalse() {
		Assertions.assertEquals(
				false, 
				ArrayUtil.modK(
						new int[] {1, 2, 3, 4}, 
						5));
	}
}
