package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class changePiTest {

	@Test
	public void changePiHappyCase() {
		Assertions.assertEquals(
				"3.14ece",
				Util.changePi(
						"piece"));
	}
	
	@Test
	public void changePiStrIsNullReturnsNull() {
		Assertions.assertEquals(
				null,
				Util.changePi(
					     null));
	}
	
	@Test
	public void changePiStrLengthIsOneReturnsStr() {
		Assertions.assertEquals(
				"p",
				Util.changePi(
						"p"));
	}
}
