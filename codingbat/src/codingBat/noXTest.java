package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class noXTest {

	@Test
	public void noXHappyCase() {
		Assertions.assertEquals(
				"Hello", 
				Util.noX(
						"Hxexlxlxox"));
	}
	
	@Test
	public void noXInputIsNullReturnsEmptyString() {
		Assertions.assertEquals(
				"", 
				Util.noX(
						null));
	}
	
	@Test
	public void noXEmptyInputReturnsEmptyString() {
		Assertions.assertEquals(
				"", 
				Util.noX(
						""));
	}
}
