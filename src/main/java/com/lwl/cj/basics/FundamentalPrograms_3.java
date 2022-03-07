package com.lwl.cj.basics;

public class FundamentalPrograms_3 {

	public int reverseOfNumber(int num) {
		// TODO write logic
		int rs = 0;
		while (num > 0) {
			rs = rs * 10 + (num % 10);
			num = (num - (num % 10)) / 10;
		}
		return rs;
	}

	public int sumOfDigits(int num) {
		// TODO write logic
		int rs = 0;
		while (num > 0) {
			rs += num % 10;
			num = num / 10;
		}
		return rs;
	}

	public boolean isPrime(int num) {
		// TODO write logic
		boolean flag = true;
		if (num <= 1) {
			flag = false;
		}else {
			for (int i = 2; i <= num / 2; ++i) {// Statement 2 defines the condition for executing the code block. if i = 2, it won't execute.
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public int nthFibonacciNumber(int n) {
		// TODO write logic
		int a = 0, b = 1;
		while (n > 0) {
			b = a + b;
			a = b - a;
			n -= 1;
		}
		return a;
	}

	public boolean isPalindrome(int num) {
		// TODO write logic
		return (num == reverseOfNumber(num));
	}

	public int countPrimes(int lb, int ub) {
		// TODO write logic
		if (lb > ub) {
			return 0;
		} else {
			int n = 0;
			for (int i = lb; i <= ub; ++i) {
				if (isPrime(i)) {
					n += 1;
				}
			}
			return n;
		}

	}

}