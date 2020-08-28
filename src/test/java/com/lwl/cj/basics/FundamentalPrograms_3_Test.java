package com.lwl.cj.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FundamentalPrograms_3_Test {

	@Test
	void addNumbersTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(54321, obj.reverseOfNumber(12345), "You must reverse the numbers");
	}

	@Test
	void sumOfDigits() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(15, obj.sumOfDigits(12345), "You must add the numbers");
	}

	@Test
	void isPrime() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(true, obj.isPrime(2), "You must check the number is prime or not");
	}

	@Test
	void fibonacciNumber() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(54321, obj.fibonacciNumber(10), "You must check for fibonacci number");
	}

	@Test
	void isPalindrome() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(true, obj.isPalindrome(12321), "You must reverse the numbers");
	}

	@Test
	void countPrimes() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(54321, obj.countPrimes(2, 10), "You must check number is palindrome or not");
	}

}
