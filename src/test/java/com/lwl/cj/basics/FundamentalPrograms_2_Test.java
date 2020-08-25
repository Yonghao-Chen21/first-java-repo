package com.lwl.cj.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FundamentalPrograms_2_Test {

	@Test
	void isEven() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(true, obj.isEven(10));
	}

	@Test
	void biggestOfTwoTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(10, obj.biggest(5, 10));
	}

	@Test
	void biggestOfThreeTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(30, obj.biggest(10, 15, 30));
	}

	/*
	 * If amount 1 - 100 Discount 5% 
	 * If amount >100 and <= 500 Discount 10% 
	 * If amount >500 and <= 1000 Discount 12% 
	 * If amount > 1000 Discount 15%
	 */

	@Test
	void getDiscountAmountTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(95, obj.getDiscountAmount(100));
	}

	/* 
	 * If used units 0 - 100 per unit 3
	 * > 100 and <= 500 per unit 5 
	 * > 500 and <= *1000 per unit 8 
	 * > 1000 per unit 10
	 * 
	 * bill amount = minAmount + used units amount
	 */

	@Test
	void calElectricityBillTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(80, obj.calElectricityBill(50, 30), 0.02);
	}

}
