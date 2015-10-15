package stacksAndQueues;

import java.util.ArrayList;

/**
 * Implement a stack of stack which behaves identical as the normal stack Pop, Push O(1), 
 * but creates a new stack once the max capacity is reached. 
 * 
 * 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class StackOfStacks {

	ArrayList<Integer[]> sos = new ArrayList<Integer[]>();
	int[] index = new int[2]; 
	int max_cap; 
	
	public StackOfStacks(final int max_cap) {
		this.max_cap = max_cap; 
		this.sos.add(new Integer[max_cap]); 
	}
	
	public void push(Integer i) {
		if(index[1] + 1 < max_cap) {
			index[1]++; 
		} else {
			sos.add(new Integer[max_cap]);
			index[0]++; 
			index[1] = 0; 
		}
		sos.get(index[0])[index[1]] = i; 
	}
	
	public Integer pop() { 
		if(index[0] == 0 && index[1] == 0) {
			return null; 
		} else {
			Integer out = sos.get(index[0])[index[1]]; 
			if(index[1] + 1 < max_cap) {
				index[1]--; 
			} else {
				sos.remove(index[0]); 
				index[0]--; 
				index[1] = 0; 
			}
			return out; 
		}
	}
	
	public static void main(String[] args) {
		StackOfStacks sos = new StackOfStacks(10); 
		
		for( int i = 0; i < 100; i++ ) {
			sos.push(i);
			System.out.println(i + "\t" + sos.index[0] + "\t" + sos.index[1]); 
		}
		
		
	}
}
