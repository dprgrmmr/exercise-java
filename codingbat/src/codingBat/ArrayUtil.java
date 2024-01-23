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
	
	public int[] rotateLeftK(int[] arr, int k) {
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
}
