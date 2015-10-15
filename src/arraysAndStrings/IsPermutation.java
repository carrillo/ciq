package arraysAndStrings;

import java.util.Arrays;

/**
 * Is String a a permutation of b. 
 * 
 * Questions: Does case matter. Whatabout whitespaces etc. 
 * 
 * Implementation: 
 * - O(n*logn): Sort and compare.
 * - O(n): Count character and compare. This assumes that we know the dict. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class IsPermutation {
	
	public static boolean is_equal(char[] a, char[] b) {
		if( a.length != b.length ) {
			return false; 
		} else {
			boolean out = true; 
			for(int i = 0; i < a.length; i++) {
				if( a[i] != b[i] ) {
					out = false; 
					break;
				}
			}
			return out; 
		}
	}
	
	/**
	 * Sort and compare 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean is_perm_sort(final String a, final String b) {
		if (a.length() != b.length()) {
			return false; 
		} else {
			final char[] as = a.toCharArray();
			Arrays.sort(as);
			final char[] bs = b.toCharArray();
			Arrays.sort(bs);
			return( is_equal(as, bs)); 
		}
	}
	
	
	/**
	 * Count character for each string and compare. 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean is_perm_character_count(final String a, final String b) {
		int[] a_cc = count_character(a); 
		int[] b_cc = count_character(b);
		return( cc_equal(a_cc, b_cc)); 
	}
	
	public static int[] count_character(final String a) { 
		final int[] cc = new int[256]; // Assumes ASCII character. 
		for( char c : a.toCharArray()) {
			cc[Integer.valueOf(c)]++; 
		}
		return cc; 
	}
	
	public static boolean cc_equal(final int[] a, final int[] b) {
		if(a.length != b.length) {
			return false; 
		} else {
			boolean out = true; 
			for( int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) {
					out = false; 
					break; 
				}
			}
			return out; 
		}
	}
	
	/**
	 * ASCII character index. 
	 * @param args
	 */

	public static void main(String[] args) {
		final String a = "dog"; 
		final String b = "god"; 
		final String c = "God"; 

		System.out.println(is_perm_sort(a, b));
		System.out.println(is_perm_sort(a, c));
		
		System.out.println(is_perm_character_count(a, b));
		System.out.println(is_perm_character_count(a, c));
	}

}
