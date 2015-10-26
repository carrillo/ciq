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
		
		
		return null; 
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
		
		Node p = partitionLL(n, 3);  
	}
}
