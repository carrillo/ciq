package linkedLists;

/**
 * Delete the current node of the linked list. This
 * node does not have to be the head. We don't have access
 * to the previous one. 
 * 
 * Implementation: 
 * Copy the data from the next node and delete the next node. 
 * @author fernando carrillo (fernando@carrillo.at)
 *
 */
public class DeleteCurrentNode {
	
	public static void deleteCurrentNode(Node k) {
		//Copy data from next node. 
		k.data = k.next.data; 
		//Delete next node
		k.next = k.next.next; 
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
		
		Node k = n;
		for( int i = 0; i < 5; i++) { k = k.next; }
		
		System.out.println(n);
		deleteCurrentNode(k);
		System.out.println(n);


	}

}
