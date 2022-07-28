package arrays;

public class KadaneMaxSumArray {
	static int maxSumArray(int a[]) {

		int curr_sum = 0;
		int max_sum = a[0];

		for (int i = 0; i < a.length; i++) {
			curr_sum = curr_sum + a[i];

			if (curr_sum > max_sum) {

				max_sum = curr_sum;

			}
			if (curr_sum < 0) {

				curr_sum = 0;
			}
		}

		return max_sum;
		

	}

	public static void main(String args[]) {
		int arr[] = { 1, -5, 3, 2, -9, 4 };

		System.out.println(KadaneMaxSumArray.maxSumArray(arr));
	}

}
