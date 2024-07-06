package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class noKTest {

	@Test
	public void noKKIsNotInArrayReturnsTrue() {
		Assertions.assertEquals(
				true, 
				ArrayUtil.noK(
						new int[] {1, 8, 4, 9, 2, 16}, 
						3));
	}
	
	@Test
	public void noKKIsInArrayReturnsFalse() {
		Assertions.assertEquals(
				false, 
				ArrayUtil.noK(
						new int[] {1, 8, 4, 9, 2, 16}, 
						8));
	}
	
	@Test
	public void noKNullArrayReturnsTrue() {
		Assertions.assertEquals(
				true, 
				ArrayUtil.noK(
						null, 
						0));
	}
	
	@Test
	public void noKEmptyArrayReturnsTrue() {
		Assertions.assertEquals(
				true, 
				ArrayUtil.noK(
						new int[0], 
						0));
	}
}
