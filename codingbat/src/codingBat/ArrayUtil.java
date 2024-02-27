package codingBat;

public class ArrayUtil {

         /**
	 * <p>
	 * {@link reverse} reverses array
	 * </p>
         *
	 * @param arr is input array
	 * @return reversed array
	 */
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
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

	/**
	 * <p>
	 * {@link rotateK} rotates elements of the array left or right k times
	 * </p>
	 * 
	 * @param arr is input array
         * @param k is number of times rotated
	 * @return if k >= 0 then rotate right i, if k <= 0 then rotate left
	 */
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
	 * <p>
	 * {@link rotateLeftK} rotates elements of the array left k times
	 * </p>
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
	 * <p>
	 * {@link rotateRightK} rotates the elements in the array k times
	 * </p>
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
	 * <p>
	 * {@link max} finds the max number in the array
	 * </p>
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
	 * <p>
	 * {@link min} finds the min number in the array
	 * </p>
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
	 * {@link isEverywhere} is a method that returns true if for every consecutive
	 * pair of integers, num appears at least once
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

	/**
	 * {@link withoutK} is a method that returns an array with with the input
	 * array's elements excluding elements that are k
	 * 
	 * @param arr is the input array
	 * @param k   is the number to exclude
	 * @return new array without k
	 */
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

	/**
	 * {@link hasDoubleK} is a method that returns true if k appears at least twice
	 * in a row in the input array
	 * 
	 * @param arr is the input array
	 * @param k   is the target number
	 * @return true if "Double" condition matches
	 */
	public static boolean hasDoubleK(int[] arr, int k) {

		if (arr == null) {
			return false;
		}

		if (arr.length < 2) {
			return false;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == k && arr[i + 1] == k) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@link preK} is a method that returns a new array with
	 * all elements that come before the first instance of k
	 * 
	 * @param arr is the input array
	 * @param k   is the target number
	 * @return new array
	 */
	public static int[] preK(int[] arr, int k) {
		int indexOfK = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				indexOfK = i;
				break;
			}
		}
		int[] newArr = new int[indexOfK];
		for (int i = 0; i < indexOfK; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	/**
	 * {@link countEvens} is a method that counts the number of
	 * even integers in an array
	 * 
	 * @param arr is the input array
	 * @return number of even integers
	 */
	public static int countEvens(int[] arr) {
		
		if (arr == null) {
			return 0;
		}
		
		if (arr.length < 1) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * {@link noK} is a method that checks for if the integer k
	 * is not found in the array
	 * 
	 * @param arr is the input array
	 * @param k is the target number
	 * @return true if k is not found in the array
	 */
	public static boolean noK(int[] arr, int k) {
		
		if (arr == null) {
			return true;
		}
		
		if (arr.length == 0) {
			return true;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * {@link sumK} is a method that adds up every instance of
	 * k found in the array
	 * 
	 * @param arr is the input array
	 * @param k is the target number
	 * @return sum of all k's in the array
	 */
	public static int sumK(int[] arr, int k) {
		
		if (arr == null) {
			return 0;
		}
		
		if (arr.length == 0) {
			return 0;
		}
		
		int sum = 0;
	
		for (int i = 0; i < arr.length; i++) {
			if (i == k) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	/**
	 * {@link kUp} is a method that determines whether there are
	 * k amount of consecutive integers in the array
	 * 
	 * @param arr is the input array
	 * @param k is the number of consecutive integers
	 * @return true if the array has k consecutive integers and false otherwise
	 */
	public static boolean kUp(int[] arr, int k) {
		
		if (arr == null) {
			return false;
		}
		
		if (arr.length < k) {
			return false;
		}
		
		for (int i = 0; i <= arr.length - k; i++) {
			int count = 0;
			for (int j = 1; j < k; j++) {
				if (arr[i + j] == arr[i + j - 1] + 1) {
					count++;
				}
			}
			if (count == k - 1) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * {@link matchUp} is a method that returns the amount of differences
	 * between two integer arrays of equal length
	 * 
	 * @param arr is the input array
	 * @param arr2 is the second input array
	 * @return the number of differences between arr and arr2
	 */
	public static int matchUp(int[] arr, int[] arr2) {
		
		if (arr == null || arr2 == null) {
			return 0;
		}
		
		if (arr.length != arr2.length) {
			return 0;
		}
		
		if (arr.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr2[i]) {
				count++;
			}
		}
		return count;
	}
}
