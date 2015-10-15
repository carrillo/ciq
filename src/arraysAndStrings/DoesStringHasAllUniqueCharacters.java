package arraysAndStrings;

import java.util.Arrays;
import java.util.Collections;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures.
 * 
 * Questions: 
 * i) what kind of values can be taken (ASCII, Unicode, integer (MIN, MAX). 
 * ii) does case matter? 
 * 
 * 1. The naive implementation is of O(n^2): Compare each to each.
 * 2. The intermediate implementation is of O(n*logn): Sort and then do a linear search
 * 3. O(n) Linear time. Use a boolean array to index the ascii values already encountered.   
 * 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */

public class DoesStringHasAllUniqueCharacters {

	/**
	 * Naive solution: O(n^2) compare each against each.  
	 * @param array
	 * @return
	 */
	public static boolean unique_naive(final char[] array) {
		boolean out = true; 
		for( int i = 0; i < array.length; i++ ) {
			for( int j = i + 1; j < array.length; j++ ) {
				if( array[i] == array[j]) {
					out = false;
					break; 
				}
			}
		}
		return out; 
	}
	
	/**
	 * Less naive solution: O(nlogn), sort and find consecutive same characters. 
	 * @param array
	 * @return
	 */
	public static boolean unique_less_naive(final char[] array) {
		Arrays.sort(array);
		boolean out = true; 
		for(int i = 1; i < array.length; i++) {
			if( array[i] == array[i-1]) {
				out = false; 
				break; 
			}
		}
		return out; 
	}
	
	/**
	 * Linear time solution. Use O(n) in extra space. 
	 * @param array
	 * @return
	 */
	public static boolean unique_linear_time(final char[] array) {
		boolean out = true; 
		
		final boolean[] hasCharacter = new boolean[256]; //False for each ASCII character.
		int i = -1; 
		for(char c : array) {
			i = Integer.valueOf(c); 
			if(hasCharacter[i]) {
				out = false; 
				break; 
			}
			hasCharacter[i] = true;  
		}
		
		return out; 
	}
	
	public static void main(String[] args) {
		final char[] unique = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		final char[] notUnique = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTuVWXYZ".toCharArray();

		System.out.println(unique_naive(unique)); 
		System.out.println(unique_naive(notUnique));
		
		System.out.println(unique_less_naive(unique)); 
		System.out.println(unique_less_naive(notUnique));
		
		System.out.println(unique_linear_time(unique)); 
		System.out.println(unique_linear_time(notUnique));
	}

}
