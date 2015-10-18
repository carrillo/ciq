package TreesAndGraphs;

import java.util.ArrayList;

import stacksAndQueues.Queue;

public class GraphNode {

	public ArrayList<GraphNode> neighbors;
	public boolean visited; 
	public Object data; 
	
	public GraphNode(Object data) {
		this.data = data; 
		this.neighbors = new ArrayList<GraphNode>(); 
	}
	
	/**
	 * convenient method for example. 
	 */
	private void addNeighbors(final GraphNode[] ns) {
		for(GraphNode n : ns) {
			this.neighbors.add(n); 
		}
	}
	
	/**
	 * Breath first search. 
	 * @param q
	 * @return
	 */
	private ArrayList<Object> bfs(Queue q) {
		//Special first case. we are at root node and is not visited. 
		this.visited = true; 
		
		//Collect data for each unvisited node. 
		ArrayList<Object> out = new ArrayList<Object>(); 
		for( GraphNode n : neighbors ) {
			if(!n.visited) {
				out.add(n.data); 
				n.visited = true; 
				q.enqueue(n);
			}
		} 
		
		GraphNode n = (GraphNode) q.dequeue();
		if(n != null) {
			out.addAll(n.bfs(q));
		}
		return out; 
	}
	
	/**
	 * 
	 *     a,b
	 *     a,c
	 *     a,e
	 *     b,c
	 *     b,d
	 *     c,e
	 *     d,e
	 *     d,f
	 *     e,f
	 * 
	 * @return
	 */
	public static GraphNode exampleGraph() {
		GraphNode a = new GraphNode("a"); 
		GraphNode b = new GraphNode("b"); 
		GraphNode c = new GraphNode("c"); 
		GraphNode d = new GraphNode("d"); 
		GraphNode e = new GraphNode("e"); 
		GraphNode f = new GraphNode("f");
		
		a.addNeighbors(new GraphNode[]{b,c,e});
		b.addNeighbors(new GraphNode[]{c,d});
		c.addNeighbors(new GraphNode[]{e});
		d.addNeighbors(new GraphNode[]{e,f});
		e.addNeighbors(new GraphNode[]{f});
		return a; 
	}
	
	public String toString() { 
		return this.data.toString(); 
	}
	
	
	public static void main(String[] args) {
		GraphNode ex = exampleGraph(); 
		ArrayList<Object> nodes = ex.bfs(new Queue());
		for( Object o : nodes ) {
			System.out.println(o); 
		}

	}

}
