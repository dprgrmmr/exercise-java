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
	
	@Test 
	public void maxNumEmptyArray() {
		Assertions.assertEquals(0, 
				ArrayUtil.max(
						new int[0]));
		
	}
	
	@Test 
	public void maxNumNullArray() {
		
		try {
			ArrayUtil.max(null);
		} 
		catch (IllegalArgumentException iae) {
			System.out.println(iae);
		}
	}
}
