package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class noKeyTest {

	@Test
	public void noKeyHappyCase() {
		Assertions.assertEquals(
				"Hppy Birthdy!", 
				Util.noKey(
						"Happy Birthday!",
						"a"));
	}
	
	@Test
	public void noKeyInStringReturnsInputStringUnchanged() {
		Assertions.assertEquals(
				"Hello", 
				Util.noKey(
						"Hello",
						"b"));
	}
	
	@Test
	public void noKeyStringEqualsKeyReturnsEmpty() {
		Assertions.assertEquals(
				"", 
				Util.noKey(
						"Hello",
						"Hello"));
	}
	
	@Test
	public void noKeyStringIsNullReturnsNull() {
		Assertions.assertEquals(
				null, 
				Util.noKey(
						null,
						"Hello"));
	}
	
	@Test
	public void noKeyKeyIsNullReturnsInputString() {
		Assertions.assertEquals(
				"What?", 
				Util.noKey(
						"What?",
						null));
	}
	
	@Test
	public void noKeyKeyIsEmptyReturnsInputInputString() {
		Assertions.assertEquals(
				"What?", 
				Util.noKey(
						"What?",
						""));
	}
}
