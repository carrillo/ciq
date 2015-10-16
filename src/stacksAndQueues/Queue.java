package stacksAndQueues;

import linkedLists.Node;

/**
 * Implement a queue using  a list. adding to the tail. 
 * 
 * 1. dequeue: Return the data from the first node. 
 * 2. enqueue: Append data to the last node. 
 * 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class Queue {
	Node first, last; 
	
	public void enqueue(Integer i) {
		if( first == null ) {
			last = new Node(i); 
			first = last; 
		} else {
			last.next = new Node(i);
			last = last.next;
		}
	}
	
	public Object dequeue() {
		if(first != null) {
			Object o = first.data; 
			first = first.next; 
			if(first == null) last = null; 
			return o; 
		} else {
			return null; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
