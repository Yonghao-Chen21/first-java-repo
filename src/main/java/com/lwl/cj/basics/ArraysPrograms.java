package com.lwl.cj.basics;
import java.util.Arrays;
import java.util.Collections;

public class ArraysPrograms {

	// Find max element of given array
	public int maxElement(int[] arr) {
		int max = arr[0];
		for (int ele : arr) {
			if (max < ele) {
				max = ele;
			}
		}
		return max;
	}

	// Find sum of all the elements
	public int sumOfElement(int[] arr) {
		int rs = 0;
		for (int ele : arr) {
			rs += ele;
		}
		return rs;
	}

	// If key is present in the array it should return true otherwise false
	public boolean search(int[] arr, int key) {
		for (int ele : arr) {
			if (ele == key) {
				return true;
			}
		}
		return false;
	}

	// Sort array elements in given direction ( asc, desc )
	public int[] sort(int[] arr, String order) {
		if (order == "asc") {
			Arrays.sort(arr);	
		}else {
			Arrays.sort(arr);
		
		}
		return arr;
	}

	// Generated prime store in array and return
	public int[] generateNPrimeNumbers(int n) {

		return null;
	}

	// Check subArr is subset of masterArr
	public boolean isSubSet(int[] masterArr, int[] subArr) {
		if (masterArr.length < subArr.length)
			return false;
		int count = 0;
		for (int a : subArr) {
			for(int b : masterArr) {
				if (a == b) {
					count += 1;
					break;
				}
			}
		}

		return (count == subArr.length) ? true:false;
	}

	// Return max sum row in the 2d array
	public int[] maxSumRow(int[][] arr) {
		int[] max = arr[0];
		for (int[] subarr :arr) {
			int tmp = sumOfElement(subarr);
			max = (tmp>sumOfElement(max))?subarr:max;		
		}
		return max;
	}

}
