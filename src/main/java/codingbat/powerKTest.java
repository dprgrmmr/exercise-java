package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class powerKTest {

	@Test
	public void powerKHappyCase() {
		Assertions.assertEquals(
				32, 
				Util.powerK(
						2, 
						5));
	}
	
	@Test
	public void powerKIsOneReturnsBase() {
		Assertions.assertEquals(
				8, 
				Util.powerK(
						8, 
						1));
	}
	
	@Test
	public void powerKIsZeroReturnsOne() {
		Assertions.assertEquals(
				1, 
				Util.powerK(
						8, 
						0));
	}
}
