package stacksAndQueues;

/**
 * Implement three stacks with a single array. 
 * 
 * Questions: Do we know how many elements per stack max? 
 * 
 * Implementations: 
 * 1. Use three blocks with pointers (fixed size) 
 * 2. Use flexible size (way more work). 
 *  
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class ThreeStackArray {

	public Integer[] values; 
	public int[] pointers; 
	public int max; 
	
	public ThreeStackArray(final int max_perstack) {
		this.max = max_perstack; 
		this.values = new Integer[max_perstack*3];
		this.pointers = new int[3]; 
		for( int i = 0; i < 3; i++) {
			pointers[i] = i*max_perstack - 1; 
		}
	}
	
	/**
	 * Check if the current pointer is still within its area. 
	 * If not return false, do nothing. 
	 * Else move pointer and add value. 
	 * @param i
	 * @param stack_nr
	 * @return
	 */
	public boolean push(int i, int stack_nr) {
		if(pointers[stack_nr] < ((stack_nr+1)*max-1) ) {
			pointers[stack_nr]++; 
			values[pointers[stack_nr]] = i; 
			return true; 
		} else {
			return false; 
		}
	}
	
	public Integer pop(int stack_nr) {
		if(pointers[stack_nr] >= ((stack_nr)*max) ) {
			Integer out = values[pointers[stack_nr]]; 
			values[pointers[stack_nr]] = null; 
			pointers[stack_nr]--; 
			return out; 
		} else {
			return null; 
		}
	}
	
	public static void main(String[] args) {
		
		final ThreeStackArray t = new ThreeStackArray(10);
		for( int i = 0; i < 15; i++ ) {
			t.push(1, 0);
			t.push(2, 1);
			t.push(3, 2);
		}
		
		for( int i = 0; i < t.values.length; i++) {
			System.out.print( t.values[i] + "," ); 
		}
		
		for( int i = 0; i < 15; i++ ) {
			System.out.println(t.pop(0));
			System.out.println(t.pop(1));
			System.out.println(t.pop(2));
		}
		
		for( int i = 0; i < t.values.length; i++) {
			System.out.print( t.values[i] + "," ); 
		}
		
	}

}
