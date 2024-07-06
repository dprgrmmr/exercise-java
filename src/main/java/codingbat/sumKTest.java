package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class sumKTest {

	@Test 
	public void sumKHappyCase() {
		Assertions.assertEquals(
				6, 
				ArrayUtil.sumK(
						new int[] {2, 14, 6, 2, 7, 2}, 2));
	}
	
	@Test 
	public void sumKNullArrayReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.sumK(
						null, 3));
	}
	
	@Test 
	public void sumKEmptyArrayReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.sumK(
						new int[0], 2));
	}
}
