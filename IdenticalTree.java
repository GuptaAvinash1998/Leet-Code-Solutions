package com;

class TreeNodes{
	int val;
	TreeNodes left;
	TreeNodes right;
	
	TreeNodes(int x){ val = x; }
}

public class IdenticalTree {
	
public boolean isSameTree(TreeNodes p, TreeNodes q) {
    	
    	
    	if(p == null && q == null) { //If both trees are empty, then the trees are the same
    		return true;
    	}
    	
    	if(p == null || q == null) { //If one is empty and one is not then the trees are not the same
    		return false;
    	}else {
    		return(p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)); //If both have child nodes, then it first checks if the two nodes have the same, then it checks for the left subtree and the rigth sub tree
    	}
    }
	public static void main(String[] args) {
		
		IdenticalTree it = new IdenticalTree();
		
		TreeNodes root1 = new TreeNodes(1);//Creates the first tree
		root1.left = new TreeNodes(2);
		root1.right = new TreeNodes(3);
		
		TreeNodes root2 = new TreeNodes(4);//Creates the second tree
		root2.left = new TreeNodes(5);
		root2.right = new TreeNodes(6);
		
		boolean value = it.isSameTree(root1, root2);//Checks if the two given trees are the same
		
		if(value == true) {
			System.out.println("The trees are the same");
		}else {
			System.out.println("The trees are not the same");
		}
	}


}
