package com.lwl.cj.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FundamentalPrograms_1_Test {

	@Test
	void addNumbersTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(10, obj.addNumbers(5, 5), "You must add two numbers");
		assertEquals(550, obj.addNumbers(50, 500), "You must add two numbers");
		assertEquals(-10, obj.addNumbers(10, -20), "You must add two numbers");
		assertEquals(-140, obj.addNumbers(110, -250), "You must add two numbers");
		assertEquals(10, obj.addNumbers(-10, 20), "You must add two numbers");
		assertEquals(-30, obj.addNumbers(-10, -20), "You must add two numbers");
		assertEquals(10, obj.addNumbers(10, 0), "You must add two numbers");
		assertEquals(10, obj.addNumbers(0, 10), "You must add two numbers");
		assertEquals(0, obj.addNumbers(0, 0), "You must add two numbers");
	}

	@Test
	void substractNumbersTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(10, obj.substractNumbers(20, 10));
		assertEquals(-2290, obj.substractNumbers(7580, 9870));		
		assertEquals(400, obj.substractNumbers(250, -150));
		assertEquals(30, obj.substractNumbers(20, -10));
		assertEquals(-30, obj.substractNumbers(-20, 10));
		assertEquals(-10, obj.substractNumbers(-20, -10));
		assertEquals(-15510, obj.substractNumbers(2000, 17510));
		assertEquals(-10, obj.substractNumbers(-10, 0));
		assertEquals(10, obj.substractNumbers(0, -10));
		assertEquals(0, obj.substractNumbers(0, 0));


	}

	@Test
	void averageTest() {
		// Test for different numbers like average(17,8,123)
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(20, obj.average(10, 20, 30), 0.02);
		assertEquals(-22, obj.average(-12, -25, -30), 0.02);
		assertEquals(-41, obj.average(17, -18, -123), 0.02);
		assertEquals(13, obj.average(-10, 125, -76), 0.02);
		assertEquals(-1, obj.average(-18, -65, 78), 0.02);
		assertEquals(8, obj.average(0, -12, 36), 0.02);
		assertEquals(-3, obj.average(-84, 0, 73), 0.02);
		assertEquals(5, obj.average(-36, -19, 72), 0.02);
		assertEquals(61, obj.average(98, 0, 87), 0.02);
		assertEquals(27, obj.average(62, 21, 0), 0.02);
		assertEquals(0, obj.average(0, 0, 0), 0.02);

	}

	@Test
	void swapTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals("20 and 10", obj.swap(10, 20));
		assertEquals("20 and -10", obj.swap(-10, 20));
		assertEquals("-20 and 10", obj.swap(10, -20));
		assertEquals("-20 and -10", obj.swap(-10, -20));
		assertEquals("0 and 10", obj.swap(10, 0));
		assertEquals("10 and 0", obj.swap(0, 10));
		assertEquals("0 and -10", obj.swap(-10, 0));
		assertEquals("-10 and 0", obj.swap(0, -10));
		assertEquals("0 and 0", obj.swap(0, 0));

	}

	@Test
	void simpleInterestTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(7200, obj.simpleInterest(10000, 12, 6), 0.02);
		assertEquals(14400, obj.simpleInterest(20000, 12, 6), 0.02);
		assertEquals(36000, obj.simpleInterest(50000, 12, 6), 0.02);
		assertEquals(1561680, obj.simpleInterest(1084500, 24, 6), 0.02);
		assertEquals(2953296, obj.simpleInterest(2050900, 24, 6), 0.02);
		assertEquals(5824973, obj.simpleInterest(4045120, 24, 6), 0.02);
		assertEquals(244800, obj.simpleInterest(85000, 24, 12), 0.02);
		assertEquals(216000, obj.simpleInterest(75000, 24, 12), 0.02);
		assertEquals(129600, obj.simpleInterest(45000, 24, 12), 0.02);
		assertEquals(388800, obj.simpleInterest(45000, 36, 24), 0.02);
	}

}
