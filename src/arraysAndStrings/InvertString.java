package arraysAndStrings;

/**
 * Invert string. 
 * 
 * 1. Naive solution: Copy. 
 * 2. Non-naive solution: Inplace. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */

public class InvertString {

	/**
	 * Naive implemenation. Copy to new char[] 
	 * @param in
	 * @return
	 */
	public static String naive(final char[] in) {
		final char[] out = new char[in.length]; 
		
		for(int i = (in.length -2); i >= 0; i--) {
			out[in.length-2-i] = in[i]; 
		}
		out[in.length-1] = in[in.length-1]; 
		
		return(new String(out)); 
	}
	
	/**
	 * In place string reversal 
	 * @param args
	 */
	public static String inplace(final char[] in) {
		int i = 0; 
		int j = in.length -2; 
		char b; 
		while(i < j) { 
			b = in[i]; 
			in[i] = in[j]; 
			in[j] = b; 
			i++; 
			j--; 
		}
		return(new String(in)); 
	}

	
	public static void main(String[] args) {
		char[] s = "hallow orld.X".toCharArray(); 
		System.out.println(naive(s));
		System.out.println(inplace(s));
	}

}
