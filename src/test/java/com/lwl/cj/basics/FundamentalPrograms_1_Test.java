package com.lwl.cj.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FundamentalPrograms_1_Test {

	@Test
	void addNumbersTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertEquals(10, obj.addNumbers(5, 5));
	}

}
