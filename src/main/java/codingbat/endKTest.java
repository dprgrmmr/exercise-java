package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class endKTest {

	@Test
	public void endKHappyCase() {
		Assertions.assertEquals(
				"happyyyy",
				Util.endK(
						"hyaypypy",
						"y"));
	}
	
	@Test
	public void endKTargetIsNotFoundInInputReturnsInputUnchanged() {
		Assertions.assertEquals(
				"headphone",
				Util.endK(
						"headphone",
						"k"));
	}
	
	@Test
	public void endKInputStringIsNullReturnsNull() {
		Assertions.assertEquals(
				null,
				Util.endK(
						null,
						"y"));
	}
	
	@Test
	public void endKTargetStringIsNullReturnsInputStringUnchanged() {
		Assertions.assertEquals(
				"water",
				Util.endK(
						"water",
						"y"));
	}
}
