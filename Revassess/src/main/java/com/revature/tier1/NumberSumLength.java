package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String ln = Long.toString(num);
		int len = ln.length();
		long res = 0;

		for (int i=0; i < len; i++){
			res += Math.pow(Character.getNumericValue(ln.charAt(i)),len);
		}

		return res == num;
	}
}
