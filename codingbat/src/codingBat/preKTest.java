package codingBat;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class preKTest {

	@Test
	public void preKHappyCase() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {1, 6, 7, 8}, 
						ArrayUtil.preK(
								new int[] {1, 6, 7, 8, 2, 5}, 2)));
	}
	
	@Test
	public void preKReturnsInputArrayWhenKIsNotInTheArray() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {1, 8, 5, 4, 9}, 
						ArrayUtil.preK(
								new int[] {1, 8, 5, 4, 9}, 6)));
	}
	
	@Test
	public void preKArrayIsNullReturnsNull() {
		Assertions.assertTrue(
				Arrays.equals(
						null, 
						ArrayUtil.preK(
								null, 2)));
	}
	
	@Test
	public void preKEmptyArrayReturnsEmptyArray() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[0], 
						ArrayUtil.preK(
								new int[0], 2)));
	}
}
