package arraysAndStrings;

import java.util.ArrayList;

/**
 * Implement your own version of a string buffer. 
 * The String buffer should help concatenated strings without copying the String every time.
 * 
 *  What we want to do here is to collect all incoming Strings and store them. We concatenate 
 *  only when needed. We perform this via a character array. 
 *  
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */

public class StringBuffer {

	private ArrayList<String> buffer;
	private int length; 
	
	public StringBuffer() {
		this.buffer = new ArrayList<String>();
		this.length = 0; 
	}
	
	public void append(final String s) {
		this.buffer.add(s); 
		length += s.length(); 
	}
	
	public String concatenate() {
		final char[] out = new char[this.length]; 
		
		int out_i = 0; 
		for( String s : this.buffer) {
			for( char c : s.toCharArray() ) {
				out[out_i] = c; 
				out_i++; 
			}
		}
		return(new String(out)); 
	}
	
	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer(); 
		sb.append("hallo");
		sb.append(" world");
		System.out.println(sb.concatenate()); 
	}

}
