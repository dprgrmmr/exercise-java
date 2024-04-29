package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class array11Test {

	@Test
	public void array11HappyCase() {
		Assertions.assertEquals(2, 
				Util.array11(
						new int[] {2, 11, 6, 11, 2, 11}, 
						2));
	}
	
	@Test
	public void array11IndexIsGreaterThanArrayLengthReturnsZero() {
		Assertions.assertEquals(0, 
				Util.array11(
						new int[] {2, 11, 6, 11, 2, 11}, 
						6));
	}
	
	@Test
	public void array11ArrayLengthIsZeroReturnsZero() {
		Assertions.assertEquals(0, 
				Util.array11(
						new int[0], 
						1));
	}
	
	@Test
	public void array11No11IsFoundReturnsZero() {
		Assertions.assertEquals(0, 
				Util.array11(
						new int[] {2, 3, 6, 8, 2, 9}, 
						0));
	}
}
