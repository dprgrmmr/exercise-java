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
	
	public static void main(String[] args) {
		ArrayUtil reverse = new ArrayUtil();
		int[] arr = new int[] {1, 2, 3, 4, 5};
		int[] result = reverse.reverse(arr);
		System.out.println(Arrays.toString(result));
		
		result = reverse.reverse(null);
		System.out.println(Arrays.toString(result));
		
		result = reverse.reverse(new int[0]);
		System.out.println(Arrays.toString(result));
	}
}
