package com.lwl.cj.basics;

public class FundamentalPrograms_1 {
	
	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int substractNumbers(int a, int b) {
		
		return a - b;
	}

	public float average(int a, int b, int c) {
		float avg = (a + b + c)/3.0f;
		return avg;
	}

	public String swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		return a + " and " + b; // don't change this return statement

	}

	public float simpleInterest(float p, float t, float r) {
		float interest = (p * t * r) / 100;
		return interest;
	}
}
