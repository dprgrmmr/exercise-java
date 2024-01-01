package codingBat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDoubleChar {
	@Test
	public void testAll() {
		DoubleChar doubleChar = new DoubleChar();
		Assertions.assertEquals("", doubleChar.doubleChar(""));
		Assertions.assertEquals("HHiikk", doubleChar.doubleChar("Hi"));
	}
}
