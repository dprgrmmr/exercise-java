package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class sumEvenDigitsTest {

	@Test
	public void sumEvenDigitsHappyCase() {
		Assertions.assertEquals(
				8, 
				Util.sumEvenDigits(
						3745272));
	}
	
	@Test
	public void sumEvenDigitsNoEvenDigitsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.sumEvenDigits(
						3719));
	}
	
	@Test
	public void sumEvenDigitsInputIsOneDigitAndEvenReturnsInput() {
		Assertions.assertEquals(
				6, 
				Util.sumEvenDigits(
						6));
	}
}
