package com;

public class BalancedBinaryTree {
	
	public int height(TreeNodes root) {
		
		if(root == null) {
			return 0;
		}else {
			return (Math.max(height(root.left), height(root.right))) + 1;
		}
	}
    public boolean isBalanced(TreeNodes root) {
     
    	if(root == null) {//If the tree is empty, then the depth is 0
    		return true;
    	}else {
    		
    		int left_depth = height(root.left);//Counts all the left nodes
    		int right_depth = height(root.right);//Counts all the right nodes
    		
    		if(Math.abs(left_depth - right_depth) > 1) {//Returns the highest number, we add one because we have to include the root
    			return false;
    		}else {
    			return (isBalanced(root.left) && isBalanced(root.right));
    		}
    	}
    }
	public static void main(String[] args) {
		
		BalancedBinaryTree bbt = new BalancedBinaryTree();

		TreeNodes root1 = new TreeNodes(1);//Makes the tree
		root1.left = new TreeNodes(2);
		root1.right = new TreeNodes(3);
		root1.right.right = new TreeNodes(4);
		root1.right.right.right = new TreeNodes(5);
		
		boolean decision = bbt.isBalanced(root1);
		
		if(decision == true) {
			System.out.println("Tree is balanced");
		}else {
			System.out.println("Tree is not balanced");
		}
	}

}
