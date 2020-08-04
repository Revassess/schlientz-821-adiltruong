package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		if (arr == null) {
			return 0;
		}
		int result = 0;
		for (int i: arr) {
			result += i;
		}
		return result;
	}
}
