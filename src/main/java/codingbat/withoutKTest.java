package codingbat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class withoutKTest {

	@Test
	public void withoutKReturnsWithoutK() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {1, 2, 3, 0, 0}, 
						ArrayUtil.withoutK(
								new int[] {1, 2, 10, 3, 10}, 10)
						));
	}
	
	@Test
	public void withoutKReturnsArrayOfZerosWhenEveryElementIsK() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {0, 0, 0, 0, 0}, 
						ArrayUtil.withoutK(
								new int[] {1, 1, 1, 1, 1}, 1)
						));
	}
	
	@Test
	public void withoutKReturnsInputArrayWhenKIsNotInArray() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {1, 2, 3, 4, 5}, 
						ArrayUtil.withoutK(
								new int[] {1, 2, 3, 4, 5}, 10)
						));
	}
	
	@Test
	public void withoutKReturnsNullWhenArrayIsNull() {
		Assertions.assertTrue(
				Arrays.equals(
						null, 
						ArrayUtil.withoutK(
								null, 10)
						));
	}
	
	@Test
	public void withoutKReturnsArrayWhenInputArrayIsEmpty() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[0], 
						ArrayUtil.withoutK(
								new int[0], 10)
						));
	}
}
