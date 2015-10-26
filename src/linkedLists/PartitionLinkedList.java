package linkedLists;

/**
 * Write code to partition a linked list around a value x, such that all nodes lesser than x are preceeding 
 * all nodes larger or equal than x.
 * 
 * Implement into two lists join in the end. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class PartitionLinkedList {

	public static Node partitionLL(Node n, final int x) {
		
		Node smallerHead = null;
		Node smallerTail = null;
		Node largerHead = null; 
		Node largerTail = null; 
		
		while( n != null ) {
			Node next = n.next;
			n.next = null; 
			if ((Integer) n.data < x) {
				if(smallerHead == null) { // Add node to empty linked list. 
					smallerHead =  n; 
					smallerTail = smallerHead; 
				} else { // Add node to linked list
					smallerTail.next = n; 
					smallerTail = smallerTail.next; 
				} 
			} else {
				if(largerHead == null) { // Add node to empty linked list.
					largerHead = n; 
					largerTail = largerHead; 
				} else {// Add node to linked list
					largerTail.next = n; 
					largerTail = largerTail.next; 
				}
			}
			n = next; 
		}
		
		// Return merged list if both have entries. 
		if( smallerHead == null ) {
			return largerHead; 
		} else {
			smallerTail.next = largerHead;
			return smallerHead; 
		}
	}

	public static void main(String[] args) {
		Node n = new Node(7);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(2);
		n.appendToTail(5);
		n.appendToTail(2);
		n.appendToTail(6);
		n.appendToTail(-1);
		
		System.out.println(n);
		
		Node p = partitionLL(n, 3);
		System.out.println(p); 
	}
}
