package arraysAndStrings;

/**
 * Repalce all spaces in a string with '%20'. 
 * 
 * Q: Is the String represented as an char[]? 
 * Q: Do we have enough space on the end of the string to perform inplace substitution? 
 * 
 * Implementation:
 * 1. Naive: Write to new string. Time O(n), Space O(4n). 
 * 2. In place: 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */

public class ReplaceCharacters {

	public static String naive_replace(final String s) {
		char[] in = s.toCharArray(); 
		char[] out = new char[s.length()*3]; // Assume that all characters in string are replaced. 
		
		int j = 0; 
		for( int i = 0; i < in.length; i++) {
			if( in[i] != ' ') {
				out[j] = in[i]; 
			} else {
				out[j] = '%'; 
				j++; 
				out[j] = '2'; 
				j++; 
				out[j] = '0'; 
			}
			j++; 
		}
		return new String(out); 
	}
	
	public static String inplace_replace(final char[] s) { 
		// Count number of whitespace
		int wc = 0; 
		for( Character c : s ) {
			if( c == ' ' ) {
				wc++; 
			}
		}
		
		// Shift (3*number of spaces) or replace ('%20') characters
		// Start from the end. 
		for( int i = s.length -1; i >= 0; i--) {
			if( s[i] == 0 ) {
				continue; 
			} else {
				if(s[i] == ' ') { // If we encounter a whitespace replace
					wc--;
					s[i + wc * 3] = '%'; 
					s[i + wc * 3 + 1] = '2'; 
					s[i + wc * 3 + 2] = '0'; 
				} else { // If not, shift by wc * 3
					s[i + wc * 3] = s[i]; 
				}
			}
		}
		
		return new String(s); 
	}
	
	public static char[] stringToLongCharArray(final String s) {
		//Conversion to long enough character array. This should be done in  
		char[] c = new char[3*s.length()]; 
		char[] sarray = s.toCharArray(); 
		for( int i = 0; i < s.length(); i++) {
			c[i] = sarray[i]; 
		}
		return(c); 
	}
	
	public static void main(String[] args) {
		String s = "Mr John Smith"; 
		System.out.println(naive_replace(s)); 
		System.out.println(inplace_replace(stringToLongCharArray(s))); 

	}

}
