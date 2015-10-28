package arraysAndStrings;

import java.util.Random;

/**
 * Shuffle a deck of cards such that each order of cards is equally likely. 
 * 
 * Let's represent the card faces as unique integers (52). 
 * 
 * 1. Knuth shuffle: Make sure that each element is only considered once for shuffling. 
 * Thus go through each element and swap with a random element which has not been visited yet. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class ShuffleCards {
	
	public static int[] getCards() {
		int[] cards = new int[52]; 
		for( int i = 0; i < cards.length; i++) {
			cards[i] = i; 
		}
		return(cards); 
	}
	
	/**
	 * 
	 * @param in
	 * @return
	 */
	public static void knuth_shuffle(int[] in) {
		for( int i = 0; i < in.length; i++) {
			swap(in, i, getRandomIndex(i, in.length-1));
		}
	}
	
	public static void swap(int[] in, int i1, int i2) {
		int b = in[i1]; 
		in[i1] = in[i2]; 
		in[i2] = b; 
	}
	
	public static int getRandomIndex(int start, int end) {
		Random rnd = new Random(); 
		return( start + (int) Math.round(rnd.nextDouble() * (double) (end - start))); 
	}
	
	public static String cardsToString(final int[] cards) {
		String s = ""; 
		for( Integer i : cards) {
			s += i + ";"; 
		}
		return s; 
	}

	public static void main(String[] args) {
		final int[] cards = getCards(); 
		System.out.println(cardsToString(cards));
		knuth_shuffle(cards);
		System.out.println(cardsToString(cards));
		
	}

}
