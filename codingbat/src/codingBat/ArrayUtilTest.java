package codingBat;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void reverseArrayHappyCase() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {5, 4, 3, 2, 1}, 
						ArrayUtil.reverse(
								new int[] {1, 2, 3, 4, 5})));
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {4, 3, 2, 1}, 
						ArrayUtil.reverse(
								new int[] {1, 2, 3, 4})));
	}
	
	@Test
	public void reverseNullreturnsNull() {
		Assertions.assertTrue(
				Arrays.equals(
						null, 
						ArrayUtil.reverse(
								null)));
	}
	
	@Test
	public void reverseEmptyreturnsEmptyArray() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[0], 
						ArrayUtil.reverse(
								new int[0])));
	}
	
	@Test
	public void ReverseArrayReturnsInputArray() {
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = ArrayUtil.reverse(arr1);
		Assertions.assertTrue(arr1 == arr2);
	}
}
