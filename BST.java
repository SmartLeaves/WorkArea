package com.vimal.Test;

public class BST{
	Node root;
	
	public boolean isBST() {
		return isBSTUtil(root, Integer.MIN_VALUE,
							Integer.MAX_VALUE);
	}
	
	public boolean isBSTUtil(Node root, int min, int max){
		if (root==null) return true;
		
		if (root.info < min || root.info > max)
			return false;
		else return (isBSTUtil(root.left,min,root.info-1 )&& isBSTUtil(root.right, root.info+1, max));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BST b = new BST();
		b.root= new Node(10);
		b.root.left = new Node(25);
		b.root.right = new Node(15);
		System.out.println("IS BST -> "+b.isBST());
	}

}


class Node {
	int info;
	Node left, right;
	
	public Node(int info){
		this.info=info;
		this.left=null;
		this.right=null;
	}
	
}


