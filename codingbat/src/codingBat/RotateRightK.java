package codingBat;

import java.util.Arrays;

public class RotateRightK {

	public int[] rotateRightK(int[] arr, int k) {
		if (arr == null) {
			return null;
		}
		if (arr.length == 0) {
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
	
	public static void main(String[] args) {
		RotateRightK rtRight = new RotateRightK();
		int[] arr = new int[] {6, 7, 9, 0};
		int[] result = rtRight.rotateRightK(arr, 3);
		System.out.println(Arrays.toString(result));
	
		result = rtRight.rotateRightK(null, 2);
		System.out.println(Arrays.toString(result));
		
		result = rtRight.rotateRightK(new int[] {}, 2);
		System.out.println(Arrays.toString(result));
	}
}
