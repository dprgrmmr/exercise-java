package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class changeXYTest {

	@Test
	public void changeXYHappyCase() {
		Assertions.assertEquals(
				"Silly", 
				Util.changeXY(
						"Sillx"));
	}
	
	@Test
	public void changeXYInputIsNullReturnsEmptyString() {
		Assertions.assertEquals(
				"", 
				Util.changeXY(
						null));
	}
	
	@Test
	public void changeXYInputIsEmptyReturnsEmptyString() {
		Assertions.assertEquals(
				"", 
				Util.changeXY(
						""));
	}
	
	@Test
	public void changeXYNoXInStringReturnsStringUnchanged() {
		Assertions.assertEquals(
				"Silly", 
				Util.changeXY(
						"Silly"));
	}
}
