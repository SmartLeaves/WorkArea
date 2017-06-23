package com.vimal.test;

import java.util.HashMap;

public class MyLListExp {

	public static Node headA, headB, tail;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		headA = new Node(10);
		Node node = headA;
		node = node.addNode(node, 20);
		node = node.addNode(node, 30);
		node = node.addNode(node, 40);
		node = node.addNode(node, 50);
		
		headB = new Node(60);
		node = headB;
		node = node.addNode(node, 70);
		node = node.addNode(node, 80);
		node = node.addNode(node, 30);
		node = node.addNode(node, 40);
		node = node.addNode(node, 50);
		
		HashMap<Integer, Node> mapA = new HashMap<>();
		
		node = headA;
		while( node.next !=null){
		
			System.out.println("A - "+node.data);
			mapA.put(node.data, node);
			node=node.next;
			
		}
		
		node = headB;
		while( node.next !=null){
		
			System.out.println("B - "+node.data);
			if (mapA.get(node.data)!=null){
				
			}
			node=node.next;
		}
		
		node = getIntersection(headB, mapA);
		if (node!= null)
			System.out.println(" Found -> "+ node.data);
		else
			System.out.println("Not found");
	}
	
	public static Node getIntersection(Node head, HashMap<Integer, Node> hMap){
		while (head.next != null){
			if (hMap.get(head.data)!=null)
				return head;
			head=head.next;
		}
		
		return null;
	}
	

}

class Node {
	
	int data;
	Node next;
	
	public Node (int data){
		this.data = data;
		this.next = null;
	}
	
	public int getData(Node N){
		return N.data;
	}
	
	public Node addNode(Node N, int data){
		
		Node node = new Node(data);
		N.next = node;
		return node;
	}
	
}
