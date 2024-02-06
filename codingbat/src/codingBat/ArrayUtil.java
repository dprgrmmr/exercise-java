package codingBat;

import java.util.Arrays;

public class ArrayUtil {

	public static int[] reverse(int[] arr) {

		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length -1 - i] = temp;
		}
		return arr;
	}
	
	public static int[] rotateK(int[] arr, int k) {
		
		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		if (k == 0) {
			return arr;
		}
		
		if (k < 0) {
			RotateLeftK rtLeftNeg = new RotateLeftK();
			return rtLeftNeg.rotateLeftK(arr, (0 - k));
		}
		RotateRightK rtRightPos = new RotateRightK();
		return rtRightPos.rotateRightK(arr, k);
	}
	
	/**
	 * <p>{@link rotateLeftK} rotates elements of the array left k times</p>
	 * 
	 * @param arr is input array
	 * @return rotated array
	 */
	public static int[] rotateLeftK(int[] arr, int k) {
		RotateRightK rtLeftNeg = new RotateRightK();
		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		if (k == 0) {
			return arr;
		}
		
	int[] result = new int[arr.length];
	int j = k;
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[j];
			j++;
			if (j == arr.length) {
				j = 0;
			}
		}
		return result;
	}
	
	/**
	 * <p>{@link rotateRightK} rotates the elements in the array k times</p>
	 * to the right
	 * 
	 * @param arr is input array
	 * @return rotated array
	 */
	public static int[] rotateRightK(int[] arr, int k) {
		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		if (k == 0) {
			return arr;
		}
		
		int[] result = new int[arr.length];
		int j = k;
		for (int i = 0; i < arr.length; i++) {
			result[j] = arr[i];
			j++;
			if (j == arr.length) {
				j = 0;
			}
		}
			return result;
	}
	
	/**
	 * <p>{@link max} finds the max number in the array</p>
	 * 
	 * @param arr is input array
	 * @return maximum number
	 */
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		if (arr == null) {
			throw new IllegalArgumentException("Array arr is null");
		}
		
		if (arr.length == 0) {
			max = 0;
		}
		
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	/**
	 * <p>{@link min} finds the min number in the array</p>
	 * 
	 * @param arr is input array
	 * @return minimum number
	 */
	public static int min(int[] arr) {
	int min = Integer.MAX_VALUE;
	
	if (arr == null) {
		throw new IllegalArgumentException("Array arr is null");
	}
	
	if (arr.length == 0) {
		min = 0;
	}
	
	for (int i : arr) {
		if (i < min) {
			min = i;
			}
		}
	return min;
	}
	
	/**
	 * {@link isEverywhere} is a method that returns true if for
	 * every consecutive pair of integers, num appears at least once
	 * 
	 * @param arr is the input array 
	 * @param num is the target number
	 * @return true if "everywhere" condition matches
	 */
	public static boolean isEverywhere(int[] arr, int num) {
		
		if (arr == null) {
			return false;
		}
		
		if (arr.length <= 1) {
			return false;
		}
		
		boolean everywhere = true;
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]);
			if (arr[i] != num && arr[i + 1] != num) {
				everywhere = false;
				break;
			}
		}
		return everywhere;
	}
	
	public static int[] withoutK(int[] arr, int k) {
		int index = 0;
		if (arr == null) {
			return null;
		}
		if (arr.length == 0) {
			return arr;
		}
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != k) {
				newArr[index] = arr[i];
				index++;
			}
		}
		return newArr;
	}
}
