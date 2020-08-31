package com.lwl.cj.basics;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraysProgramsTest {
	
	ArraysPrograms obj;
	
	@BeforeEach
	void init() {
		obj = new ArraysPrograms();
	}
	
	@Test
	void maxElement() {
		int[] arr1 = {4,5,6,7,8,9,1,2,3,4};
		int[] arr2 = {-4,-5,-6,-7};
		int[] arr3 = {0,0,0,0,0};
		int[] arr4 = {-4,5,6,7,8,-9,-1,2,3,4};
		assertAll("MaxElement",
				
				()->assertEquals(9,obj.maxElement(arr1)),
				()->assertEquals(-4,obj.maxElement(arr2)),
				()->assertEquals(0,obj.maxElement(arr3)),
				()->assertEquals(8,obj.maxElement(arr4))
				
				);
	}
	
	
	@Test
    void maxElementPNumbers() {
		int[] arr = {4,5,6,7,8,9,1,2,3,4};
		int expected = 9;
		int actual = obj.maxElement(arr);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void maxElementNNumbers() {
		int[] arr = {-4,-5,-6,-7};
		int expected = -4;
		int actual = obj.maxElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void maxElementZero() {
		int[] arr = {0,0,0,0,0};
		int expected = 0;
		int actual = obj.maxElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void maxElementWithNandPNumber() {
		int[] arr = {-4,5,6,7,8,-9,-1,2,3,4};
		int expected = 8;
		int actual = obj.maxElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	void isSubSetWithValidSubset() {
		int[] master = {1,2,3,4,5};
		int[] sub = {2,3,4};
		boolean res = obj.isSubSet(master, sub);
		assertTrue(res, "Sub array is not sub set of master array");
	}
	
	@Test
	void isSubSetWithNotSubset() {
		int[] master = {1,2,3,4,5};
		int[] sub = {2,3,9};
		boolean res = obj.isSubSet(master, sub);
		assertFalse(!res, "Sub array is sub set of master array");
	}
}
