package mathematicsAndProbabilities;

public class Probabilities {

	/**
	 * Question 1: You have a coin with p. You win game 1 if you get a head, you win game 2 if you get at 
	 * least two heads from 3 trials. Which game to choose as a function of p. 
	 * 
	 * Answer: 
	 * Game 1: P(Success) = p 
	 * Game 2: P(Success) = P(3 heads) + P(2 heads) = p^3 + 3*p^2*(p-1) = p^3 + 3p^2 - 3p^3 = 3p^2 - 2p^3
	 * -> p = 3p^2 + 2p^3 
	 * -> 1 = 3p + 2p^2
	 * -> 0 = 2p^2 - 3p + 1 
	 * -> 0 = (2p-1)(p-1)
	 * Same probability for game 1 and 2 if p = 1 (trivial) and p = 0.5
	 */
	
	/**
	 * Question 2: There are 3 ants on different vertices of a triangle. Each ants choose independently 
	 * a direction. how likely is it that they don't collide? 
	 * 
	 * No collision only if all ants choose the same direction: p^3 + (p-1)^3 
	 * @author fernando carrillo (fernando@carrillo.at)
	 *
	 */

	/**
	 * Question 3: Bobo the amoeba has a 25%, 25%, and 50% chance of producing 0, 1, or 2 offspring, respectively. 
	 * Each of Bobo’s descendants also have the same probabilities. What is the probability that Bobo’s lineage 
	 * dies out?  
	 * 
	 * P(F) = P(x0=0) + P(x1=0|x0=1) + P(x11=0,x12=0|x0=2) 
	 * Since all the generations have the same probability of dying out P we can rewrite 
	 * P = P(0) + P(1)*P + P(2)*P^2
	 * P = 0.25 + 0.25P + 0.5P^2
	 * 2P^2 - 3P + 1 = 0
	 * (2P -1)(P-1) = 0 
	 * P = 1 or P = 0.5 
	 *  
	 * @author fernando carrillo (fernando@carrillo.at)
	 *
	 */

}
