package com;

public class SymmetricTree {

	public boolean mirror(TreeNodes r1, TreeNodes r2) { //Checks the sub trees, The tree is symmetric is the left subtree is equal to the right sub tree
		
		if(r1 == null && r2 == null) { //If the tree is empty then they are symmetric
			return true;
		}
		
		if(r1 == null || r2 == null) {//If one is empty and one is not then they are not symmetric
			return false;
		}else {
			
			return(r1.val == r2.val && mirror(r1.left,r2.right) && mirror(r1.right,r2.left)); //They are symmetric is the values are the same and the left subtree is symmetric to the right sub tree
		}
	}
    public boolean isSymmetric(TreeNodes root) { //Since this has only one argument, I made another function
        
    	return mirror(root,root);
    }
	public static void main(String[] args) {
		
		SymmetricTree st = new SymmetricTree();
		
		TreeNodes root1 = new TreeNodes(1);//Makes the tree
		root1.left = new TreeNodes(1);
		root1.right = new TreeNodes(1);
		root1.left.left = new TreeNodes(1);
		root1.left.right = new TreeNodes(1);
		root1.right.left = new TreeNodes(1);
		root1.right.right = new TreeNodes(1);
		
		boolean value = st.isSymmetric(root1);
		
		if(value == true) {
			System.out.println("Tree is symmetric");
		}else {
			System.out.println("Tree is not symmetric");
		}
	}

}
