package com;

public class MinDepth {
	
    public int minDepth(TreeNodes root) {
        
    	if(root == null) {
    		return 0;
    	}else {
    		
    		int leftDepth = minDepth(root.left);
    		int rightDepth = minDepth(root.right);
    		
    		if(leftDepth<rightDepth) {
    			
    			return leftDepth + 1;
    		}else {
    			
    			return rightDepth + 1;
    		}
    	}
    }

	public static void main(String[] args) {
		
		MinDepth min = new MinDepth();
		
		TreeNodes root1 = new TreeNodes(1);//Makes the tree
		root1.left = new TreeNodes(2);
		root1.right = new TreeNodes(1);
		
		
		int depth = min.minDepth(root1);//Finds the minimum depth of the tree
		
		System.out.println("The tree has a minimum depth of " + depth);


	}

}
