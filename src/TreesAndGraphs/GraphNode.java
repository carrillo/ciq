package TreesAndGraphs;

import java.util.ArrayList;
import java.util.Queue;

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
	
	private ArrayList<Object> bfs(Queue<GraphNode> q) {
		ArrayList<Object> out = new ArrayList<Object>(); 
		
		
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
