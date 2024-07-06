package codingbat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RotateLeftKTest {

	@Test
	public void rotateLeftKHappyCase() {
		RotateLeftK rtLeft = new RotateLeftK();
		int[] arr = new int[] {1, 3, 5, 8, 7};
		int[] expected = new int[] {5, 8, 7, 1, 3};
		int[] result = rtLeft.rotateLeftK(arr, 2);
		Assertions.assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	public void rotateLeftNullReturnsNull() {
		RotateLeftK rtLeft = new RotateLeftK();
		int[] result = rtLeft.rotateLeftK(null, 2);
		Assertions.assertEquals(null, result);
	}
	
	@Test
	public void rotateLeftKEmptyReturnsEmptyArray() {
		RotateLeftK rtLeft = new RotateLeftK();
		int[] result = rtLeft.rotateLeftK(new int[0], 2);
		Assertions.assertTrue(Arrays.equals(new int[0], result));
	}
	
	@Test
	public void rotateLeftZeroReturnsSameArray() {
		RotateLeftK rtLeft = new RotateLeftK();
		int[] arr = new int[] {1, 3, 5, 8, 7};
		int[] result = rtLeft.rotateLeftK(arr, 0);
		Assertions.assertTrue(Arrays.equals(arr, result));
	}
}
