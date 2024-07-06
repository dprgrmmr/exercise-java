package codingbat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RotateRightKTest {
	
	@Test
	public void rotateRightKHappyCase() {
		RotateRightK rtRight = new RotateRightK();
		int[] arr = new int[] {6, 7, 9, 0};
		int[] expected = new int[] {7, 9, 0, 6};
		int[] result = rtRight.rotateRightK(arr, 3);
		Assertions.assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	public void rotateRightKNullReturnsNull() {
		RotateRightK rtRight = new RotateRightK();
		int[] result = rtRight.rotateRightK(null, 2);
		Assertions.assertEquals(null, result);
	}
	
	@Test
	public void rotateRightKEmptyArrayReturnsEmptyArray() {
		RotateRightK rtRight =  new RotateRightK();
		int[] result = rtRight.rotateRightK(new int[] {}, 2);
		Assertions.assertTrue(Arrays.equals(new int[] {}, result));
	}
	
	@Test
	public void rotateRightZeroReturnsSameArray() {
		RotateRightK rtRight = new RotateRightK();
		int[] arr = new int[] {6, 7, 9, 0};
		int[] result = rtRight.rotateRightK(arr, 0);
		Assertions.assertTrue(Arrays.equals(arr, result));
	}

}
