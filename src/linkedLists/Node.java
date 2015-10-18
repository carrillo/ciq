package linkedLists;

import java.util.ArrayList;

public class Node {
	
	public Node next = null;
	public Object data; 
	
	public Node(Object o) {
		this.data = o; 
	}
	
	public void appendToTail(int d) {
		Node node = new Node(d); 
		Node n = this; 
		while( n.next != null ) {
			n = n.next; 
		}
		n.next = node; 
	}
	
	public ArrayList<Object> toArrayList() {
		ArrayList<Object> al = new ArrayList<Object>(); 
		Node n = this; 
		do { 
			al.add(n.data);
			n = n.next; 
		} while(n.next != null);  
		al.add(n.data); 
		return(al); 
	}
	
	// Inefficient, just a hack. 
	public String toString() {
		ArrayList<Object> al = toArrayList(); 
		String s = ""; 
		for( Object i : al ) { s += i.toString() + ","; }
		return s; 
	}

	public static void main(String[] args) {
		Node n = new Node(1); 
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(2);
		n.appendToTail(5);
		
		System.out.println(n.toString()); 

	}

}
