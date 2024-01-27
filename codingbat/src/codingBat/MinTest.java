package codingBat;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class MinTest {
	@Test
	public void minHappyCase() {
		Assertions.assertEquals(
				-3, 
				ArrayUtil.min(
						new int[] {1, -3, 0, 9, 4}));
	}
	
	@Test 
	public void minEmptyArray() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.min(
						new int[0]));
		
	}
}
