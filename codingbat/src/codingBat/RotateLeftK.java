package codingBat;

import java.util.Arrays;

public class RotateLeftK {

	public int[] rotateLeftK(int[] arr, int k) {
		
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
	
	public static void main(String[] args) {
		RotateLeftK rtLeft = new RotateLeftK();
		int[] arr = new int[] {1, 3, 5, 8, 7};
		int[] result = rtLeft.rotateLeftK(arr, 2);
		System.out.println(Arrays.toString(result));
		
		result = rtLeft.rotateLeftK(null, 2);
		System.out.println(Arrays.toString(result));
		result = rtLeft.rotateLeftK(new int[] {}, 1);
		System.out.println(Arrays.toString(result));
	}
}
