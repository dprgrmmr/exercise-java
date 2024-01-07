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
		
		for (int j = 0; j < k; j++) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		}
		return arr;
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
