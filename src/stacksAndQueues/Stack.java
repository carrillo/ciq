package stacksAndQueues;

import linkedLists.Node;

/**
 * Implement stack (FIFO) with linked list. 
 * 1. Pop: Return last added item and move pointer to next one. 
 * 2. Push: Generate new item and connect to exisiting stack. 
 * 3. Peak: Get data of current item on top.  
 * 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class Stack {

	private Node top = null;
	
	public Object pop() {
		if( this.top != null ) {
			return null; 
		} else {
			Object out = top.data;
			top = top.next; 
			return out; 
		}
	}
	
	public void push(final Integer i) {
		Node n = new Node(i);
		n.next = top; 
		top = n; 
	}
	
	public Object peak() { 
		return top.data; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
