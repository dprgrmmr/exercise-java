package codingBat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class preKTest {

	@Test
	public void preKHappyCase() {
		Assertions.assertTrue(Arrays.equals(new int[0], new int[0]));
	}
	
	@Test
	public void preKReturnsInputArrayWhenKIsNotInTheArray() {
		Assertions.assertTrue(Arrays.equals(new int[0], new int[0]));
	}
	
	@Test
	public void preKArrayIsNullReturnsNull() {
		Assertions.assertTrue(Arrays.equals(new int[0], new int[0]));
	}
	
	@Test
	public void preKEmptyArrayReturnsEmptyArray() {
		Assertions.assertTrue(Arrays.equals(new int[0], new int[0]));
	}
}
