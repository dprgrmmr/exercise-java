package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class allStarTest {

	@Test
	public void allStarHappyCase() {
		Assertions.assertEquals(
				"h*e*l*l*o", 
				Util.allStar(
						"hello"));
	}
	
	@Test
	public void allStarInputIsNullReturnsNull() {
		Assertions.assertEquals(
				null, 
				Util.allStar(
						null));
	}
	
	@Test
	public void allStarInputLengthIsOneOrLessReturnsInputUnchanged() {
		Assertions.assertEquals(
				"I", 
				Util.allStar(
						"I"));
	}
}
