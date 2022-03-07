package com.lwl.cj.basics;

public class FundamentalPrograms_2 {

	public boolean isEven(int num) {
		// TODO write logic
		boolean rs = (num % 2 == 0);
		return rs;
	}

	public int biggest(int a, int b) {
		// TODO write logic
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int biggest(int a, int b, int c) {
		// TODO write logic
		return Math.max(Math.max(a, b), c);
	}

	/*
	 * If amount 1 - 100 Discount 5% If amount >100 and <= 500 Discount 10% If
	 * amount >500 and <= 1000 Discount 12% If amount > 1000 Discount 15%
	 */

	public float getDiscountAmount(int amount) {
		// TODO write logic
		float rs;
		if (amount <= 100) {
			rs = 0.05f;
		} else if (amount > 100 && amount <= 500) {
			rs = 0.1f;
		} else if (amount > 500 && amount <= 1000) {
			rs = 0.12f;
		} else {
			rs = 0.15f;
		}
		return (1 - rs) * amount;
	}

	/*
	 * If used units 0 - 100 per unit 3 
	 * > 100 and <= 500 per unit 5 
	 * > 500 and <= 1000 per unit 8 
	 * > 1000 per unit 10
	 * bill amount = minAmount + used units amount
	 * 
	 */
	public float calElectricityBill(int minAmount, int usedUnits) {
		// TODO write logic
		int rs = 0;
		if (usedUnits > 1000) {
			rs += (usedUnits - 1000) * 10;
			usedUnits = 1000;
		}
		if (usedUnits > 500) {
			rs += (usedUnits - 500) * 8;
			usedUnits = 500;
		}
		if (usedUnits > 100) {
			rs += (usedUnits - 100) * 5;
			usedUnits = 100;
		}
		if (usedUnits > 0) {
			rs += usedUnits * 3;
		}

		return rs + minAmount;

	}

}