package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class cleanStringTest {

	
	@Test
	public void cleanStringHappyCase() {
		Assertions.assertEquals(
				"helo", Util.cleanString(
						"hheello"));
	}
	
	@Test
	public void cleanStringNoDuplicatesReturnsInputString() {
		Assertions.assertEquals(
				"place", Util.cleanString(
						"place"));
	}
	
	@Test
	public void cleanStringEmptyStringReturnsEmpty() {
		Assertions.assertEquals(
				"", Util.cleanString(
						""));
	}
	
	@Test
	public void cleanStringNullReturnsNullAsString() {
		Assertions.assertEquals(
				"null", Util.cleanString(
						null));
	}
}
