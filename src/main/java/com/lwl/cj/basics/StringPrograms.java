package com.lwl.cj.basics;
import java.util.Arrays;

public class StringPrograms {
			
		public boolean isPalindrome(String str) {
			int n = str.length();
			for (int i = 0; i < n/2 ; i++) {
				if (str.charAt(i) != str.charAt(n-i-1)) {
				return false; // after return it stops execution
				}
			}
			return true;
		}
		
		// ABCD => n = 3 => ["ABC", "BCD"]
		public String[] subStringWithSizeN(String str, int n) {
			int l = str.length();
			if (n <= l) {
				String rs[] = new String[l - n + 1];
				for (int i = 0; i + n <= l;) {
					rs[i] = str.substring(i, i + n);
				}
				return rs;
			} else {
				return null;
			}
		}
		
		// ["Rajesh","Manoj","Suresh"] => delimeter = "-" => Rajesh-Manoj-Suresh
		public String joinStrings(String[] str, String delimeter) {
			String rs = "";
			for (String i : str) {
				rs += i + "-";
			}
			rs = rs.substring(0, rs.length() - 1);
			return rs;
		}
		
		// Occurance of given key in the given array
		public int occurance(String[] str,String key) {
			int rs = 0;
			for (String n : str) {
				rs += (n == key) ? 1 : 0;
			}			
			return rs;
		}
		
		// Sort the given colors in asc/desc
		public String[] sort(String[] colors) {
			Arrays.sort(colors);
			return colors;
		}
		
		public int countOfVowels(String str) {
			char[] vowels = {'a','e','i','o','u'};
			int rs = 0;
			for ( char ele : vowels) {
				for (int i=0; i<str.length();i++) {
					rs += (ele == str.charAt(i))?1:0;
				}
			}
			
			return rs;
		}
		
		public int getWordCount(String str) {
			
			return 0;
		}
		
		// Covert integer arr values to binary string array
		public String[] covertToBinaryString(int[] arr) {
			
			return null;
		}
		
		// Encode string vowels with 1 and consonants with 0 then return 
		public String encode(String str) {
			return null;
		}
		
}
