package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class triangleTest {

	@Test
	public void triangleHappyCase() {
		Assertions.assertEquals(
				15, 
				Util.triangle(
						5));
	}
	
	@Test
	public void triangleRowsIsNegativeReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.triangle(
						-2));
	}
	
	@Test
	public void triangleRowsIsZeroReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.triangle(
						0));
	}
}
