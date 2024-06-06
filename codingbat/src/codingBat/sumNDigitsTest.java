package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class sumNDigitsTest {
	
	@Test
	public void sumNDigitsHappyCase() {
		Assertions.assertEquals(
				12, 
				sumNDigits(
						129857, 
						2));
	}
	
	@Test
	public void sumNDigitsNIsZeroReturnsZero() {
		Assertions.assertEquals(
				0, 
				sumNDigits(
						212, 
						0));
	}
}
	
