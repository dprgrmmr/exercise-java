package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static codingbat.Util.sumNDigits;

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
	
