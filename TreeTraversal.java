package com.vimal.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeTraversal tr= new TreeTraversal();
		Node root = tr.CreateRoot(1);
		Node head=root;
		tr.addLeft(root, 2);
		tr.addRight(root, 3);
		head=root.left;
		tr.addLeft(head, 4);
		tr.addRight(head, 5);
		head=root.right;
		tr.addLeft(head, 6);
		tr.addRight(head, 7);
		/*System.out.println("In Order");
		tr.inorderT(root);
		System.out.println("Pre  Order");
		tr.preorderT(root);
		System.out.println("Post Order");
		tr.postorderT(root);*/
		tr.depthFirst(root);
		
	
	}
	
	
	public class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data=data;
			this.left=this.right=null;
		}
	}
	
	public Node CreateRoot(int data){
		Node N = new Node(data);
		System.out.println("Root created");
		return N;
	}

	public void addLeft(Node root, int data){
		Node t = new Node(data);
		root.left=t;
		//System.out.println("Left added "+data);
	}
	public void addRight(Node root, int data){
		Node t = new Node(data);
		root.right=t;
		//System.out.println("Right added "+data);
	}
	public  void inorderT(Node root){
		if (root ==null) return;
		inorderT(root.left);
		System.out.println(root.data +" ");
		inorderT(root.right);
	}
	public  void preorderT(Node root){
		if (root ==null) return;
		System.out.println(root.data +" ");
		preorderT(root.left);
		preorderT(root.right);
	}
	public  void postorderT(Node root){
		if (root ==null) return;
		postorderT(root.left);
		postorderT(root.right);
		System.out.println(root.data +" ");
		
	}
	//Depth first Search
	
	public void depthFirst(Node root){
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			Node t = q.poll();
			System.out.println(t.data);
			if(t.left!=null)
				q.add(t.left);
			if(t.right!=null)
				q.add(t.right);
		}
		
		
		
	}
	
	
	
	
}
