package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class sumDigitsTest {

	@Test
	public void sumDigitsHappyCase() {
		Assertions.assertEquals(
				25 ,
				Util.sumDigits(
						18592));
	}
	
	@Test
	public void sumDigitsZerosInNumber() {
		Assertions.assertEquals(
				25,
				Util.sumDigits(
						1805902));
	}
	
	@Test
	public void sumDigitsOneDigitNumberReturnsTheInputNumber() {
		Assertions.assertEquals(
				8,
				Util.sumDigits(
						8));
	}
}
