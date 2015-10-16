package linkedLists;

import java.util.HashSet;

/**
 * Remove dublicates from a linked list. 
 * 
 * Implementation: 
 * 1. O(n): Use HashTable to track previous values (if buffer is allowed).  
 * 2. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class RemoveDuplicates {

	public static void deleteDups_hash(Node node) {
		HashSet<Object> values = new HashSet<Object>(); 
		
		Node n = node; 
		Node previous = null; 
		while(n.next != null) {
			if(values.contains(n.data)) {
				previous.next = n.next; 
			} else {
				values.add(n.data); 
				previous = n; 
			}
			n = n.next; 
		}
	}
	
	/**
	 * Have two pointers. 
	 * The leading one iterates through the linked list. 
	 * The trailing one compares to all values and remembers the previous node. 
	 * If matching, the trailing pointer connects the previous one to its next. 
	 * @param n
	 */
	public static void deleteDups_two_pointers(Node n) {
		final Node entryNode = n;
		
		Node p1 = n;
		Node p2 = null;
		Node p2Prev = null; 
		while( p1.next != null) {
			p2 = n; 
			p2Prev = null; 
			while(p2 != p1) {
				if( p2.data == p1.data ) {
					p2Prev.next = p2.next; 
				} else {
					p2Prev = p2; 
				}
				p2 = p2.next; 
			}
			p1 = p1.next; 
		}
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
		deleteDups_two_pointers(n);
		System.out.println(n); 
	}

}
