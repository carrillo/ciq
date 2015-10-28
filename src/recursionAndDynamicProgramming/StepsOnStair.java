package recursionAndDynamicProgramming;

/**
 * A child is running up a stair with n steps. It can make 1, 2, or 3 steps at each time. 
 * How many distinct ways are there? 
 * 
 * Implement 1:  
 * Let's solve this problem how to reach the last step. The kid could have reached it via all three ways, 
 * this generates three new problems which have to be solved. 
 * 
 * The base cases are: 
 * n < 0 -> return 0 (not reachable) 
 * n == 0 -> return 1 (reachable) 
 * 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class StepsOnStair {

	/**
	 * Simple recursive approach. Problem O(n^3) 
	 * @param n
	 * @return
	 */
	public static int countways( final int n ) {
		if( n < 0 ) { // Invalid step 
			return 0; 
		} else if ( n == 0 ) { //Valid step 
			return 1; 
		} else {
			return countways(n-1) + countways(n-2) + countways(n-3); 
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(countways(100)); 

	}

}
