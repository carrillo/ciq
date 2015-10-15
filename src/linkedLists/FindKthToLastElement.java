

package linkedLists;
import java.io.ObjectInputStream.GetField;

/**
 * Get last k elements of linked list. 
 * 
 * Implementation: 
 * 1. O(2*n): Count length and then move to the right position. 
 * 2. O(n) time: Two pointers p1, p2. Move p2 k nodes away. Move p1 and p2 until p2 hits end. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class FindKthToLastElement {
	
	public static int get_length(Node n) {
		int c = 1; 
		while( n.next != null) {
			c++; 
			n = n.next; 
		}
		return c; 
	}
	
	/**
	 * Naive implementation. Count length and move. 
	 * @param n
	 * @param k
	 * @return
	 */
	public static Node get_last_k_Node_naive(final Node n, final int k) {
		int l = get_length(n); 
		int node_i = l-k; 
		
		if(node_i < 0) {
			return null; 
		} else {
			Node out = n; 
			for( int i = 0; i < node_i; i++) { out = out.next; }
			return out;
		}
	}

	public static Node getLastKNodesTwoPointers(final Node head, final int k) {
		Node p1 = head; 
		Node p2 = head; 
		
		//Move p1 forward by k, check if you don't hit the end. 
		for( int i = 1; i < k; i++) {
			if(p1.next == null ) {
				return null; 
			} else {
				p1 = p1.next; 
			}
		}
		
		// Move p1 and p2 simultanesoulsy 
		while(p1.next != null) {
			p1 = p1.next; 
			p2 = p2.next; 
		}
		
		return p2; 
	}
	
	
	public static void main(String[] args) {
		Node n = new Node(1);
		n.appendToTail(4);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(2);
		n.appendToTail(5);
		n.appendToTail(6);
		n.appendToTail(6);
		n.appendToTail(7);
		
		System.out.println(n);
		
		int k = 4;  
		Node l = get_last_k_Node_naive(n, k);
		System.out.println(l);
		
		Node m = getLastKNodesTwoPointers(n, k);
		System.out.println(m);
	}
}
