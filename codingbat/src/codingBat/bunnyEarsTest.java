package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class bunnyEarsTest {

	@Test
	public void bunnyEarsTest() {
		Assertions.assertEquals(
				6, 
				Util.bunnyEars(
						3));
	}
	
	@Test
	public void bunnyEarsBunniesIsNegativeReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.bunnyEars(
						-1));
	}
}
