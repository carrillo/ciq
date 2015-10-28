package treesAndGraphs;

import java.util.ArrayList;

public class TreeNode {
	
	public TreeNode left, right; 
	public Object data; 
	
	public TreeNode(Object data) {
		this.data = data; 
	}
	
	/**
	 * Implement preorder tree traversal: 
	 * root -> left -> right
	 */
	public ArrayList<Object> preorder() {
		ArrayList<Object> out = new ArrayList<Object>(); 
		out.add(this.data); 
		if(left != null) { out.addAll(left.preorder()); }
		if(right != null) { out.addAll(right.preorder()); }
		return out;  
	}
	
	/**
	 * Implement postorder tree traversal: 
	 * left -> right -> root 
	 */
	public ArrayList<Object> postorder() {
		ArrayList<Object> out = new ArrayList<Object>(); 
		if(left != null) {out.addAll(left.postorder());}
		if(right != null) {out.addAll(right.postorder());}
		out.add(data); 
		return out; 
	}
	
	/**
	 * Implement postorder tree traversal: 
	 * left -> right -> root 
	 */
	public ArrayList<Object> inorder() {
		ArrayList<Object> out = new ArrayList<Object>(); 
		if(left != null) {out.addAll(left.inorder());}
		out.add(data); 
		if(right != null) {out.addAll(right.inorder());}
		return out; 
	}
	
	/**
	 * Returns example tree for training purpose.
	 * 
	 *  							f
	 *  						   / \
	 *  						  /   \
	 *                           D     J
	 *                          / \   / \
	 *                         /   \ /   \
	 *                        B    E G    K
	 *                       / \      \
	 *                      /   \      \
	 *                     A     C      I
	 * @return Root node f
	 */
	public static TreeNode example_tree() {
		//Build tree 
		final TreeNode b = new TreeNode("b"); 
		b.left = new TreeNode("a"); 
		b.right = new TreeNode("c"); 
		
		final TreeNode d = new TreeNode("d"); 
		d.left = b; 
		d.right = new TreeNode("e"); 
		
		
		final TreeNode g = new TreeNode("g"); 
		g.right = new TreeNode("i"); 
		
		final TreeNode j = new TreeNode("j"); 
		j.left = g; 
		j.right = new TreeNode("k"); 
		
		final TreeNode f = new TreeNode("f"); 
		f.left = d; 
		f.right = j;  
		
		return f; 
	}
	
	public static void main(String[] args) {
		final TreeNode example_tree = example_tree();
		
		for( Object o : example_tree.preorder() ) {
			System.out.println(o); 
		}
		
		
	}

}
