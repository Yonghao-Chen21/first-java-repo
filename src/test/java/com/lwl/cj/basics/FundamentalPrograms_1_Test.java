package com.lwl.cj.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FundamentalPrograms_1_Test {

	@Test
	void addNumbersTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(10, obj.addNumbers(5, 5), "You must add two numbers");
	}

	@Test
	void substractNumbersTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(10, obj.substractNumbers(20, 10));

	}

	@Test
	void averageTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(5, obj.average(5, 5, 5), 0.02);
	}

	@Test
	void swapTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals("20 and 10", obj.swap(10, 20));

	}

	@Test
	void simpleInterestTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(3600, obj.simpleInterest(50000, 12, 6), 0.02);
	}

}
