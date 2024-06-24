package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class productEvenDigitsTest {

	@Test
	public void productEvenDigitsHappyCase() {
		Assertions.assertEquals(
				64, 
				Util.productEvenDigits(
						2498));
	}
	
	@Test
	public void productEvenDigitsNoEvenDigitsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.productEvenDigits(
						13957));
	}
	
	@Test
	public void productEvenDigitsInputIsOneDigitAndEvenReturnsInput() {
		Assertions.assertEquals(
				6, 
				Util.productEvenDigits(
						6));
	}
}
