package mathematicsAndProbabilities;

/**
 * Q: Write a method to estimate the square-root of a number. 
 * 
 * Questions: 
 * - Is the number non-negative? 
 * - Is the number real? 
 * - Which precission 
 * 
 * Implementation1: Babylonian method.
 * Concept: Average overestimate and underestimate.
 * Overestimate: x then S/x must be an underestimate. 
 * Repeat on update until convergence.  
 * Algorihtm: Start with arbitrary initial guess, generate mean, recurse until convergence. 
 * 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class MathAlgorithms {
	
	/**
	 * Estimate the square-root of s with a precission of e. 
	 * @param S
	 * @param e
	 * @return
	 */
	public static double square_root_babylonian(final double s, final double e) {
		//Initiate guess
		double curr_estimate = s; 
		double last_estimate = Double.MAX_VALUE; 
		
		//Iterate until convergence 
		while( Math.abs(curr_estimate - last_estimate) > e) { 
			last_estimate = curr_estimate;
			curr_estimate = 0.5*(last_estimate + s/last_estimate); 
		}
		
		return curr_estimate; 
	}
	
	/**
	 * Estimate the square-root of s, starting with an initial guess of g with a precission of e. 
	 * @param s
	 * @param g
	 * @param e
	 * @return
	 */
	public static double square_root_babylonian_recursive(final double s, final double g, final double e) {
		double g_new = 0.5*(g + s/g); 
		if( Math.abs(g_new - g) > e) {
			return square_root_babylonian_recursive(s, g_new, e); 
		} else {
			return g_new; 
		}
	}
	
	public static void main(String[] args) {
		System.out.println(square_root_babylonian(125993348, 0.00001));
		System.out.println(square_root_babylonian_recursive(125993348, 125993348, 0.00001));
	}

}
