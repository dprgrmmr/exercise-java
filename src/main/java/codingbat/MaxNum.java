package codingbat;

public class MaxNum {

	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxNum maxInt = new MaxNum();
		int[] arr = new int[] {1, 82, 10, 24, 3};
		int result = maxInt.max(arr);
		System.out.println(result);
	}
}
