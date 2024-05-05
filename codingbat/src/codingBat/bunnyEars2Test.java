package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class bunnyEars2Test {

	@Test
	public void bunnyEars2HappyCase() {
		Assertions.assertEquals(
				25, 
				Util.bunnyEars2(
						10));
	}
	
	@Test
	public void bunnyEars2NegativeBunniesReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.bunnyEars2(
						-1));
	}
}
